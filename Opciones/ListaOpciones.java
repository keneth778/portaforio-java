// Este archivo define una clase llamada "ListaOpciones" en el paquete "Opciones", que proporciona funcionalidad para cargar y mostrar una lista de opciones en grupos de dos, cada grupo en una línea separada.
// El método estático "cargarOpciones" toma un array de cadenas que representan las opciones y las muestra en la consola, asegurándose de que estén alineadas correctamente.
// También incluye un método privado llamado "encontrarElementoMasGrande" que encuentra y devuelve la longitud del elemento más largo en el array de opciones, lo que se utiliza para garantizar una alineación adecuada al mostrar las opciones.

package Opciones;

public class ListaOpciones {
//Carga y muestra las opciones en grupos de dos, cada grupo en una línea separada.

public static void cargarOpciones(String[] opciones) {

    int elementoMasGrande = encontrarElementoMasGrande(opciones).length();

for (int i = 0; i < opciones.length; i++) {
        System.out.printf("[%d] %s ", i + 1, opciones[i]);

        for(int j = 0;j<(elementoMasGrande-opciones[i].length());j++){
            System.out.print(" ");
        }

        if ((i + 1) % 2 == 0) {
            System.out.println("");
        }
    }

}

/** * Encuentra y devuelve el elemento más grande en el array listaDeOpciones. * * @param listaDeOpciones El array de opciones. * @return El elemento más grande encontrado. */ public static String encontrarElementoMasGrande (String[] listaDeOpciones) {
    String elementoMasGrande = listaDeOpciones[0];

    for (String opcion : listaDeOpciones) {
        if (opcion.length() > elementoMasGrande.length()) {
            elementoMasGrande = opcion;
        }
    }

    return elementoMasGrande;
}
}