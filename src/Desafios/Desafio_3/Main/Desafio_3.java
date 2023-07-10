package Desafios.Desafio_3.Main;

import Desafios.Desafio_3.Servicios.ListaClienteService;

public class Desafio_3 {
    public static void main(String[] args) {
        ListaClienteService listaCliente = new ListaClienteService();
        listaCliente.agregarCliente();
        listaCliente.obtenerClientes();
        listaCliente.actualizarCliente();
        listaCliente.obtenerClientes();
    }
}
