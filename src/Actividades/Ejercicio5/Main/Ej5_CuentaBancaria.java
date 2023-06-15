package Actividades.Ejercicio5.Main;

import Actividades.Ejercicio5.Entidad.CuentaBancaria;
import Actividades.Ejercicio5.Service.CuentaBancariaService;

public class Ej5_CuentaBancaria {

    public static void main(String[] args) {
        CuentaBancariaService cuentaS = new CuentaBancariaService();
        CuentaBancaria cuentaBancaria = cuentaS.crearCuentaBancaria();

        cuentaS.consultarDatos(cuentaBancaria);
        cuentaS.retirar(cuentaBancaria, 950);
        cuentaS.consultaSaldo(cuentaBancaria);
        cuentaS.ingresar(cuentaBancaria, 300);
        cuentaS.consultaSaldo(cuentaBancaria);
        cuentaS.extraccionRapida(cuentaBancaria);

    }
}
