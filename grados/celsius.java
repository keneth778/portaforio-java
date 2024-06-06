// Este archivo define una clase llamada "celsius" en el paquete "grados".
// Su función principal es proporcionar una calculadora para convertir entre grados Celsius y grados Fahrenheit.
// Utiliza la clase "ListaOpciones" del paquete "Opciones" para mostrar las opciones disponibles en la calculadora.
// Luego, utiliza un escáner para que el usuario elija entre convertir de Celsius a Fahrenheit o de Fahrenheit a Celsius.
// Dependiendo de la opción seleccionada, solicita al usuario la temperatura en la unidad correspondiente y realiza la conversión utilizando los métodos "celsiusToFahrenheit" o "fahrenheitToCelsius", respectivamente.
// Finalmente, imprime el resultado de la conversión en la consola. Si el usuario ingresa una opción no válida, muestra un mensaje de error.

package grados;

import Opciones.ListaOpciones;
import java.util.Scanner;

public class celsius {
    public static void calculadora() {
        String[] ListaDeOpciones = {
                "C/F", "F/C"
        };
        ListaOpciones.cargarOpciones(ListaDeOpciones);

        Scanner into0pcion = new Scanner(System.in);
        System.out.print("[?]");
        int opcion = into0pcion.nextInt();

        switch (opcion) {
            case 1:
                Scanner nose = new Scanner(System.in);
                System.out.print("Ingrese la temperatura en grados Celsius: ");
                double celsius = nose.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(fahrenheit);
                break;
            case 2:
                Scanner nose2 = new Scanner(System.in);
                System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                double fahr = nose2.nextDouble();
                double cels = fahrenheitToCelsius(fahr);
                System.out.println(cels);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

