
// Este programa es una aplicación de consola que ofrece varias opciones al usuario para realizar diferentes cálculos y funciones.
// Importa diversas clases y paquetes para llevar a cabo operaciones matemáticas, conversiones de unidades y otras funciones específicas.
// Utiliza un bucle do-while para mostrar un menú de opciones al usuario y ejecutar la funcionalidad seleccionada según la entrada del usuario.

import Opciones.ListaOpciones;
import grados.celsius;
import matematicas.Mate;
import organizador.Banner;
import programas.IMC;
import conversion.metros;
import edad.CalcularEdad;
import lista.lista_de_compras;
import conversor.Monedas;

// importar de nombrelibreria.nombrepaquete.nombreclase

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // lista de opciones

        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit/Celsius", "kilometros a metros",
                "Calcular edad", "Lista de compras",
                "conversion de monedas", "Opción_8",
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
                    break;
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
                    Monedas.convertir();
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