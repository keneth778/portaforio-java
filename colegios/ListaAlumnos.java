package colegios;

import java.util.ArrayList;
import java.util.List;

public class ListaAlumnos {
    public static void program() {
        System.out.println("Información de alumnos y cursos:");

        // Crear 5 estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Pablo", "P4blo@scl.gt", 7, true));
        estudiantes.add(new Estudiante("Ana Lopez", "ana.lopez@example.com", 8, true));
        estudiantes.add(new Estudiante("Carlos Ruiz", "carlos.ruiz@example.com", 7, false));
        estudiantes.add(new Estudiante("Laura Garcia", "laura.garcia@example.com", 8, true));
        estudiantes.add(new Estudiante("Luis Gomez", "luis.gomez@example.com", 7, false));

        // Crear 4 cursos
        List<PrimeroPrimaria> cursos = new ArrayList<>();
        cursos.add(new PrimeroPrimaria("Matemáticas", "Primero Primaria", "3"));
        cursos.add(new PrimeroPrimaria("Lengua", "Primero Primaria", "3"));
        cursos.add(new PrimeroPrimaria("Ciencias", "Segundo Primaria", "3"));
        cursos.add(new PrimeroPrimaria("Inglés", "Segundo Primaria", "3"));

        // Imprimir listado de alumnos
        System.out.println("\nListado de alumnos:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Correo: " + estudiante.getCorreo());
        }

        // Imprimir listado de cursos
        System.out.println("\nListado de cursos:");
        for (PrimeroPrimaria curso : cursos) {
            System.out.println("Nombre: " + curso.getNombre() + ", Categoría: " + curso.getCategoria() + ", Periodo: " + curso.getPeriodo());
        }
    }

    public static void main(String[] args) {
        program();
    }
}
