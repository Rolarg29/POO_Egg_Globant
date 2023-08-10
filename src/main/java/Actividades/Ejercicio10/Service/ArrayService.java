package Actividades.Ejercicio10.Service;

import java.util.Random;

public class ArrayService {

    public static void llenarArray(double[] a) {
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
    }

    public static void mostrarArray(double[] a) {
        for (double v : a) {
            System.out.print("[ " + v + " ] ");
        }
        System.out.println();
    }
}
