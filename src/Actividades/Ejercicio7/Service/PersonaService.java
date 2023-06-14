package Actividades.Ejercicio7.Service;

import Actividades.Ejercicio7.Entidad.Persona;

import java.util.Scanner;

import static java.lang.System.in;

public class PersonaService {
    Scanner read = new Scanner(in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
        String nombre = read.nextLine();

        System.out.println("Ingrese la edad de la persona");
        int edad = read.nextInt();

        System.out.println("Ingrese el sexo de la persona (H-hombre, M-mujer, O-otro)");
        char sexo = read.nextLine().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.err.println("El sexo no es correcto, ingreselo nuevamente");
            sexo = read.nextLine().charAt(0);
        }

        System.out.println("Ingrese el peso de la persona");
        double peso = read.nextDouble();

        System.out.println("Ingrese la altura en metros de la persona");
        double altura = read.nextDouble();

        Persona nuevaPersona = new Persona(nombre, edad, sexo, peso, altura);
        return nuevaPersona;
    }

    public int calcularIMC(Persona persona) {
        int valor;
        double imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (imc < 20.0) {
            valor = -1;
        }else if (imc >= 20.0 && imc < 25.0) {
            valor = 0;
        }else{
            valor = 1;
        }
        return valor;
    }

    public boolean esMayorDeEdad(Persona persona) {
        if (persona.getEdad()>=18){
            return true;
        }else {
            return false;
        }
    }
}
