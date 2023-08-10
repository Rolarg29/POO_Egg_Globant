package Extras.Extra3;

public class Ex3_Raices {
    public static void main(String[] args) {
        RaicesService rService = new RaicesService();
        Raices raices1 = new Raices(2, 5, -3);
        Raices raices2 = new Raices(3, 6, 3);

        rService.calcular(raices1);
        System.out.println("==============================================");
        rService.calcular(raices2);
    }
}
