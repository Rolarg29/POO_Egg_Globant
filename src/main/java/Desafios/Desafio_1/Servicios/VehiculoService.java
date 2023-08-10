package Desafios.Desafio_1.Servicios;

import Desafios.Desafio_1.Entidades.Vehiculo;

import java.util.Scanner;

public class VehiculoService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Vehiculo crearVehiculo() {
        Vehiculo nuevoVehiculo = new Vehiculo();
        System.out.println("Ingrese los datos del vehiculo (marca, modelo, año, tipo)");
//        nuevoVehiculo.setMarca(read.nextLine());
//        nuevoVehiculo.setModelo(read.nextLine());
//        nuevoVehiculo.setAnio(read.nextInt());
        nuevoVehiculo.setTipo(read.nextLine());
        return nuevoVehiculo;
    }

    //Determinar cuanto avanza por segundo (velocidad)
    public int moverse(Vehiculo obj) {
        int velocidadMPS;
        if (obj.getTipo().equalsIgnoreCase("automovil")) {
            velocidadMPS = 3;
        } else if (obj.getTipo().equalsIgnoreCase("motocicleta")) {
            velocidadMPS = 2;
        } else {
            velocidadMPS = 1;
        }
        return velocidadMPS;
    }

    public int frenar(Vehiculo obj) {
        int metros = 0;
        if (obj.getTipo().equalsIgnoreCase("automovil")
                || obj.getTipo().equalsIgnoreCase("motocicleta")) {
            metros = 2;
        }
        return metros;
    }

    public int calcularDistancia(int v, int m, int t) {
        int distanciaFinal = (v * t) + m;
        return distanciaFinal;
    }

    public void vehiculoMasLejos(Vehiculo obj1, Vehiculo obj2, Vehiculo obj3) {
        if (obj1.getDistanciaFinal() > obj2.getDistanciaFinal() && obj1.getDistanciaFinal() > obj3.getDistanciaFinal()) {
            System.out.println(obj1.getTipo() + " es el que llegó más lejos.");
        } else if (obj2.getDistanciaFinal() > obj1.getDistanciaFinal() && obj2.getDistanciaFinal() > obj3.getDistanciaFinal()) {
            System.out.println(obj2.getTipo() + " es el que llegó más lejos.");
        } else {
            System.out.println(obj3.getTipo() + " es el que llegó más lejos.");
        }
    }
}
