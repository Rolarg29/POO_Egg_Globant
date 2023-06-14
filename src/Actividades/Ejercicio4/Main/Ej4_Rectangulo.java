package Actividades.Ejercicio4.Main;

import Actividades.Ejercicio4.Entidad.Rectangulo;
import Actividades.Ejercicio4.Service.RectanguloService;

public class Ej4_Rectangulo {
    public static void main(String[] args) {
        RectanguloService recServicio = new RectanguloService();
        Rectangulo rec1 = recServicio.crearRectangulo();
        System.out.println("La Superficie del rectangulo es: " + recServicio.superficie(rec1));
        System.out.println("El Perimetro del rectangulo es: " + recServicio.perimetro(rec1));
        recServicio.dibujarRectangulo(rec1);

    }
}
