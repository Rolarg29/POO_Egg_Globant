package Extras.Extra5.Service;

import Extras.Extra5.Entidad.Meses;

import java.util.Scanner;

import static java.lang.System.in;

public class MesesService {

    public Meses crearMesSecreto(){
        Meses m = new Meses();
        int num2 = (int) (Math.random()* m.getMes().length);
        m.setMesSecreto(m.getMes()[num2]);
        return m;
    }

    public void encontrarMesSecreto(Meses m) {
        Scanner read = new Scanner(in);
        System.out.println("Intente adivinar el mes secreto");
        System.out.println("Introduzca el nombre del mes en minúsculas");
        String mesIngresado;
        do {
            mesIngresado = read.nextLine();
            if (m.getMesSecreto().equalsIgnoreCase(mesIngresado)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }
        } while (true);
    }
}
