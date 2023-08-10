package Extras.Extra5.Main;

import Extras.Extra5.Entidad.Meses;
import Extras.Extra5.Service.MesesService;

public class Ex5_Meses {
    public static void main(String[] args) {
        MesesService ms = new MesesService();
        Meses mes = ms.crearMesSecreto();
        ms.encontrarMesSecreto(mes);
    }
}
