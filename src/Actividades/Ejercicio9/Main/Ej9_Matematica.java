package Actividades.Ejercicio9.Main;

import Actividades.Ejercicio9.Entidad.Matematica;
import Actividades.Ejercicio9.Service.MatematicaService;

public class Ej9_Matematica {

    public static void main(String[] args) {
        Matematica mate = new Matematica();
        mate.setNumero1(6.83);
        mate.setNumero2(8.3126);

        MatematicaService.devolverMayor(mate);
        MatematicaService.calcularPotencia(mate);
        MatematicaService.calcularRaiz(mate);
    }
}
