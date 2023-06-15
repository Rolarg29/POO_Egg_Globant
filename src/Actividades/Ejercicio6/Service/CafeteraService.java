package Actividades.Ejercicio6.Service;

import Actividades.Ejercicio6.Entidad.Cafetera;

import java.util.Scanner;
import static java.lang.System.in;

public class CafeteraService {
    Scanner read = new Scanner(in);

    public Cafetera crearCafetera(){
        Cafetera nuevaCafetera = new Cafetera();
        System.out.println("Ingrese la capacidad maxima de esta cafetera");
        nuevaCafetera.setCapacidadMaxima(read.nextDouble());
        System.out.println("Ingrese la cantidad actual de esta cafetera");
        nuevaCafetera.setCantidadActual(read.nextDouble());

        return nuevaCafetera;
    }
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Se ha llenado la cafetera al máximo! --> " + cafetera.getCantidadActual());
    }

    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera --> " + cafetera.getCantidadActual());
    }

    public void agregarCafe(Cafetera cafetera){
        double cafeActual = cafetera.getCantidadActual();
        double cafeMax = cafetera.getCapacidadMaxima();
        System.out.println("Ingrese la cantidad de gramos de cafe desea agregar");
        double cafe = read.nextDouble();

        if(cafeActual<cafeMax && (cafeActual+cafe)<=cafeMax){
            cafetera.setCantidadActual(cafeActual+cafe);
            System.out.println("Se agregó la cantidad correctamente");
            System.out.println("Cantidad actual: "+cafetera.getCantidadActual());

        } else if (cafeActual<cafeMax && (cafeActual+cafe)>cafeMax) {
            llenarCafetera(cafetera);
            System.out.println("La cantidad ingresada supera el límite. Se llena al máximo.");

        }else{
            System.out.println("No se puede agregar más café, ya está a su máxima capacidad.");
        }

    }

    public void servirTaza(Cafetera cafetera){
        double cafeActual= cafetera.getCantidadActual();
        double taza;
        System.out.println("Cual es el tamaño de la taza vacía?");
        double capacidadTaza = read.nextDouble();

        if (capacidadTaza>cafeActual) {
            taza = cafeActual;
            System.out.println("La taza no se ha llenado. ("+taza+"/"+capacidadTaza+")" );
        }else{
            taza = capacidadTaza;
            System.out.println("La taza se ha llenado! ("+taza+"/"+capacidadTaza+")" );
        }

    }
}
