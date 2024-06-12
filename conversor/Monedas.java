package conversor;
import java.util.Scanner;

public class Monedas {
    public static void main(String[] args) {
        convertir();
    }

    public static void convertir() {
        String[] ListaDeOpciones = {
                "Quetzal a Dólar",
                "Dólar a Quetzal",
                "Peso Mexicano a Quetzal",
                "Quetzal a Peso Mexicano"
        };

        mis_metodos.ListaOpciones.cargarOpciones(ListaDeOpciones);
        Scanner into0pcion = new Scanner(System.in);
        System.out.print("[?]");
        int opcion = into0pcion.nextInt();

        System.out.print("[?] Ingresa la cantidad a convertir: ");
        double cantidad = into0pcion.nextDouble();

        double resultado = 0;
        switch(opcion) {
            case 1: // Quetzal a Dólar
                resultado = quetzalADolar(cantidad);
                System.out.println(cantidad + " Quetzales son " + resultado + " Dólares");
                break;
            case 2: // Dólar a Quetzal
                resultado = dolarAQuetzal(cantidad);
                System.out.println(cantidad + " Dólares son " + resultado + " Quetzales");
                break;
            case 3: // Peso Mexicano a Quetzal
                resultado = pesoMexicanoAQuetzal(cantidad);
                System.out.println(cantidad + " Pesos Mexicanos son " + resultado + " Quetzales");
                break;
            case 4: // Quetzal a Peso Mexicano
                resultado = quetzalAPesoMexicano(cantidad);
                System.out.println(cantidad + " Quetzales son " + resultado + " Pesos Mexicanos");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    public static double quetzalADolar(double quetzales) {
        double tasaConversion = 0.13;
        return quetzales * tasaConversion;
    }

    public static double dolarAQuetzal(double dolares) {
        double tasaConversion = 7.75;
        return dolares * tasaConversion;
    }

    public static double pesoMexicanoAQuetzal(double pesos) {
        double tasaConversion = 0.39;
        return pesos * tasaConversion;
    }

    public static double quetzalAPesoMexicano(double quetzales) {
        double tasaConversion = 2.58;
        return quetzales * tasaConversion;
    }
}

