package Actividades.Ejercicio14.Service;

import Actividades.Ejercicio14.Entidad.Mobile;

import java.util.Scanner;



public class MobileService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Mobile mobile = new Mobile();

    private void cargarCelular(){
        System.out.println("Ingrese la marca del móvil.");
        mobile.setMarca(read.next());
        System.out.println("Ingrese el modelo del móvil.");
        mobile.setModelo(read.next());
        System.out.println("Ingrese el precio del móvil.");
        mobile.setPrecio(read.nextDouble());
        System.out.println("Ingrese la memoria Ram del móvil.");
        mobile.setMemoriaRam(read.next());
        System.out.println("Ingrese el almacenamiento del móvil.");
        mobile.setMarca(read.next());
    }

    private void ingresarCodigo(){
        int[] codigo = new int[7];
        System.out.println("Ingrese el código del mobile un dígito a la vez");
        for (int i = 0; i < codigo.length; i++) {
            codigo[i] = read.nextInt();
        }
        mobile.setCodigo(codigo);
    }

    public void crearMobile(){
        cargarCelular();
        ingresarCodigo();
        System.out.println("Mobile creado!");
        mostrarMobile();
    }

    private void mostrarMobile(){
        System.out.println(mobile.toString());
    }
}
