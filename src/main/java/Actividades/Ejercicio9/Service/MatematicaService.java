package Actividades.Ejercicio9.Service;

import Actividades.Ejercicio9.Entidad.Matematica;

public class MatematicaService {

    public static double devolverMayor(Matematica mate) {
        double numMayor = Math.max(mate.getNumero1(), mate.getNumero2());
        return numMayor;
    }

    public static double devolverMenor(Matematica mate) {
        double numMenor = Math.min(mate.getNumero1(), mate.getNumero2());
        return numMenor;
    }

    public static void calcularPotencia(Matematica mate) {
        long mayor = Math.round(devolverMayor(mate));
        long menor = Math.round(devolverMenor(mate));
        System.out.println("El resultado de la potencia es: " + Math.pow(mayor, menor));
    }

    public static void calcularRaiz(Matematica mate) {
        double absMin = Math.abs(devolverMenor(mate));
        System.out.println("La raíz cuadrada del numero menor es: " + Math.sqrt(absMin));
    }
}
