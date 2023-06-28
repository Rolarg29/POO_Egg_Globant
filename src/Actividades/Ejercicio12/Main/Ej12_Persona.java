package Actividades.Ejercicio12.Main;

import Actividades.Ejercicio12.Entidad.Persona;
import Actividades.Ejercicio12.Service.PersonaService;

public class Ej12_Persona {

    public static void main(String[] args) {
        Persona persona = PersonaService.crearPersona();
        System.out.println("La edad es: "+ PersonaService.calcularEdad(persona));
        System.out.println(PersonaService.menorQue(15, persona));
        PersonaService.mostrarPersona(persona);
    }
}
