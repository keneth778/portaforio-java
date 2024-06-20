package colegios;

public class Curso {
    public static void program() {
        System.out.println("Información de alumnos y cursos:");

        // Crear estudiantes individuales
        Estudiante estudiante1 = new Estudiante("Pablo", "P4blo@scl.gt", 7, true);
        Estudiante estudiante2 = new Estudiante("Ana Lopez", "ana.lopez@example.com", 8, true);
        Estudiante estudiante3 = new Estudiante("Carlos Ruiz", "carlos.ruiz@example.com", 7, false);
        Estudiante estudiante4 = new Estudiante("Laura Garcia", "laura.garcia@example.com", 8, true);
        Estudiante estudiante5 = new Estudiante("Luis Gomez", "luis.gomez@example.com", 7, false);

        // Crear cursos individuales
        SegundoPrimaria curso1 = new SegundoPrimaria("Matemáticas", "Primero Primaria", "3");
        SegundoPrimaria curso2 = new SegundoPrimaria("Lengua", "Primero Primaria", "3");
        SegundoPrimaria curso3 = new SegundoPrimaria("Ciencias", "Segundo Primaria", "3");
        SegundoPrimaria curso4 = new SegundoPrimaria("Inglés", "Segundo Primaria", "3");

        // Imprimir información de estudiantes
        System.out.println("\nListado de alumnos:");
        System.out.println("Nombre: " + estudiante1.getNombre() + ", Correo: " + estudiante1.getCorreo());
        System.out.println("Nombre: " + estudiante2.getNombre() + ", Correo: " + estudiante2.getCorreo());
        System.out.println("Nombre: " + estudiante3.getNombre() + ", Correo: " + estudiante3.getCorreo());
        System.out.println("Nombre: " + estudiante4.getNombre() + ", Correo: " + estudiante4.getCorreo());
        System.out.println("Nombre: " + estudiante5.getNombre() + ", Correo: " + estudiante5.getCorreo());

        // Imprimir información de cursos
        System.out.println("\nListado de cursos:");
        System.out.println("Nombre: " + curso1.getNombre());
        System.out.println("Nombre: " + curso2.getNombre());
        System.out.println("Nombre: " + curso3.getNombre());
        System.out.println("Nombre: " + curso4.getNombre());
    }

    public static void main(String[] args) {
        program();
    }
}