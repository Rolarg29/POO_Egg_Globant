package Actividades.Ejercicio13.Main;

import Actividades.Ejercicio13.Entidad.Curso;
import Actividades.Ejercicio13.Service.CursoService;

public class Ej13_Curso {
    public static void main(String[] args) {

        CursoService cService = new CursoService();
        Curso curso = cService.crearCurso();
        cService.mostrarCurso(curso);
        cService.calcularGanacia(curso);

    }
}
