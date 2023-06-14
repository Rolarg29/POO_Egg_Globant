package Actividades.Ejercicio1.Service;

import Actividades.Ejercicio1.Entidad.Libro;

import java.util.Scanner;

import static java.lang.System.in;

public class LibroService {

    Scanner read = new Scanner(in);

    public Libro crearLibro(){
        Libro libro = new Libro();
        System.out.println("Ingrese el ISBN del libro");
        libro.setISBN(read.nextLine());

        System.out.println("Ingrese el título del libro");
        libro.setTitulo(read.nextLine());

        System.out.println("Ingrese el autor del libro");
        libro.setAutor(read.nextLine());

        System.out.println("Ingrese la cantidad de páginas del libro");
        libro.setNumPaginas(read.nextInt());

        return libro;
    }

    public void mostrarLibro(Libro libro){
        System.out.println("Datos del libro: ");
        System.out.println(libro.toString());
//        System.out.println(libro.getISBN());
//        System.out.println(libro.getTitulo());
//        System.out.println(libro.getAutor());
//        System.out.println(libro.getNumPaginas());
    }
}
