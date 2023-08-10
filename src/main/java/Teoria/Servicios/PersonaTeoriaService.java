package Teoria.Servicios;

import Teoria.Entidad.PersonaTeoria;

import java.util.Scanner;

import static java.lang.System.in;

public class PersonaTeoriaService {
    Scanner read = new Scanner(in);

    public PersonaTeoria crearPersona() {
        PersonaTeoria personaTeoriaCompleta = new PersonaTeoria();

        //Pedimos el nombre
        System.out.println("Ingrese el nombre de la persona");
        personaTeoriaCompleta.setNombre(read.next());

        System.out.println("Ingrese la edad de la persona");
        personaTeoriaCompleta.setEdad(read.nextInt());

        System.out.println("Ingrese la nacionalidad de la persona");
        personaTeoriaCompleta.setNacionalidad(read.next());

        return personaTeoriaCompleta;
    }


    public void mostrarPersona(PersonaTeoria personaTeoria) {
        System.out.println(personaTeoria.getNombre());
        System.out.println(personaTeoria.getEdad());
        System.out.println(personaTeoria.getNacionalidad());
    }
}
