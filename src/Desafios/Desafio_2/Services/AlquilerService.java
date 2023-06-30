package Desafios.Desafio_2.Services;

import Desafios.Desafio_2.Entidades.Alquiler;

import java.util.Date;
import java.util.Scanner;

import static java.lang.System.in;

public class AlquilerService {
    Scanner read = new Scanner(in);

    public Alquiler crearAlquiler(){
        Alquiler alquiler = new Alquiler();
        System.out.println("Ingrese La pelicula que desea alquilar");
        alquiler.setPeliculaAlquilada(read.next());
        System.out.println("Ingrese La fecha de inicio");
        alquiler.setFechaInicio(definirFecha());
        System.out.println("Ingrese La fecha de fin");
        alquiler.setFechaFin(definirFecha());
        long ms = alquiler.getFechaFin().getTime()- alquiler.getFechaInicio().getTime();
        long dias = ms/86400000;
        if(dias<=3){
            alquiler.setPrecio(10);
        } else {
            alquiler.setPrecio((dias-3)+10);
        }
        return alquiler;
    }

    public Date definirFecha() {
        System.out.println("Ingrese el día");
        int dia = read.nextInt();
        System.out.println("Ingrese el mes");
        int mes = read.nextInt();
        int anio = 2023;
        Date fecha = new Date(anio-1900,mes,dia);
        return fecha;
    }

    public Alquiler[] cargarAlquileres(Alquiler[] al){
        for(int i = 0; i < al.length; i++){
            al[i] = crearAlquiler();
        }
        return al;
    }

    public void listarAlquileres(Alquiler[] al){
        System.out.println("==Lista de alquileres==");
        for (Alquiler alquiler : al) {
            System.out.println(alquiler);
        }
        System.out.println("========================");
    }

    public void buscarAlquiler(Alquiler[] al){
        System.out.println("Ingrese la fecha del alquiler que desea buscar");
        Date fecha = definirFecha();
        for (Alquiler alquiler : al) {
            if (alquiler.getFechaInicio()==fecha){
                System.out.println("Se encontró el alquiler:");
                System.out.println(alquiler);
                return;
            }
        }
        System.out.println("No existe ningún alquiler con esa fecha de inicio");
    }

    public void calcularIngresoTotal(Alquiler[] al){
        double ingresoTotal = 0;
        for (Alquiler alquiler: al) {
            ingresoTotal += alquiler.getPrecio();
        }
        System.out.println("El ingreso total de los alquileres es de $"+ingresoTotal);
    }

}
