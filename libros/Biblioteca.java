package libros;
import java.util.Scanner;

public class Biblioteca {
    public static void program(){
        System.out.println("Biblioteca");

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "30/05/1967");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "16/01/1605");
        Libro libro3 = new Libro("1984", "George Orwell", "08/06/1949");
        Libro libro4 = new Libro("Orgullo y Prejuicio", "Jane Austen", "28/01/1813");
        Libro libro5 = new Libro("Matar a un Ruiseñor", "Harper Lee", "11/07/1960");
        Libro libro6 = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", "10/04/1925");
        Libro libro7 = new Libro("En el Camino", "Jack Kerouac", "05/09/1957");
        Libro libro8 = new Libro("Crimen y Castigo", "Fyodor Dostoyevsky", "01/01/1866");
        Libro libro9 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "29/07/1954");
        Libro libro10 = new Libro("El Hobbit", "J.R.R. Tolkien", "21/09/1937");


        Scanner scr = new Scanner(System.in);


        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());

        //AUTORES
        libro1.setAutor("yo");
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro3.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());

        //FECHAS
        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
        System.out.println(libro3.getFecha());
        System.out.println(libro4.getFecha());
        System.out.println(libro5.getFecha());
        System.out.println(libro6.getFecha());
        System.out.println(libro7.getFecha());
        System.out.println(libro8.getFecha());
        System.out.println(libro9.getFecha());
        System.out.println(libro10.getFecha());

        System.out.println(libro1.toString());

    }
}
