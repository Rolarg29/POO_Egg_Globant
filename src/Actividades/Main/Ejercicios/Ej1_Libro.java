package Actividades.Main.Ejercicios;

import Actividades.Entidad.Libro;
import Actividades.Servicios.LibroService;

public class Ej1_Libro {
    public static void main(String[] args) {

        LibroService libroServicio = new LibroService();
        Libro nuevoLibro = libroServicio.crearLibro();
        libroServicio.mostrarLibro(nuevoLibro);
    }
}
