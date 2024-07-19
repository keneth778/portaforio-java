
// Este programa es una aplicación de consola que ofrece varias opciones al usuario para realizar diferentes cálculos y funciones.
// Importa diversas clases y paquetes para llevar a cabo operaciones matemáticas, conversiones de unidades y otras funciones específicas.
// Utiliza un bucle do-while para mostrar un menú de opciones al usuario y ejecutar la funcionalidad seleccionada según la entrada del usuario.

import mis_metodos.ListaOpciones;
import conversor.ConversosGrados;
import calculadora.AritmeticaBasica;
import interfas_grafica.Banner;
import IMC.IMC;
import conversor.metros;
import calculadora.CalcularEdad;
import lista.lista_de_compras;
import conversor.Monedas;
import mis_metodos.MIsMetodos;
import libros.Biblioteca;
import colegios.Curso;

// importar de nombrelibreria.nombrepaquete.nombreclase

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // lista de opciones

        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit/Celsius", "kilometros a metros",
                "Calcular edad", "Lista de compras",
                "conversion de monedas", "biblioteca",
                "segundo primaria", "Salir"
        };


        JFrame miVentana = new JFrame();
        miVentana.setBounds(0,0,500,600);
        miVentana.setLayout(null);
        // panel del banner
        JPanel banner = new JPanel();
        banner.setBackground(Color.BLUE);
        banner.setBounds(0,0,500,300);



        miVentana.add(banner);
        miVentana.setVisible(true);

        boolean progrma = true;
        do{
            //nombreclase.nombremetodo
            MIsMetodos.limpiarConsola();
            Banner.mensaje_1();
            MIsMetodos.imprimirLinea();
            ListaOpciones.cargarOpciones(listaDeOpciones);


            // *@Scanner creando un objeto
            // *@System imprime en consola un mensaje
            // *@int almacena el valor del scanner(into0pcion)
            // *@nextInt() convierte la salida de Scanner en un numero entero()


            Scanner into0pcion = new Scanner(System.in);
            System.out.print("[?]");
            int opcion = into0pcion.nextInt();
            MIsMetodos.imprimirLinea();

            // cargar opcion del usuario
            switch (opcion){
                case 1:
                    AritmeticaBasica.calculadora();
                    break;
                case 2:
                    IMC.programaIMC();
                    break;
                case 3:
                    ConversosGrados.calculadora();
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
                    Biblioteca.program();
                    break;
                case 9:
                    Curso.program();
                    break;
                case 10:
                    progrma = false;
                    break;
            }
        }while (progrma);

    }
}