package Extras.Extra6.Service;

import Extras.Extra6.Entidad.Ahorcado;

import java.util.Scanner;

import static java.lang.System.in;

public class AhorcadoService {

    private final Ahorcado ahorcado = new Ahorcado();
    private char[] letrasEncontradas;
    Scanner read = new Scanner(in);

    public void crearJuego(){
        System.out.println("Iniciando Juego");
        System.out.println("Ingrese la palabra a buscar");
        String palabra = read.nextLine();
        System.out.println("Ingrese el máximo de jugadas permitidas en este juego (Recomendado: " + Math.round(palabra.length()*1.5)+")");
        int maxJugadas = read.nextInt();
        ahorcado.setPalabra(palabra.toCharArray());
        ahorcado.setCantidadJugadas(maxJugadas);
        ahorcado.setCantidadLetrasAcertadas(0);
        letrasEncontradas = new char[palabra.length()];
    }

    public void longitud(){
        System.out.println("La cantidad de letras que tiene la palabra de este juego es: "+ahorcado.getPalabra().length);
    }

    public void buscarLetra(){
        char[] letras = ahorcado.getPalabra();
        System.out.println("La palabra a buscar tiene "+ahorcado.getPalabra().length+" letras.");
        System.out.println("Escriba una letra para buscarla...");
        char letra = read.next().charAt(0);
        if(encontrada(letra)){
            int encontradas = 0;
            for (int i = 0; i < letras.length; i++) {
                char s = letras[i];
                if (String.valueOf(s).equalsIgnoreCase(String.valueOf(letra))) {
                    letrasEncontradas[i]= s;
                    encontradas++;
                }
            }
            ahorcado.setCantidadLetrasAcertadas(ahorcado.getCantidadLetrasAcertadas() + encontradas);
            System.out.println("Has acertado una letra que pertenece a la palabra!");
        }else{
            ahorcado.setCantidadJugadas(ahorcado.getCantidadJugadas()-1);
            System.out.println("Has fallado en encontrar una letra!");
        }
        System.out.println("Letras encontradas: " + ahorcado.getCantidadLetrasAcertadas());
        System.out.println("Letras restantes: " + (ahorcado.getPalabra().length- ahorcado.getCantidadLetrasAcertadas()));
    }

    private boolean encontrada(char letra){
        char[] letras = ahorcado.getPalabra();
        for (char s : letras) {
            if (String.valueOf(s).equalsIgnoreCase(String.valueOf(letra))) {
                return true;
            }
        }
        return false;
    }

    public void intentos(){
        System.out.println("Errores restantes: " + ahorcado.getCantidadJugadas());
    }

    private boolean estatusJuego(){
        if(ahorcado.getCantidadLetrasAcertadas() == ahorcado.getPalabra().length){
            System.out.println("Felicidades!!!! Has ganado el juego:)");
            System.out.println("Palabra encontrada: " + recuperarPalabra());
            return true;
        }
        return false;
    }
    private String recuperarPalabra(){
        String palabra = "";
        for (char s : ahorcado.getPalabra()) {
            palabra = palabra.concat(String.valueOf(s));
        }
        return palabra;
    }

    private void mostrarLetrasAcertadas(){
        for (char s : letrasEncontradas) {
            if (s == '\0'){
                s=' ';
            }
            System.out.print("["+s+"] ");
        }
        System.out.println();
    }

    private void finalizarJuego(){
        read.close();
    }

    public void juego(){
        System.out.println("Bienvenido al juego del ahorcado");
        crearJuego();
        do{
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            buscarLetra();
            intentos();
            mostrarLetrasAcertadas();
            System.out.println("====================================");
            if(estatusJuego()){
                break;
            }
        }while(ahorcado.getCantidadJugadas() > 0);
        System.out.println("Has alcanzado el máximo de errores permitidos :(");
        System.out.println("GAME OVER");
        finalizarJuego();
    }

}
