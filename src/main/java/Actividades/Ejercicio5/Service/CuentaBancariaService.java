package Actividades.Ejercicio5.Service;

import Actividades.Ejercicio5.Entidad.CuentaBancaria;

import java.util.Scanner;

import static java.lang.System.in;

public class CuentaBancariaService {
    Scanner read = new Scanner(in);

    public CuentaBancaria crearCuentaBancaria() {
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        System.out.println("Ingrese el número de cuenta bancaria");
        cuentaBancaria.setNumeroCuenta(read.nextInt());

        System.out.println("Ingrese el DNI del cliente");
        cuentaBancaria.setClienteDNI(read.nextLong());

        System.out.println("Ingrese el saldo actual de la cuenta bancaria");
        cuentaBancaria.setSaldoActual(read.nextDouble());

        return cuentaBancaria;
    }

    public void ingresar(CuentaBancaria cuenta, double ingreso) {
        System.out.println("Deposito exitoso");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
    }

    public void retirar(CuentaBancaria cuenta, double retiro) {
        double saldo = cuenta.getSaldoActual();
        if (saldo < retiro) {
            System.out.println("Saldo insuficiente");
            cuenta.setSaldoActual(0);
        } else {
            System.out.println("Retiro exitoso");
            cuenta.setSaldoActual(saldo - retiro);
        }
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double saldo = cuenta.getSaldoActual();
        double retiroMax = saldo * .2;
        System.out.println("Cuanto desea retirar?");
        double retiro = read.nextDouble();
        if (retiro > retiroMax) {
            System.out.println("Solo puede sacar hasta un 20% (Maximo: " + retiroMax + ")");
            extraccionRapida(cuenta);
        } else {
            retirar(cuenta, retiro);
        }
    }

    public void consultaSaldo(CuentaBancaria cuenta) {
        System.out.println("Su saldo actual es de: " + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println(cuenta);
    }

}
