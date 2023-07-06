package Extras.Extra4;

import java.util.Scanner;

public class NifService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private String[] letras = {
            "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"
    };

    public NIF crearNIF(){
        NIF nif = new NIF();
        System.out.println("Ingrese el número DNI de 8 dígitos");
        nif.setDni(read.nextLong());
        nif.setNif(calcularNIF(nif.getDni()));
        return nif;
    }

    public void mostrarNIF(NIF n){
        System.out.println("El NIF es: "+n.getDni()+"-"+n.getNif());
    }

    private String calcularNIF(long n) {
        int resto = (int)n%23;
        System.out.println("Letra NIF calculada con éxito!");
        System.out.println(resto);
        return letras[resto];
    }
}
