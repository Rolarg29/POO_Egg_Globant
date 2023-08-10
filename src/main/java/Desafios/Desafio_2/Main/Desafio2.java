package Desafios.Desafio_2.Main;

import Desafios.Desafio_2.Entidades.Alquiler;
import Desafios.Desafio_2.Entidades.Pelicula;
import Desafios.Desafio_2.Services.AlquilerService;
import Desafios.Desafio_2.Services.PeliculaService;

import java.util.Scanner;

import static java.lang.System.in;

public class Desafio2 {
    static Scanner read = new Scanner(in);

    public static void main(String[] args) {
        PeliculaService pService = new PeliculaService();
        AlquilerService alService = new AlquilerService();
        Pelicula[] peliculas = new Pelicula[5];
        Alquiler[] alquiles = new Alquiler[3];
        menu(peliculas, alquiles, pService, alService);
    }

    public static void menu(Pelicula[] peliculas, Alquiler[] alquiles, PeliculaService ps, AlquilerService as) {
        System.out.println("==SERVICIO DE ALQUILER DE PELICULAS==");
        System.out.println(" MENÚ");
        System.out.println("1. Cargar una película");
        System.out.println("2. Listar todas las películas disponibles");
        System.out.println("3. Crear un alquiler");
        System.out.println("4. Listar todos los alquileres");
        System.out.println("5. Buscar película por título o género");
        System.out.println("6. por fecha");
        System.out.println("7 salir");
        System.out.print("Ingrese una opción: ");
        int opcion = read.nextInt();
        read.nextLine();
        switch (opcion) {
            case 1:
                ps.cargarPeliculas(peliculas);
                menu(peliculas, alquiles, ps, as);
                break;
            case 2:
                ps.listarPeliculas(peliculas);
                menu(peliculas, alquiles, ps, as);
                break;
            case 3:
                as.cargarAlquileres(alquiles);
                menu(peliculas, alquiles, ps, as);
                break;
            case 4:
                as.listarAlquileres(alquiles);
                menu(peliculas, alquiles, ps, as);
                break;
            case 5:
                System.out.println("Elija buscar por 1 titulo o 2 genero");
                int op = read.nextInt();
                if (op == 1) {
                    ps.buscarPorTitulo(peliculas);
                    menu(peliculas, alquiles, ps, as);
                } else {
                    ps.buscarPorGenero(peliculas);
                    menu(peliculas, alquiles, ps, as);
                }
                break;
            case 6:
                as.buscarAlquiler(alquiles);
                menu(peliculas, alquiles, ps, as);
                break;
            case 7:
                System.out.println("Salir");
                menu(peliculas, alquiles, ps, as);
            default:
                System.out.println("Opción inválida");
                menu(peliculas, alquiles, ps, as);
                break;
        }
        read.close();
    }
}
