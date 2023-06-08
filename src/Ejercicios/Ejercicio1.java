package Ejercicios;

import Entidad.Libro;
import Servicios.LibroService;

public class Ejercicio1 {
    public static void main(String[] args) {

        LibroService libroServicio = new LibroService();
        Libro nuevoLibro = libroServicio.crearLibro();
        libroServicio.mostrarLibro(nuevoLibro);
    }
}
