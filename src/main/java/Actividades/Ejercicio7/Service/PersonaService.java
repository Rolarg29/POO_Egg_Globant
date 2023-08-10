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
        char sexo = read.next().charAt(0);
        String sexoS = Character.toString(sexo).toUpperCase();
        sexo = sexoS.charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.err.println("El sexo no es correcto, ingresalo nuevamente");
            sexo = read.next().charAt(0);
        }

        System.out.println("Ingrese el peso de la persona");
        double peso = read.nextDouble();

        System.out.println("Ingrese la altura en metros de la persona");
        double altura = read.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona) {
        int valor;
        double imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (imc < 20.0) {
            valor = -1;//Debajo de su peso ideal
        } else if (imc >= 20.0 && imc < 25.0) {
            valor = 0;//Peso ideal
        } else {
            valor = 1;//sobrepeso
        }
        return valor;
    }

    public void resultadoPeso(int valor) {
        switch (valor) {
            case 0:
                System.out.println("se encuentra en su peso ideal!");
                break;
            case 1:
                System.out.println("tiene sobrepeso.");
                break;
            case -1:
                System.out.println("se encuentra por debajo de su peso ideal");
                break;
            default:
                System.out.println("no cuenta con los datos necesarios");
                break;
        }
    }

    public boolean esMayorDeEdad(Persona persona) {
        if (persona.getEdad() >= 18) {
            System.out.println(persona.getNombre() + " es mayor de edad");
        } else {
            System.out.println(persona.getNombre() + " es menor de edad");
        }
        return persona.getEdad() >= 18;
    }
}
