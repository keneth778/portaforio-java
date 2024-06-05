package lista;
import Opciones.ListaOpciones;
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
