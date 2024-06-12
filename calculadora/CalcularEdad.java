// Este archivo define una clase llamada "CalcularEdad" en el paquete "edad".
// Su objetivo principal es proporcionar una calculadora para determinar la edad de una persona.
// Primero, importa la clase "ListaOpciones" del paquete "Opciones" para mostrar las opciones disponibles en la calculadora.
// Luego, solicita al usuario que elija entre calcular su edad o salir del programa.
// Si elige calcular la edad, solicita al usuario su fecha de nacimiento y la fecha actual, y utiliza el método "calcularEdad" para determinar la edad.
// El método "calcularEdad" calcula la edad utilizando las fechas proporcionadas, teniendo en cuenta si el cumpleaños ya ocurrió en el año actual.
// Finalmente, imprime la edad calculada en la consola. Si el usuario elige una opción no válida, muestra un mensaje de error.

package calculadora;

import mis_metodos.ListaOpciones;

import java.util.Scanner;

public class CalcularEdad {
    public static void calculadora() {
        String[] ListaDeOpciones = {
                "Calcular Edad", "Salir"
        };
        ListaOpciones.cargarOpciones(ListaDeOpciones);


        Scanner into0pcion = new Scanner(System.in);
        System.out.print("[?] ");
        int opcion = into0pcion.nextInt();

        switch (opcion) {
            case 1:
                calcularEdad();
                break;
            case 2:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static void calcularEdad() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su año de nacimiento: ");
        int yearOfBirth = scanner.nextInt();

        System.out.print("Ingrese su mes de nacimiento (1-12): ");
        int monthOfBirth = scanner.nextInt();

        System.out.print("Ingrese su día de nacimiento: ");
        int dayOfBirth = scanner.nextInt();

        System.out.print("Ingrese el año actual: ");
        int currentYear = scanner.nextInt();

        System.out.print("Ingrese el mes actual (1-12): ");
        int currentMonth = scanner.nextInt();

        System.out.print("Ingrese el día actual: ");
        int currentDay = scanner.nextInt();

        int edad = calcularEdad(yearOfBirth, monthOfBirth, dayOfBirth, currentYear, currentMonth, currentDay);

        System.out.printf("Tienes %d años.%n", edad);
    }

    public static int calcularEdad(int yearOfBirth, int monthOfBirth, int dayOfBirth, int currentYear, int currentMonth, int currentDay) {
        int edad = currentYear - yearOfBirth;

        // Si el cumpleaños no ha ocurrido este año, restar uno a la edad
        if (currentMonth < monthOfBirth || (currentMonth == monthOfBirth && currentDay < dayOfBirth)) {
            edad--;
        }

        return edad;
    }

    public static void main(String[] args) {
        calculadora();
    }
}

