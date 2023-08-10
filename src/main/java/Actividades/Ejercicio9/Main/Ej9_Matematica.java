package Actividades.Ejercicio9.Main;

import Actividades.Ejercicio9.Entidad.Matematica;
import Actividades.Ejercicio9.Service.MatematicaService;

public class Ej9_Matematica {

    public static void main(String[] args) {
        Matematica mate = new Matematica((Math.random() * 10), (Math.random() * 10));
        System.out.println(mate);
        MatematicaService.calcularPotencia(mate);
        MatematicaService.calcularRaiz(mate);
    }
}
