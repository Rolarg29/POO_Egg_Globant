package Extras.Extra2.Service;

import Extras.Extra2.Entidad.Puntos;

import java.util.Scanner;

import static java.lang.System.in;

public class PuntosService {
    Scanner read = new Scanner(in).useDelimiter("\n");

    public Puntos crearPuntos(){
        Puntos nuevosP = new Puntos();
        System.out.println("Ingrese el punto x1");
        nuevosP.setX1(read.nextDouble());
        System.out.println("Ingrese el punto x2");
        nuevosP.setX2(read.nextDouble());
        System.out.println("Ingrese el punto y1");
        nuevosP.setY1(read.nextDouble());
        System.out.println("Ingrese el punto y2");
        nuevosP.setY2(read.nextDouble());
        return nuevosP;
    }
}
