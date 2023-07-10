package Desafios.Desafio_3.Servicios;

import Desafios.Desafio_3.Entidades.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaClienteService {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    ClienteService cService = new ClienteService();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void agregarCliente(){
        listaClientes.add(cService.registrarCliente(Cliente.noId));
    }

    public void obtenerClientes(){
        for (Cliente c: listaClientes) {
            System.out.println(c);
        }
        System.out.println();
    }

    public void actualizarCliente(){
        System.out.println("Ingrese el ID del cliente que desea actualizar");
        int id = read.nextInt();
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getId() == id){
                listaClientes.set(i, cService.actualizarDatos(cliente));
            }
        }

    }
}
