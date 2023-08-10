package Desafios.Desafio_3.Servicios;

import Desafios.Desafio_3.Entidades.Cliente;
import Desafios.Desafio_3.Entidades.Rutina;

import java.util.Scanner;

public class CommonServices {
    static Scanner read = new Scanner(System.in).useDelimiter("\n");

    protected static boolean realizarMasCambios() {
        System.out.println("Desea modificar algún otro dato? S/N");
        String choice = read.next();
        while (!choice.equalsIgnoreCase("s") && !choice.equalsIgnoreCase("n")) {
            System.out.println("Respuesta invalida. Ingresala nuevamente:");
            choice = read.next();
        }
        if (choice.equalsIgnoreCase("s")) {
            return true;
        } else {
            System.out.println("Cambios realizados correctamente!");
            return false;
        }
    }

    protected static String asignarDificultad(int nivel) {
        String dificultad = "";
        switch (nivel) {
            case 1:
                dificultad = "Baja";
                break;
            case 2:
                dificultad = "Media";
                break;
            case 3:
                dificultad = "Alta";
                break;
        }
        return dificultad;
    }

    protected static void insertData(Rutina rutina) {
        System.out.println("Ingrese el nombre de la rutina.");
        rutina.setNombre(read.next());
        System.out.println("Ingrese la duración de la rutina. (sets)");
        rutina.setDuracion(comprobarInt());
        System.out.println("Ingrese el nivel de dificultad de la rutina. \n1.Baja \n2.Media \n3.Alta");
        rutina.setNivelDificultad(asignarDificultad(comprobarInt()));
        System.out.println("Ingrese la descripción de la rutina.");
        rutina.setDescripcion(read.next());
    }

    protected static void insertData(Cliente nuevoCliente) {
        System.out.println("Ingrese el nombre del cliente.");
        nuevoCliente.setNombre(read.next());
        System.out.println("Ingrese la edad del cliente");
        nuevoCliente.setEdad(comprobarInt());
        System.out.println("Ingrese la altura del cliente en cm.");
        nuevoCliente.setAltura(comprobarInt());
        System.out.println("Ingrese el peso del cliente en kg.");
        nuevoCliente.setPeso(comprobarFloat());
        System.out.println("Ingrese el objetivo del cliente");
        nuevoCliente.setObjetivo(read.next());
    }

    public static int comprobarInt() {
        System.out.print("> ");
        while (!read.hasNextInt()) {
            read.next();
            System.out.println("Tipo de dato incorrecto. Intentalo nuevamente.");
            System.out.print("> ");
        }
        return read.nextInt();
    }

    public static float comprobarFloat() {
        System.out.print("> ");
        while (!read.hasNextFloat()) {
            read.next();
            System.out.println("Tipo de dato incorrecto. Intentalo nuevamente.");
            System.out.print("> ");
        }
        return read.nextFloat();
    }
}
