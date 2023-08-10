package Desafios.Desafio_3.Servicios;

import Desafios.Desafio_3.Entidades.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

import static Desafios.Desafio_3.Servicios.ClienteService.rand;
import static Desafios.Desafio_3.Servicios.CommonServices.comprobarInt;

public class ListaClienteService {
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    ClienteService cService = new ClienteService();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void agregarCliente() {
        Cliente nuevoCliente = cService.registrarCliente(Cliente.noId);
        for (Cliente cliente : listaClientes) {
            while (cliente.getId() == nuevoCliente.getId()) {
                int id = rand.nextInt(1000, 10000);
                System.out.println("ID se encontraba repetido, nuevo ID: " + id);
                nuevoCliente.setId(id);
            }
        }
        listaClientes.add(nuevoCliente);
        System.out.println("---------------------------------");
        System.out.println("[CLIENTE REGISTRADO EXITOSAMENTE]");
        System.out.println("---------------------------------");
    }

    public void obtenerClientes() {
        System.out.println("==~==<>==~==<>==~==[>> LISTA DE CLIENTES <<]==~==<>==~==<>==~==");
        System.out.println();
        for (Cliente c : listaClientes) {
            System.out.println(c);
        }
        System.out.println();
        System.out.println("==~==<>==~==<>==~==<>==~==<>==~==<>==~==<>==~==<>==~==<>==~==");
    }

    public void actualizarCliente() {
        System.out.println("Ingrese el ID del cliente que desea actualizar");
        int id = comprobarInt();
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getId() == id) {
                System.out.println("Cliente seleccionado -> [" + cliente + "]");
                listaClientes.set(i, cService.editarDatosCliente(cliente));
                System.out.println("Cliente actualizado -> [" + cliente + "]");
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        confirmarActualizacionClientes();
    }

    private void confirmarActualizacionClientes() {
        System.out.println("Desea hacer cambios en otro cliente?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        int opcion = read.nextInt();
        switch (opcion) {
            case 1:
                obtenerClientes();
                actualizarCliente();
                break;
            case 2:
                System.out.println("Gracias!");
                break;
            default:
                System.err.println("Selecciona un opción válida!");
                confirmarActualizacionClientes();
                break;
        }
    }

    public void eliminarCliente() {
        System.out.println("Ingrese el ID del cliente que desea eliminar");
        int id = comprobarInt();
        listaClientes.removeIf(cliente -> id == cliente.getId());
        System.out.println("Cliente [" + id + "] eliminado.");
        obtenerClientes();
    }
}
