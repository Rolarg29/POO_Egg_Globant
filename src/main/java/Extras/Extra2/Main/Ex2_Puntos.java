package Extras.Extra2.Main;

import Extras.Extra2.Entidad.Puntos;
import Extras.Extra2.Service.PuntosService;

public class Ex2_Puntos {
    public static void main(String[] args) {
        PuntosService pService = new PuntosService();
        Puntos puntos1 = pService.crearPuntos();
        pService.calcularDistancia(puntos1);
    }
}
