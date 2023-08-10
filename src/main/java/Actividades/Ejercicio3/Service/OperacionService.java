package Actividades.Ejercicio3.Service;

import Actividades.Ejercicio3.Entidad.Operacion;

import java.util.Scanner;

import static java.lang.System.in;

public class OperacionService {
    Scanner read = new Scanner(in);

    public Operacion crearOperacion() {
        Operacion nuevaOperacion = new Operacion();
        System.out.println("Ingrese el primer número de la operación:");
        nuevaOperacion.setNumero1(read.nextInt());
        System.out.println("Ingrese el segundo número de la operación:");
        nuevaOperacion.setNumero2(read.nextInt());
        return nuevaOperacion;
    }

    public double sumar(Operacion operacion) {
        double suma = operacion.getNumero1() + operacion.getNumero2();
        return suma;
    }

    public double restar(Operacion operacion) {
        double resta = operacion.getNumero1() - operacion.getNumero2();
        return resta;
    }

    public double multiplicar(Operacion operacion) {
        if (operacion.getNumero1() == 0 || operacion.getNumero2() == 0) {
            System.err.println("Error! La multiplicación da 0");
            return 0;
        } else {
            double multi = operacion.getNumero1() * operacion.getNumero2();
            return multi;
        }
    }

    public double dividir(Operacion operacion) {
        if (operacion.getNumero2() == 0) {
            System.err.println("Error! La operación intenta dividir por 0");
            return 0;
        } else {
            double division = operacion.getNumero1() / operacion.getNumero2();
            return division;
        }
    }
}
