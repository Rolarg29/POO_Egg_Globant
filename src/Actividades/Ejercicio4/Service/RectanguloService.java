package Actividades.Ejercicio4.Service;

import Actividades.Ejercicio4.Entidad.Rectangulo;

import java.util.Scanner;

import static java.lang.System.in;

public class RectanguloService {
    Scanner read = new Scanner(in);

    public Rectangulo crearRectangulo(){
        Rectangulo nuevoRectangulo = new Rectangulo();
        System.out.println("Ingrese el valor de la base");
        nuevoRectangulo.setBase(read.nextInt());
        System.out.println("Ingrese el valor de la altura");
        nuevoRectangulo.setAltura(read.nextInt());
        return nuevoRectangulo;
    }

    public int superficie(Rectangulo rectangulo) {
        int superficie = rectangulo.getBase() * rectangulo.getAltura();
        return superficie;
    }

    public int perimetro(Rectangulo rectangulo) {
        int perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;
        return perimetro;
    }
    public void dibujarRectangulo(Rectangulo r) {
        for(int i = 0; i < r.getAltura(); i++) {
            for(int j = 0; j < r.getBase(); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
