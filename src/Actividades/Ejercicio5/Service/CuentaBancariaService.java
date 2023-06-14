package Actividades.Ejercicio5.Service;

import Actividades.Ejercicio5.Entidad.CuentaBancaria;

import java.util.Scanner;
import static java.lang.System.in;

public class CuentaBancariaService {
    Scanner read = new Scanner(in);

    public CuentaBancaria crearCuentaBancaria(){
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        System.out.println("Ingrese el número de cuenta bancaria");
        cuentaBancaria.setNumeroCuenta(read.nextInt());

        System.out.println("Ingrese el DNI del cliente");
        cuentaBancaria.setClienteDNI(read.nextLong());

        System.out.println("Ingrese el saldo actual de la cuenta bancaria");
        cuentaBancaria.setSaldoActual(read.nextInt());

        System.out.println("Ingrese el número de cuenta bancaria");
        cuentaBancaria.setNumeroCuenta(read.nextInt());

        return cuentaBancaria;
    }
}
