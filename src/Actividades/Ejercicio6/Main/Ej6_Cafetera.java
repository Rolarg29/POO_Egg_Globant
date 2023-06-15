package Actividades.Ejercicio6.Main;

import Actividades.Ejercicio6.Entidad.Cafetera;
import Actividades.Ejercicio6.Service.CafeteraService;

public class Ej6_Cafetera {

    public static void main(String[] args) {
        CafeteraService cafeServicio = new CafeteraService();
        Cafetera cafetera = cafeServicio.crearCafetera();

        cafeServicio.llenarCafetera(cafetera);
        cafeServicio.vaciarCafetera(cafetera);
        cafeServicio.agregarCafe(cafetera);
        cafeServicio.servirTaza(cafetera);
    }
}
