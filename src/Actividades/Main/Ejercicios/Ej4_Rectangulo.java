package Actividades.Main.Ejercicios;

import Actividades.Entidad.Rectangulo;
import Actividades.Servicios.RectanguloService;

public class Ej4_Rectangulo {
    public static void main(String[] args) {
        RectanguloService recServicio = new RectanguloService();
        Rectangulo rec1 = recServicio.crearRectangulo();
        System.out.println("La Superficie del rectangulo es: " + recServicio.superficie(rec1));
        System.out.println("El Perimetro del rectangulo es: " + recServicio.perimetro(rec1));
        recServicio.dibujarRectangulo(rec1);

    }
}
