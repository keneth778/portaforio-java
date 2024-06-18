// Este archivo define una clase llamada "lista_de_compras" en el paquete "lista".
// Su función es proporcionar un programa para crear una lista de compras.
// Utiliza la clase "ListaOpciones" del paquete "Opciones" para mostrar las opciones disponibles en el programa.
// Luego, permite al usuario elegir entre crear una lista de compras o salir del programa.
// Si elige crear una lista de compras, solicita al usuario que ingrese los productos y sus precios, y los agrega a dos listas separadas (una para los nombres de los productos y otra para los precios).
// Finalmente, muestra la lista de compras creada en la consola, que consiste en los nombres de los productos junto con sus precios.
// El programa permite agregar hasta tres productos a la lista de compras.

package lista;
import mis_metodos.ListaOpciones;
import mis_metodos.MIsMetodos;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class lista_de_compras {
    public static void programa() {
        String[] ListaDeOpciones = {
                "Lista de compras", "Salir"
        };
        ListaOpciones.cargarOpciones(ListaDeOpciones);

        Scanner into0pcion = new Scanner(System.in);
        System.out.print("[?]");
        int opcion = into0pcion.nextInt();

        MIsMetodos.imprimirLinea();
        switch (opcion){
            case 1:
                crearLista();
                break;
            case 2:
                System.out.println("salir");
                break;

        }
    }
    public static void crearLista(){
        List<String> ListaNombre = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();

        // pedir un producto y su precio

       String rP;
       double rPc;

        for (int i=1; i<=3;i++){
            Scanner item = new Scanner(System.in);
            System.out.println("producto: ");
            rP = item.nextLine();
            System.out.println("precio");
            rPc = item.nextDouble();

            // agrega a la lista vacia
            ListaNombre.add(rP);
            listaPrecio.add(rPc);
        }

        //mostrar lista
        System.out.println(ListaNombre +" -->"+listaPrecio);
    }
}
