// Este archivo define una clase llamada "Mate" en el paquete "matematicas".
// Su función es proporcionar una calculadora básica que realiza operaciones matemáticas simples.
// Utiliza la clase "ListaOpciones" del paquete "Opciones" para mostrar las opciones disponibles en la calculadora.
// Luego, permite al usuario elegir entre realizar una suma, resta, multiplicación o división.
// Dependiendo de la opción seleccionada, solicita al usuario los números necesarios para la operación y realiza la operación correspondiente utilizando los métodos definidos en la clase.
// Finalmente, imprime el resultado de la operación en la consola.
// Los métodos definidos en la clase incluyen "sumar", "restar", "multiplicar" y "dividir", que realizan las operaciones matemáticas respectivas y devuelven el resultado.

package calculadora;

import java.util.Scanner;
import mis_metodos.ListaOpciones;
import mis_metodos.MIsMetodos;

public class AritmeticaBasica {
    public static void calculadora() {
        String[] ListaDeOpciones = {
                "suma","resta",
                "multiplicacion","division",

        };
        ListaOpciones.cargarOpciones(ListaDeOpciones);
        // aqui

        Scanner into0pcion = new Scanner(System.in);
        System.out.print("[?]");
        int opcion = into0pcion.nextInt();

        MIsMetodos.imprimirLinea();

        switch (opcion){
            case 1:
                Scanner entrada= new Scanner(System.in);
                System.out.println("ingresa un numero: ");
                int num1 = entrada.nextInt();
                System.out.println("ingresa el otro numero: ");
                int num2 = entrada.nextInt();

                System.out.println("resultado: "+sumar(num1,num2));
                break;

            case 2:
                Scanner entrada2 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int num3 = entrada2.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num4 = entrada2.nextInt();

                System.out.println("RESULTADO: "+restar(num3, num4));
                break;
            case 3:
                Scanner entrada3 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int num5 = entrada3.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num6 = entrada3.nextInt();

                System.out.println("RESULTADO: "+multiplicar(num5, num6));
                break;
            case 4:
                Scanner entrada4 = new Scanner(System.in);
                System.out.print("Ingrese el primer número: ");
                int num7 = entrada4.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num8 = entrada4.nextInt();

                System.out.print("RESULTADO: "+dividir(num7, num8));
                break;


        }


    }
    public static int sumar(int num1, int num2){

        int sumar_num = num1+num2;

        return sumar_num;

    }
    public static int restar(int num1, int num2){
        int restar_num = num1-num2;

        return restar_num;
    }

    public static double dividir(double num1, double num2){
        double dividir = num1/num2;
        return dividir;
    }
    public static int multiplicar(int num1, int num2){
        int multi = Math.multiplyExact(num1, num2);
        return multi;
    }
}