package colegios;

public class SegundoPrimaria {
    private String nombre;
    private String categoria;
    private String periodo;

    // Constructor
    public SegundoPrimaria(String nombre, String categoria, String periodo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.periodo = periodo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPeriodo() {
        return periodo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "SegundoPrimaria{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}
