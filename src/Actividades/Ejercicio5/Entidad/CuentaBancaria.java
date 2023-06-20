package Actividades.Ejercicio5.Entidad;

public class CuentaBancaria {

    private int numeroCuenta;
    private long clienteDNI;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long clienteDNI, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.clienteDNI = clienteDNI;
        this.saldoActual = saldoActual;

    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getClienteDNI() {
        return clienteDNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setClienteDNI(long clienteDNI) {
        this.clienteDNI = clienteDNI;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "\n>numeroCuenta=" + numeroCuenta +
                ", \n>clienteDNI=" + clienteDNI +
                ", \n>saldoActual=" + saldoActual +
                '}';
    }
}
