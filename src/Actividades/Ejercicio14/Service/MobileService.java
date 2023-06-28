package Actividades.Ejercicio14.Service;

import Actividades.Ejercicio14.Entidad.Mobile;

import java.util.Scanner;

import static java.lang.System.in;

public class MobileService {
    Scanner read = new Scanner(in);
    Mobile mobile = new Mobile();

    public void cargarCelular(){
        System.out.println("Ingrese la marca del móvil.");
        mobile.setMarca(read.next());
    }
}
