package Desafios.Desafio_3.Servicios;

import Desafios.Desafio_3.Entidades.Rutina;

import java.util.Scanner;

import static Desafios.Desafio_3.Servicios.CommonServices.comprobarInt;

public class RutinaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Rutina crearRutina() {
        Rutina newRutina = new Rutina();
        CommonServices.insertData(newRutina);
        System.out.println("----------------------------");
        System.out.println("[RUTINA CREADA EXITOSAMENTE]");
        System.out.println("----------------------------");
        return newRutina;
    }

    protected Rutina editarDatosRutina(Rutina rutina) {
        System.out.println("Que datos de la rutina deseas actualizar?");
        System.out.println("1. Nombre de la rutina");
        System.out.println("2. Duración de la rutina");
        System.out.println("3. Nivel de dificultad de la rutina");
        System.out.println("4. Descripción de la rutina");
        System.out.println("5. Todos los datos de la rutina");
        int respuesta = read.nextInt();
        switch (respuesta) {
            case 1:
                System.out.println("Ingrese el nuevo nombre");
                rutina.setNombre(read.next());
                break;
            case 2:
                System.out.println("Ingrese lan nueva duración de la rutina. (sets)");
                rutina.setDuracion(comprobarInt());
                break;
            case 3:
                System.out.println("Ingrese el nivel de dificultad de la rutina. \n1.Baja \n2.Media \n3.Alta");
                rutina.setNivelDificultad(CommonServices.asignarDificultad(comprobarInt()));
                break;
            case 4:
                System.out.println("Ingrese la nueva descripción de la rutina.");
                rutina.setDescripcion(read.next());
                break;
            case 5:
                System.out.println("Ingrese los nuevos datos del cliente");
                CommonServices.insertData(rutina);
        }
        if (CommonServices.realizarMasCambios()) editarDatosRutina(rutina);
        return rutina;
    }
}
