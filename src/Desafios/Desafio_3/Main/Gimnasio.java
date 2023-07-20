package Desafios.Desafio_3.Main;

import Desafios.Desafio_3.Servicios.ListaClienteService;
import Desafios.Desafio_3.Servicios.ListaRutinaService;
import java.util.Scanner;
import static Desafios.Desafio_3.Servicios.CommonServices.comprobarInt;

public class Gimnasio {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private ListaClienteService listaCliente = new ListaClienteService();
    private ListaRutinaService listaRutina = new ListaRutinaService();

    public void menu(){
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||>===<>==={ Bienvenido al Gimnasio }===<>===<|||");
        System.out.println("|||>Seleccione una opción:                    <|||");
        System.out.println("|||>1.- Registro de clientes.                 <|||");
        System.out.println("|||>2.- Cargar rutinas.                       <|||");
        System.out.println("|||>3.- Lista de clientes.                    <|||");
        System.out.println("|||>4.- Lista de rutinas.                     <|||");
        System.out.println("|||>5.- Actualizar datos personales.          <|||");
        System.out.println("|||>6.- Actualizar rutinas de ejercicios.     <|||");
        System.out.println("|||>7.- Baja de clientes.                     <|||");
        System.out.println("|||>8.- Eliminar rutinas.                     <|||");
        System.out.println("|||>9.- SALIR.                                <|||");
        System.out.println("|||>===<>===<>===<>===<>==<>===<>===<>===<>===<|||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
        int indice = comprobarInt();
        ejecutarAcciones(indice);
    }

    private void ejecutarAcciones(int answer){
        switch (answer) {
            case 1 -> {
                System.out.println("Cuantos clientes desea registrar?");
                int numC = comprobarInt();
                for (int i = 0; i < numC; i++) {
                    listaCliente.agregarCliente();
                }
                menu();
            }
            case 2 -> {
                System.out.println("Cuantas rutinas desea cargar?");
                int numR = comprobarInt();
                for (int i = 0; i < numR; i++) {
                    listaRutina.agregarRutina();
                }
                menu();
            }
            case 3 -> {
                listaCliente.obtenerClientes();
                menu();
            }
            case 4 -> {
                listaRutina.obtenerRutinas();
                menu();
            }
            case 5 -> {
                listaCliente.obtenerClientes();
                listaCliente.actualizarCliente();
                menu();
            }
            case 6 -> {
                listaRutina.obtenerRutinas();
                listaRutina.actualizarRutina();
                menu();
            }
            case 7 -> {
                listaCliente.eliminarCliente();
                menu();
            }
            case 8 -> {
                listaRutina.eliminarRutina();
                menu();
            }
            case 9 -> {
                boolean invalidAnswer = true;
                while (invalidAnswer) {
                    System.out.println("Seguro que desea salir? [si] [no]");
                    String confirm= read.next();
                    if (confirm.equalsIgnoreCase("no")) {
                        invalidAnswer = false;
                        menu();
                    }else if (confirm.equalsIgnoreCase("si")){
                        invalidAnswer = false;
                        System.out.println("Gracias :) Vuelva Pronto!");
                    }else{
                        System.err.println("Respuesta invalida");
                    }
                }
            }
            default -> {
                System.err.println("Opción inválida, ingresala nuevamente");
                System.err.print("> ");
                int newAnswer = read.nextInt();
                ejecutarAcciones(newAnswer);
            }
        }
    }
}
