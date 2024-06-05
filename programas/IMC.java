package programas;
import java.util.Scanner;

public class IMC {
    public static double CalcularIMC(double peso,double altura){
        double IMC = peso/(altura*altura);
        return IMC;
    }
    public static void programaIMC(){

        Scanner intoDato = new Scanner(System.in);
        System.out.println("peso: ");
        double peso = intoDato.nextDouble();
        System.out.println("Altura");
        double altura = intoDato.nextDouble();

        //proceso
        double IMC = CalcularIMC(peso,altura);
        // resultado
        System.out.println("IMC: " + IMC);


        System.out.println("-------------------------");

        if (IMC < 18.5) {
            System.out.println("IMC Bajo: ");
        } else if (IMC > 18.5 && IMC < 24.9) {
            System.out.println("---> IMC Normal");
        } else if (IMC > 25 && IMC < 29.9) {
            System.out.println("---> IMC Sobre peso");
        } else if (IMC > 30 && IMC < 34.9) {
            System.out.println("---> IMC Obesidad 1");
        } else if (IMC > 35 && IMC < 39.9) {
            System.out.println("---> IMC Obesidad 2");
        } else if (IMC > 40 && IMC < 49.9) {
            System.out.println("---> IMC Obesidad 3");
        } else if (IMC > 50) {
            System.out.println("---> IMC Obesidad 5");
        }

    }
}


