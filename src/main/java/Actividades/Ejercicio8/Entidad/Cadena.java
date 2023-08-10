package Actividades.Ejercicio8.Entidad;

public class Cadena {
    private String frase;
    private long longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(String frase) {
        this.longitud = frase.length();
    }
}
