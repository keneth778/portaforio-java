// Este archivo define una clase llamada "Banner" en el paquete "organizador", que proporciona un método estático llamado "mensaje_1" para imprimir un banner estilizado en la consola.
// El banner consiste en una representación gráfica de texto que incluye el nombre del programa u otra información relevante.

package interfas_grafica;

import mis_metodos.MIsMetodos;

public class Banner {
    public static void mensaje_1(){
        System.out.println("\n" +
                "   __  __     ______     __         __         ______        __     __     ______     ______     _____     __        \n" +
                "  /\\ \\_\\ \\   /\\  ___\\   /\\ \\       /\\ \\       /\\  __ \\      /\\ \\  _ \\ \\   /\\  __ \\   /\\  == \\   /\\  __-.  /\\ \\       \n" +
                "  \\ \\  __ \\  \\ \\  __\\   \\ \\ \\____  \\ \\ \\____  \\ \\ \\/\\ \\     \\ \\ \\/ \".\\ \\  \\ \\ \\/\\ \\  \\ \\  __<   \\ \\ \\/\\ \\ \\ \\ \\____  \n" +
                "   \\ \\_\\ \\_\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\  \\ \\_____\\     \\ \\__/\".~\\_\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\____-  \\ \\_____\\ \n" +
                "    \\/_/\\/_/   \\/_____/   \\/_____/   \\/_____/   \\/_____/      \\/_/   \\/_/   \\/_____/   \\/_/ /_/   \\/____/   \\/_____/ \n" +
                "                                                                                                                     \n");
        MIsMetodos.imprimirLinea();
    }
}
