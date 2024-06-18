// Este archivo define una clase llamada "metros" en el paquete "conversion". Su función principal es proporcionar una calculadora para convertir entre kilómetros y metros.
// Primero, importa la clase "ListaOpciones" del paquete "Opciones" para mostrar las opciones disponibles en la conversión.
// Luego, utiliza un escáner para que el usuario elija entre convertir de kilómetros a metros o de metros a kilómetros.
// Dependiendo de la opción seleccionada, solicita al usuario la cantidad de la distancia en la unidad correspondiente y realiza la conversión utilizando los métodos "kilometrosToMetros" o "metrosToKilometros", respectivamente.
// Finalmente, imprime el resultado de la conversión en la consola. Si el usuario ingresa una opción no válida, muestra un mensaje de error.


package conversor;
import mis_metodos.ListaOpciones;
import mis_metodos.MIsMetodos;

import java.util.Scanner;

public class metros {
    public static void calculadora() {
        String[] ListaDeOpciones = {
                "KM/M", "M/KM"
        };
        ListaOpciones.cargarOpciones(ListaDeOpciones);
        Scanner into0pcion = new Scanner(System.in);
        System.out.print("[?]");
        int opcion = into0pcion.nextInt();

        MIsMetodos.imprimirLinea();
        switch (opcion) {
            case 1:
                Scanner scannerKmToM = new Scanner(System.in);
                System.out.print("Ingrese la distancia en kilómetros: ");
                double kilometros = scannerKmToM.nextDouble();
                double metros = kilometrosToMetros(kilometros);
                System.out.printf("%.2f kilómetros son %.2f metros.%n", kilometros, metros);
                break;
            case 2:
                Scanner scannerMToKm = new Scanner(System.in);
                System.out.print("Ingrese la distancia en metros: ");
                double metrosInput = scannerMToKm.nextDouble();
                double kilometrosOutput = metrosToKilometros(metrosInput);
                System.out.printf("%.2f metros son %.2f kilómetros.%n", metrosInput, kilometrosOutput);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static double kilometrosToMetros(double kilometros) {
        return kilometros * 1000;
    }

    public static double metrosToKilometros(double metros) {
        return metros / 1000;
    }

    public static void main(String[] args) {
        calculadora();
    }

}

