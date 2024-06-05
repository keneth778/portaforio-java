package conversion;
import Opciones.ListaOpciones;

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

