package Actividades.Ejercicio9.Service;

import Actividades.Ejercicio9.Entidad.Matematica;

public class MatematicaService {

    public static double devolverMayor(Matematica mate){
        System.out.println("El atributo con el mayor valor es: " + Math.max(mate.getNumero1(), mate.getNumero2()));
        return Math.max(mate.getNumero1(), mate.getNumero2());
    }

    public static double calcularPotencia(Matematica mate){
        long num1 = Math.round(mate.getNumero1());
        long num2 = Math.round(mate.getNumero2());
        double potencia = Math.pow(Math.max(num1, num2), Math.min(num1, num2));
        System.out.println("El resultado de la potencia es: " + potencia);
        return potencia;
    }

    public static double calcularRaiz(Matematica mate){
        double minimo = Math.min(mate.getNumero1(), mate.getNumero2());
        double absMin = Math.abs(minimo);
        System.out.println("La raíz cuadrada del numero menor es: " + Math.sqrt(absMin));
        return Math.sqrt(absMin);
    }
}
