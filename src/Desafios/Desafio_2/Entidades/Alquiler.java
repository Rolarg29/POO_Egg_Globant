package Desafios.Desafio_2.Entidades;

import java.util.Date;

public class Alquiler {
    private String peliculaAlquilada;
    private Date fechaInicio;
    private Date fechaFin;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(String peliculaAlquilada, Date fechaInicio, Date fechaFin, double precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "peliculaAlquilada='" + peliculaAlquilada + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", precio=" + precio +
                '}';
    }
}
