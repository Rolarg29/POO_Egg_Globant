package Actividades.Ejercicio12.Service;

import Actividades.Ejercicio12.Entidad.Persona;

import java.util.Date;
import java.util.Scanner;

import static java.lang.System.in;

public class PersonaService {
    static Scanner read = new Scanner(in).useDelimiter("\n");

    public static Persona crearPersona() {
        Persona nuevaPersona = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        nuevaPersona.setNombre(read.next());

        System.out.println("Ingrese la fecha de nacimiento");
        System.out.println("Ingrese el día");
        int dia = read.nextInt();
        System.out.println("Ingrese el mes");
        int mes = read.nextInt();
        System.out.println("Ingrese el año");
        int anio = read.nextInt();
        nuevaPersona.setFechaNacimiento(new Date(anio - 1900, mes, dia));
        return nuevaPersona;
    }

    public static int calcularEdad(Persona persona) {
        int anio = persona.getFechaNacimiento().getYear();
        int mes = persona.getFechaNacimiento().getMonth();
        int dia = persona.getFechaNacimiento().getDate();
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - anio;

        if (fechaActual.getMonth() + 1 < mes) {
            edad--;
        } else if (fechaActual.getMonth() + 1 == mes) {
            if (fechaActual.getDate() < dia) {
                edad--;
            }
        }
        return edad;
    }

    public static boolean menorQue(int edad, Persona persona) {
        return edad < calcularEdad(persona);
    }

    public static void mostrarPersona(Persona persona) {
        System.out.println(persona);
    }
}
