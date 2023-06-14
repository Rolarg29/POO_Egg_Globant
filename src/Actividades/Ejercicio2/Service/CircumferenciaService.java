package Actividades.Ejercicio2.Service;

import Actividades.Ejercicio2.Entidad.Circumferencia;

import java.util.Scanner;

import static java.lang.System.in;

public class CircumferenciaService {
    Scanner read = new Scanner(in);

    public Circumferencia crearCircumferencia() {

//        Circumferencia nuevaCircumferencia = new Circumferencia();

        System.out.println("Ingrese la medida del radio");
        double radio = read.nextDouble();
//        nuevaCircumferencia.setRadio(read.nextDouble());

        Circumferencia nuevaCircumferencia = new Circumferencia(radio);

        return nuevaCircumferencia;
    }

    public double area(double radio) {

        double area = Math.PI * (radio * radio);

        return area;
    }

    public double perimetro(double radio) {

        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
