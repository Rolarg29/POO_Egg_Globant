package Desafios.Desafio_1.Main;

import Desafios.Desafio_1.Entidades.Vehiculo;
import Desafios.Desafio_1.Servicios.VehiculoService;

import java.util.Scanner;

import static java.lang.System.in;

public class Ejercicio1 {
    static Scanner read = new Scanner(in);
    public static void main(String[] args) {
        VehiculoService vService = new VehiculoService();
        Vehiculo vehiculo1 = vService.crearVehiculo();
        Vehiculo vehiculo2 = vService.crearVehiculo();
        Vehiculo vehiculo3 = vService.crearVehiculo();
        String respuesta;
        do {
            System.out.print("Tiempo: ");
            int tiempo = read.nextInt();
            vehiculo1.setDistanciaFinal(vService.calcularDistancia(vService.moverse(vehiculo1), vService.frenar(vehiculo1), tiempo));
            vehiculo2.setDistanciaFinal(vService.calcularDistancia(vService.moverse(vehiculo2), vService.frenar(vehiculo2), tiempo));
            vehiculo3.setDistanciaFinal(vService.calcularDistancia(vService.moverse(vehiculo3), vService.frenar(vehiculo3), tiempo));
            System.out.println(vehiculo1.getTipo() + " avanzó " + vehiculo1.getDistanciaFinal() + " metros.");
            System.out.println(vehiculo2.getTipo() + " avanzó " + vehiculo2.getDistanciaFinal() + " metros.");
            System.out.println(vehiculo3.getTipo() + " avanzó " + vehiculo3.getDistanciaFinal() + " metros.");
            System.out.println("Desea ingresar otro tiempo? S/N");
            respuesta = read.next();
        } while (respuesta.equalsIgnoreCase("s"));

        vehiculo1.setDistanciaFinal(vService.calcularDistancia(vService.moverse(vehiculo1), vService.frenar(vehiculo1), 300));
        vehiculo2.setDistanciaFinal(vService.calcularDistancia(vService.moverse(vehiculo2), vService.frenar(vehiculo2), 300));
        vehiculo3.setDistanciaFinal(vService.calcularDistancia(vService.moverse(vehiculo3), vService.frenar(vehiculo3), 300));
        vService.vehiculoMasLejos(vehiculo1, vehiculo2, vehiculo3);


    }
}
