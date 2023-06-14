package Actividades.Ejercicio3.Main;

import Actividades.Ejercicio3.Entidad.Operacion;
import Actividades.Ejercicio3.Service.OperacionService;

public class Ej3_Operacion {
    public static void main(String[] args) {
        OperacionService opServicio = new OperacionService();
        Operacion operacion = opServicio.crearOperacion();
        double suma = opServicio.sumar(operacion);
        double resta = opServicio.restar(operacion);
        double multi = opServicio.multiplicar(operacion);
        double division = opServicio.dividir(operacion);

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es : " + multi);
        System.out.println("La division es: " + division);
    }

}
