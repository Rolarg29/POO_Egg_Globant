package Main.Ejercicios;

import Entidad.Circumferencia;
import Servicios.CircumferenciaService;

public class Ejercicio2 {
    public static void main(String[] args) {
        CircumferenciaService circServicio = new CircumferenciaService();
        Circumferencia circumferencia = circServicio.crearCircumferencia();
        double area = circServicio.area(circumferencia.getRadio());
        double perimetro = circServicio.perimetro(circumferencia.getRadio());
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
