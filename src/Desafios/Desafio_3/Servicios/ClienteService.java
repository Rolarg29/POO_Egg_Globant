package Desafios.Desafio_3.Servicios;

import Desafios.Desafio_3.Entidades.Cliente;

import java.util.Scanner;

public class ClienteService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Cliente registrarCliente(int id){
        Cliente nuevoCliente = new Cliente();
        if(id == Cliente.noId){
            System.out.println("Ingrese el id del cliente");
            nuevoCliente.setId(read.nextInt());
        }else{
            nuevoCliente.setId(id);
        }
        System.out.println("Ingrese el nombre del cliente.");
        nuevoCliente.setNombre(read.next());
        System.out.println("Ingrese la edad del cliente");
        nuevoCliente.setEdad(read.nextInt());
        System.out.println("Ingrese la altura del cliente en cm.");
        nuevoCliente.setAltura(read.nextInt());
        System.out.println("Ingrese el peso del cliente");
        nuevoCliente.setPeso(read.nextFloat());
        System.out.println("Ingrese el objetivo del cliente");
        nuevoCliente.setObjetivo(read.next());
        return nuevoCliente;
    }

    public Cliente actualizarDatos(Cliente cliente){
        System.out.println("Que datos deseas actualizar?");
        System.out.println("1. Nombre del cliente");
        System.out.println("2. Edad del cliente");
        System.out.println("3. Altura del cliente");
        System.out.println("4. Peso del cliente");
        System.out.println("5. Objetivo del cliente");
        System.out.println("6. Todos los datos del cliente");
        int respuesta = read.nextInt();
        switch (respuesta){
            case 1:
                System.out.println("Ingrese el nuevo nombre");
                cliente.setNombre(read.next());
                break;
            case 2:
                System.out.println("Ingrese la nueva edad");
                cliente.setEdad(read.nextInt());
                break;
            case 3:
                System.out.println("Ingrese la nueva altura");
                cliente.setAltura(read.nextInt());
                break;
            case 4:
                System.out.println("Ingrese el nuevo peso");
                cliente.setPeso(read.nextFloat());
                break;
            case 5:
                System.out.println("Ingrese el nuevo objetivo");
                cliente.setObjetivo(read.next());
                break;
            case 6:
                System.out.println("Ingrese los nuevos datos del cliente");
                return registrarCliente(cliente.getId());
        }
        return cliente;
    }

}
