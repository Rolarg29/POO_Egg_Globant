package Teoria.Main.POOEj01;

import Teoria.Entidad.PersonaTeoria;
import Teoria.Servicios.PersonaTeoriaService;

public class POOEj01 {
    public static void main(String[] args) {
//        PersonaTeoria primeraPersona = new PersonaTeoria("Rolando", 21, "Mexicana");
//        System.out.println(CURSO);
//
//        System.out.println(primeraPersona.getNombre());
//        primeraPersona.setNombre("Juan");
//        System.out.println(primeraPersona.getNombre());

//        System.out.println(primeraPersona.getEdad());
//        primeraPersona.setEdad(30);
//        System.out.println(primeraPersona.getEdad());

        PersonaTeoriaService perServicio = new PersonaTeoriaService();
        PersonaTeoria terceraPersonaTeoria = perServicio.crearPersona();
        perServicio.mostrarPersona(terceraPersonaTeoria);
//        System.out.println(terceraPersonaTeoria.toString());


    }
}
