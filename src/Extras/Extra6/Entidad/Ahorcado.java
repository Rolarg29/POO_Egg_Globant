package Extras.Extra6.Entidad;

public class Ahorcado {
    private char[] palabra;
    private int cantidadLetrasAcertadas;
    private int cantidadJugadas;

    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantidadLetrasAcertadas, int cantidadJugadas) {
        this.palabra = palabra;
        this.cantidadLetrasAcertadas = cantidadLetrasAcertadas;
        this.cantidadJugadas = cantidadJugadas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
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
