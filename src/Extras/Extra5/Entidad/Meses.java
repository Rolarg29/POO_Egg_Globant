package Extras.Extra5.Entidad;

public class Meses {
    private String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
      "agosto", "septiembre", "octubre", "novembre", "diciembre"
    };
    private String mesSecreto;

    public String[] getMes() {
        return mes;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}
