package Actividades.Ejercicio14.Entidad;

import java.util.Arrays;

public class Mobile {
    private String marca;
    private String modelo;
    private double precio;
    private String memoriaRam;
    private String almacenamiento;
    private int[] codigo;

    public Mobile() {
    }

    public Mobile(String marca, String modelo, double precio, String memoriaRam, String almacenamiento, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public String getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "\nmarca= '" + marca + '\'' +
                ", \nmodelo= '" + modelo + '\'' +
                ", \nprecio= $" + precio +
                ", \nmemoriaRam= '" + memoriaRam + '\'' +
                ", \nalmacenamiento= '" + almacenamiento + '\'' +
                ", \ncodigo=" + Arrays.toString(codigo) + "\n" +
                '}';
    }
}
