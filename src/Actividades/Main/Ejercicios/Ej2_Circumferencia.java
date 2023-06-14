package Actividades.Main.Ejercicios;

import Actividades.Entidad.Circumferencia;
import Actividades.Servicios.CircumferenciaService;

public class Ej2_Circumferencia {

    public static void main(String[] args) {

        CircumferenciaService circServicio = new CircumferenciaService();
        Circumferencia circumferencia = circServicio.crearCircumferencia();

        double area = circServicio.area(circumferencia.getRadio());
        double perimetro = circServicio.perimetro(circumferencia.getRadio());

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
