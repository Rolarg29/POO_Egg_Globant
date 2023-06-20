package Actividades.Ejercicio8.Service;

import Actividades.Ejercicio8.Entidad.Cadena;

import java.util.Scanner;

import static java.lang.System.in;


public class CadenaService {
    public static Scanner read = new Scanner(in).useDelimiter("\n");

    public void mostrarVocales(Cadena cadena) {
        int contador=0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char letraActual = cadena.getFrase().charAt(i);
            if(esVocal(letraActual)) contador++;
        }
        System.out.println("Vocales: " + contador);
    }

    public static boolean esVocal(char letra) {
        String vocales = "aeiouAEIOU";
        return vocales.contains(Character.toString(letra));
    }

    public void invertirFrase(Cadena cadena){
        String frase=cadena.getFrase();
        String fraseInvertida = "";
        for (int i = frase.length()-1; i >=0; i--) {
            fraseInvertida += frase.substring(i, i+1);
        }
        System.out.println(fraseInvertida);
    }

    public void vecesRepetido(String letra, Cadena cadena){
        int contador=0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char letraActual = cadena.getFrase().charAt(i);
            if(letraActual==letra.charAt(0)) contador++;
        }
        System.out.println(contador);
    }

    public void compararLongitud(Cadena cadena){
        System.out.println("Ingrese frase a comparar:");
        String fraseNueva = read.nextLine();
        if(fraseNueva.length()== cadena.getLongitud()){
            System.out.println("Tienen la misma longitud");
        }else{
            System.out.println("Tienen distinta longitud");
        }
    }

    public void unirFrases(Cadena cadena){
        System.out.println("Ingrese una frase:");
        String fraseNueva = read.nextLine();
        String fraseResultante = cadena.getFrase().concat(" "+ fraseNueva);
        System.out.println(fraseResultante);
    }

    public void reemplazar(Cadena cadena){
        System.out.println("Ingrese un nuevo caracter:");
        String letraNueva = read.nextLine();

        String nuevaFrase = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char letraActual = cadena.getFrase().charAt(i);
            nuevaFrase=cadena.getFrase().replace('a', letraNueva.charAt(0));
        }
        System.out.println(nuevaFrase);
    }

    public boolean contiene(Cadena cadena){
        System.out.println("Ingrese una letra a buscar");
        String letra = read.nextLine();
        return cadena.getFrase().contains(letra);
    }
}
