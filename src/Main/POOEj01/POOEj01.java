package Main.POOEj01;

import Entidad.Persona;
import Servicios.PersonaService;

public class POOEj01 {
    public static void main(String[] args) {
//        Persona primeraPersona = new Persona("Rolando", 21, "Mexicana");
//        System.out.println(CURSO);
//
//        System.out.println(primeraPersona.getNombre());
//        primeraPersona.setNombre("Juan");
//        System.out.println(primeraPersona.getNombre());

//        System.out.println(primeraPersona.getEdad());
//        primeraPersona.setEdad(30);
//        System.out.println(primeraPersona.getEdad());

        PersonaService perServicio = new PersonaService();
        Persona terceraPersona = perServicio.crearPersona();
        perServicio.mostrarPersona(terceraPersona);
//        System.out.println(terceraPersona.toString());


    }
}
