package Actividades.Ejercicio10.Main;


import java.util.Arrays;
import java.util.Random;

import static Actividades.Ejercicio10.Service.ArrayService.*;

public class Ej10_Arrays {
    public static void main(String[] args) {
        double[] array1 = new double[50];
        double[] array2 = new double[20];
        Random rand = new Random();

        llenarArray(array1);
        Arrays.sort(array1);
        mostrarArray(array1);
        System.arraycopy(array1, 0, array2, 0, 10);
        Arrays.fill(array2,10, 20, 0.5);
        mostrarArray(array2);

    }
}
