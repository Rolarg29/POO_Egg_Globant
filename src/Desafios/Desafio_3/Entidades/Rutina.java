package Desafios.Desafio_3.Entidades;

public class Rutina {
    private int id;
    private String nombre;
    private int duracion;
    private String nivelDificultad;
    private String descripcion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(String nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina#"+id + " {"+
                "id= " + id +
                ", nombre= '" + nombre + '\'' +
                ", duración(sets)= " + duracion +
                ", dificultad= '" + nivelDificultad + '\'' +
                ", descripcion= '" + descripcion + '\'' +
                '}';
    }
}
