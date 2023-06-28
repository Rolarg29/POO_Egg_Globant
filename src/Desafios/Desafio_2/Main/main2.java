package Desafios.Desafio_2.Main;

import Desafios.Desafio_2.Entidades.Alquiler;
import Desafios.Desafio_2.Services.AlquilerService;

public class main2 {
    public static void main(String[] args) {
        Alquiler a = new Alquiler();
        AlquilerService as = new AlquilerService();
        a.setFechaInicio(as.definirFecha());
        a.setFechaFin(as.definirFecha());

        long dias = a.getFechaFin().getTime()- a.getFechaInicio().getTime();
        System.out.println(dias/86400000);
    }
}
