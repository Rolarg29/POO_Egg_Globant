package Actividades.Ejercicio11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.in;

public class Ej11_Date {
    public static void main(String[] args) {
        Scanner read = new Scanner(in).useDelimiter("\n");
        System.out.println("Ingrese el día");
        int dia = read.nextInt();
        System.out.println("Ingrese el mes");
        int mes = read.nextInt();
        System.out.println("Ingrese el año");
        int anio = read.nextInt();

        Date fecha = new Date(anio-1900,mes,dia);
        Date fechaActual = new Date();

        int diferencia = fechaActual.getYear() - fecha.getYear();
        System.out.println("La diferencia:" + diferencia + " años");
//        LocalDateTime fechaActual = LocalDateTime.now();
//        System.out.println("Fecha actual: " + fechaActual);
    }
}
