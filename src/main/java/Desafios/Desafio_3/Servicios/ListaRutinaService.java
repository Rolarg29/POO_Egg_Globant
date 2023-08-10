package Desafios.Desafio_3.Servicios;

import Desafios.Desafio_3.Entidades.Rutina;

import java.util.ArrayList;
import java.util.Scanner;

import static Desafios.Desafio_3.Servicios.CommonServices.comprobarInt;

public class ListaRutinaService {
    ArrayList<Rutina> listaRutinas = new ArrayList<>();
    RutinaService rService = new RutinaService();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void agregarRutina() {
        Rutina newRutina = rService.crearRutina();
        newRutina.setId(listaRutinas.size() + 1);
        listaRutinas.add(newRutina);
    }

    public void obtenerRutinas() {
        System.out.println("==~==<>==~==<>==~==[>> LISTA DE RUTINAS <<]==~==<>==~==<>==~==");
        System.out.println();
        for (Rutina r : listaRutinas) {
            System.out.println(r);
        }
        System.out.println();
        System.out.println("==~==<>==~==<>==~==<>==~==<>==~==<>==~==<>==~==<>==~==<>==~==");
    }

    public void actualizarRutina() {
        System.out.println("Indique el ID de la rutina que desea actualizar");
        int id = comprobarInt();
        for (Rutina r : listaRutinas) {
            if (r.getId() == id) {
                System.out.println("Rutina seleccionada -> [" + r + "]");
                listaRutinas.set(listaRutinas.indexOf(r), rService.editarDatosRutina(r));
                System.out.println("Rutina actualizada -> [" + r + "]");
                break;
            }
        }
        confirmarActualizacionRutina();
    }

    private void confirmarActualizacionRutina() {
        System.out.println("Desea hacer cambios en otra rutina?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        int opcion = read.nextInt();
        switch (opcion) {
            case 1:
                obtenerRutinas();
                actualizarRutina();
                break;
            case 2:
                System.out.println("Gracias!");
                break;
            default:
                System.err.println("Selecciona un opción válida!");
                confirmarActualizacionRutina();
                break;
        }
    }

    public void eliminarRutina() {
        System.out.println("Ingrese el ID de la rutina que desea eliminar");
        int id = comprobarInt();
        listaRutinas.removeIf(r -> id == r.getId());
        System.out.println("Rutina eliminada.");
        obtenerRutinas();
    }
}
