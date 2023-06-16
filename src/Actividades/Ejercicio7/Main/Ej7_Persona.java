package Actividades.Ejercicio7.Main;

import Actividades.Ejercicio7.Entidad.Persona;
import Actividades.Ejercicio7.Service.PersonaService;

import java.util.Arrays;

public class Ej7_Persona {

    public static void main(String[] args) {

        PersonaService personaS = new PersonaService();
        Persona persona0 = personaS.crearPersona();
        Persona persona1 = new Persona("Rolando", 21, 'h', 87.5, 1.75);
        Persona persona2 = new Persona("Cindy", 23, 'M', 55.5, 1.63);
        Persona persona3 = new Persona("Juan", 30, 'h', 80.4, 1.80);
        Persona persona4 = new Persona("Pablo", 16, 'H', 74.2, 1.68);
        Persona persona5 = new Persona("Ana", 17, 'm', 49.8, 1.58);


        Persona[] personas = {persona0, persona1, persona2, persona3, persona4, persona5};
        int[] valoresIMC = new int[personas.length];
        boolean[] sonMayoresDeEdad = new boolean[personas.length];
        int conteoMayoresEdad = 0;
        int conteoMenoresEdad = 0;

        for (int i = 0; i < personas.length; i++) {
            valoresIMC[i] = personaS.calcularIMC(personas[i]);
            System.out.print(personas[i].getNombre() + " ");
            personaS.resultadoPeso(valoresIMC[i]);
            sonMayoresDeEdad[i] = personaS.esMayorDeEdad(personas[i]);
            if(sonMayoresDeEdad[i]){
                conteoMayoresEdad++;
            }else{
                conteoMenoresEdad++;
            }
            System.out.println("========================");
        }

        long conteoPesoIdeal = Arrays.stream(valoresIMC).filter(valor -> valor == 0).count();
        long conteoSobrePeso = Arrays.stream(valoresIMC).filter(valor -> valor == 1).count();
        long conteoBajoPeso = Arrays.stream(valoresIMC).filter(valor -> valor == -1).count();

        System.out.println("\n===<>===<>RESULTADOS<>===<>===");
        System.out.println("Total Personas: "+personas.length);
        System.out.println("Personas con Bajo Peso: " + (conteoBajoPeso*100)/personas.length + "%");
        System.out.println("Personas en su Peso ideal: " + (conteoPesoIdeal*100)/personas.length + "%");
        System.out.println("Personas con Sobre Peso: " + (conteoSobrePeso*100)/personas.length + "%");
        System.out.println("Personas Mayores de Edad: " + (conteoMayoresEdad*100)/personas.length + "%");
        System.out.println("Personas Menores de Edad: " + (conteoMenoresEdad*100)/personas.length + "%");
        System.out.println("<>===<>===<>===<>===<>===<>===<>");


    }
}
