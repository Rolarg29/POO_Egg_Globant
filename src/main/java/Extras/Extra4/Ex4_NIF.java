package Extras.Extra4;

public class Ex4_NIF {
    public static void main(String[] args) {
        NifService nifService = new NifService();
        NIF nif1 = nifService.crearNIF();
        nifService.mostrarNIF(nif1);
    }
}
