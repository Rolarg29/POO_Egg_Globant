package Desafios.Desafio_3.Servicios;

import Desafios.Desafio_3.Entidades.Cliente;

import java.util.Random;
import java.util.Scanner;
import static Desafios.Desafio_3.Servicios.CommonServices.comprobarInt;
import static Desafios.Desafio_3.Servicios.CommonServices.comprobarFloat;

public class ClienteService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    public static Random rand = new Random();

    public Cliente registrarCliente(int id){
        Cliente nuevoCliente = new Cliente();
        if(id == Cliente.noId){
            int newId = rand.nextInt(1000, 10000);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Registro de nuevo cliente, ID asignado: ");
            System.out.println(newId);
            nuevoCliente.setId(newId);
        }else{
            nuevoCliente.setId(id);
        }
        CommonServices.insertData(nuevoCliente);
        return nuevoCliente;
    }

    public Cliente editarDatosCliente(Cliente cliente){
        System.out.println("Que datos deseas actualizar?");
        System.out.println("1. Nombre del cliente");
        System.out.println("2. Edad del cliente");
        System.out.println("3. Altura del cliente");
        System.out.println("4. Descripción de la rutina");
        System.out.println("5. Objetivo del cliente");
        System.out.println("6. Todos los datos del cliente");
        int respuesta = read.nextInt();
        switch (respuesta) {
            case 1 -> {
                System.out.println("Ingrese el nuevo nombre");
                cliente.setNombre(read.next());
            }
            case 2 -> {
                System.out.println("Ingrese la nueva edad");
                cliente.setEdad(comprobarInt());
            }
            case 3 -> {
                System.out.println("Ingrese la nueva altura");
                cliente.setAltura(comprobarInt());
            }
            case 4 -> {
                System.out.println("Ingrese el nuevo peso");
                cliente.setPeso(comprobarFloat());
            }
            case 5 -> {
                System.out.println("Ingrese el nuevo objetivo");
                cliente.setObjetivo(read.next());
            }
            case 6 -> {
                System.out.println("Ingrese los nuevos datos del cliente");
                return registrarCliente(cliente.getId());
            }
        }
        if(CommonServices.realizarMasCambios()) editarDatosCliente(cliente);
        return cliente;
    }

}
