//importar del nombrepaquete.nombreClase

import Opciones.ListaOpciones;
import grados.celsius;
import matematicas.Mate;
import organizador.Banner;
import programas.IMC;
import conversion.metros;
import edad.CalcularEdad;
import lista.lista_de_compras;

// importar de nombrelibreria.nombrepaquete.nombreclase

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // lista de opciones

        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit/Celsius", "kilometros a metros",
                "Calcular edad", "Lista de compras",
                "Opción_7", "Opción_8",
                "Opción_9", "Salir"
        };

        //trae a la clase banner y trae a su metodo mensaje_1


        boolean progrma = true;
        do{
            Banner.mensaje_1();
            //nombreclase.nombremetodo
            ListaOpciones.cargarOpciones(listaDeOpciones);


            // *@Scanner creando un objeto
            // *@System imprime en consola un mensaje
            // *@int almacena el valor del scanner(into0pcion)
            // *@nextInt() convierte la salida de Scanner en un numero entero()


            Scanner into0pcion = new Scanner(System.in);
            System.out.print("[?]");
            int opcion = into0pcion.nextInt();
            System.out.println("-----------------------------------------------------");

            // cargar opcion del usuario
            switch (opcion){
                case 1:
                    Mate.calculadora();
                    break;
                case 2:
                    IMC.programaIMC();
                    break;
                case 3:
                    celsius.calculadora();
                case 4:
                    metros.calculadora();
                    break;
                case 5:
                    CalcularEdad.calculadora();
                    break;
                case 6:
                    lista_de_compras.programa();
                    break;
                case 7:
                    System.out.println("opcion7");
                    break;
                case 8:
                    System.out.println("opcion8");
                    break;
                case 9:
                    System.out.println("opcion9");
                case 10:
                    progrma = false;
                    break;
            }
        }while (progrma);

    }
}