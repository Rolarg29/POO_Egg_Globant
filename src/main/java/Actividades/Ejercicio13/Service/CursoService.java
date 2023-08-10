package Actividades.Ejercicio13.Service;

import Actividades.Ejercicio13.Entidad.Curso;

import java.util.Scanner;

import static java.lang.System.in;

public class CursoService {
    Scanner read = new Scanner(in).useDelimiter("\n");

    private void cargarAlumnos(Curso curso) {
        String[] alumnos = new String[5];
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println("Ingrese el nombre del alumno (" + (i + 1) + "/5)");
            alumnos[i] = read.next();
        }
        curso.setAlumnos(alumnos);
    }

    private void verificarTurno(Curso curso) {
        System.out.println("Indique el turno del curso con 1 o 2. (1->Mañana / 2->Tarde)");
        int turno = read.nextInt();
        if (turno == 1) {
            curso.setTurno("Mañana");
            System.out.println("Se selecciono el turno de MAÑANA.");
        } else if (turno == 2) {
            curso.setTurno("Tarde");
            System.out.println("Se selecciono el turno de TARDE.");
        } else {
            System.out.println("Indique una opción valida para el turno!");
            verificarTurno(curso);
        }
    }

    public Curso crearCurso() {
        Curso curso = new Curso();
        System.out.println("Indique el nombre del curso.");
        curso.setNombreCurso(read.nextLine());
        System.out.println("Indique la cantidad de horas por día");
        curso.setCantidadHorasPorDia(read.nextInt());
        System.out.println("Indique la cantidad de días por semana");
        curso.setCantidadDiasPorSemana(read.nextInt());
        verificarTurno(curso);
        System.out.println("Indique el precio por hora que tendrá el curso.");
        curso.setPrecioPorHora(read.nextDouble());
        cargarAlumnos(curso);

        return curso;
    }

    public void calcularGanancia(Curso curso) {
        double ganancia = curso.getPrecioPorHora() * curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getAlumnos().length;
        System.out.println("La ganancia del curso es: " + ganancia);
    }

    public void mostrarCurso(Curso curso) {
        System.out.println(curso);
    }
}
