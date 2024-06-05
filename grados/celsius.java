package grados;

import Opciones.ListaOpciones;

import java.util.Scanner;

public class celsius {
    public static void calculadora() {
        String[] ListaDeOpciones = {
                "F/C", "C/F"
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
                break;
            case 2:
                Scanner nose2 = new Scanner(System.in);
                System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
                double fahr = nose2.nextDouble();
                double cels = fahrenheitToCelsius(fahr);
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

