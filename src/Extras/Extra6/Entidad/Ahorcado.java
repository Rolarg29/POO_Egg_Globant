package Extras.Extra6.Entidad;

public class Ahorcado {
    private String[] palabra;
    private int cantidadLetrasAcertadas;
    private int cantidadJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantidadLetrasAcertadas, int cantidadJugadas) {
        this.palabra = palabra;
        this.cantidadLetrasAcertadas = cantidadLetrasAcertadas;
        this.cantidadJugadas = cantidadJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetrasAcertadas() {
        return cantidadLetrasAcertadas;
    }

    public void setCantidadLetrasAcertadas(int cantidadLetrasAcertadas) {
        this.cantidadLetrasAcertadas = cantidadLetrasAcertadas;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }
}
