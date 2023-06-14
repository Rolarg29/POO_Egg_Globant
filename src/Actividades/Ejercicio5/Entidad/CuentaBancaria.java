package Actividades.Ejercicio5.Entidad;

public class CuentaBancaria {

    private int numeroCuenta;
    private long clienteDNI;
    private int saldoActual;
    private double interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long clienteDNI, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.clienteDNI = clienteDNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getClienteDNI() {
        return clienteDNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setClienteDNI(long clienteDNI) {
        this.clienteDNI = clienteDNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
