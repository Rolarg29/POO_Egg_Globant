package Servicios;

import Entidad.Persona;
import java.util.Scanner;

import static java.lang.System.in;

public class PersonaService {
    Scanner read = new Scanner(in);

    public Persona crearPersona() {
        Persona personaCompleta = new Persona();

        //Pedimos el nombre
        System.out.println("Ingrese el nombre de la persona");
        personaCompleta.setNombre(read.next());

        System.out.println("Ingrese la edad de la persona");
        personaCompleta.setEdad(read.nextInt());

        System.out.println("Ingrese la nacionalidad de la persona");
        personaCompleta.setNacionalidad(read.next());

        return personaCompleta;
    }


    public void mostrarPersona(Persona persona) {
        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getNacionalidad());
    }
}
