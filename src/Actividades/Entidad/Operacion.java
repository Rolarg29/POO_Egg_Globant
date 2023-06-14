package Actividades.Entidad;

public class Operacion {

    private double numero1;
    private double numero2;

    //Constructor vacío
    public Operacion() {
    }

    //Constructor con TODOS los atributos
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Getters
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    //setters
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
