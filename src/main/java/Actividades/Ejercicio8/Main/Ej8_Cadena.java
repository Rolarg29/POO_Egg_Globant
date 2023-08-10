package Actividades.Ejercicio8.Main;

import Actividades.Ejercicio8.Entidad.Cadena;
import Actividades.Ejercicio8.Service.CadenaService;

import java.util.Scanner;

public class Ej8_Cadena {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        CadenaService cadenaS = new CadenaService();
        Cadena cadena = new Cadena();

        System.out.println("Ingrese una palabra o frase");
        cadena.setFrase(read.nextLine());
        cadena.setLongitud(cadena.getFrase());

        cadenaS.mostrarVocales(cadena);
        cadenaS.invertirFrase(cadena);
        cadenaS.vecesRepetido("o", cadena);
        cadenaS.compararLongitud(cadena);
        cadenaS.unirFrases(cadena);
        cadenaS.reemplazar(cadena);
        boolean contiene = cadenaS.contiene(cadena);
        System.out.println(contiene);

    }
}
