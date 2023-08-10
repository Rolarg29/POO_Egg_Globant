package Teoria.Entidad;

public class PersonaTeoria {

    private String nombre;
    private int edad;
    private String nacionalidad;
    public static final String CURSO = "Egg";

    public PersonaTeoria() {
    }

    public PersonaTeoria(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "PersonaTeoria {\n" +
                "nombre='" + nombre + '\'' +
                ",\nedad=" + edad +
                ",\nnacionalidad='" + nacionalidad + '\'' + '\n' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
