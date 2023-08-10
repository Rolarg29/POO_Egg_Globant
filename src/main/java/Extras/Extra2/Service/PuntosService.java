package Extras.Extra2.Service;

import Extras.Extra2.Entidad.Puntos;

import java.util.Scanner;

import static java.lang.System.in;

public class PuntosService {
    Scanner read = new Scanner(in).useDelimiter("\n");

    public Puntos crearPuntos() {
        Puntos nuevosP = new Puntos();
        System.out.println("Deberá ingresar los valores para los puntos siguientes: P1(x1, y1), P2(x2, y2)");
        System.out.println("Ingrese el valor x1");
        nuevosP.setX1(read.nextDouble());
        System.out.println("Ingrese el valor y1");
        nuevosP.setY1(read.nextDouble());
        System.out.println("Ingrese el valor x2");
        nuevosP.setX2(read.nextDouble());
        System.out.println("Ingrese el valor y2");
        nuevosP.setY2(read.nextDouble());
        System.out.println("Los nuevos puntos son P1(" + nuevosP.getX1() + ", " + nuevosP.getY1() + "), P2(" + nuevosP.getX2() + ", " + nuevosP.getY2() + ")");
        return nuevosP;
    }

    public void calcularDistancia(Puntos p) {
        //d(P1, P2) = √(x2-x1)'2 + (y2-y1)'2 --> Formula para calcular distancia entre 2 puntos
        double sustX = Math.pow((p.getX2() - p.getX1()), 2);
        double sustY = Math.pow((p.getY2() - p.getY1()), 2);
        double distancia = Math.sqrt(sustX + sustY);
        System.out.println("La distancia entre P1 y P2 es de " + distancia);
    }
}
