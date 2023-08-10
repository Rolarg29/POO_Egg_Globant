package Actividades.Ejercicio1.Main;

import Actividades.Ejercicio1.Entidad.Libro;
import Actividades.Ejercicio1.Service.LibroService;

public class Ej1_Libro {
    public static void main(String[] args) {

        LibroService libroServicio = new LibroService();
        Libro nuevoLibro = libroServicio.crearLibro();
        libroServicio.mostrarLibro(nuevoLibro);
    }
}
