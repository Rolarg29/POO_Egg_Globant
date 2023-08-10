package Extras.Extra3;

public class RaicesService {
    //Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a)

    public double getDiscriminante(Raices r) {
        return (Math.pow(r.getB(), 2)) - ((4 * r.getA()) * r.getC());
    }

    public boolean tieneRaices(double discriminante) {
        return (discriminante > 0);
    }

    public boolean tieneRaiz(double discriminante) {
        return (discriminante == 0);
    }

    public void getRaices(Raices r) {
        double dis = getDiscriminante(r);
        double a = r.getA();
        double b = r.getB();
        if (tieneRaices(dis)) {
            double positive = (-b + Math.sqrt(dis)) / (2 * a);
            double negative = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("La solución positiva es [(-" + b + " + √" + dis + ") / (2*" + a + ") ] = " + positive);
            System.out.println("La solución negativa es [(-" + b + " + √" + dis + ") / (2*" + a + ") ] = " + negative);
        }
    }

    public void getRaiz(Raices r) {
        double dis = getDiscriminante(r);
        double a = r.getA();
        double b = r.getB();
        if (tieneRaiz(dis)) {
            double result = (-b + Math.sqrt(dis)) / (2 * a);
            System.out.println("La única solución que existe es: [(-" + b + " +- √" + dis + ") / (2*" + a + ") ] = " + result);
        }
    }

    public void calcular(Raices r) {
        double dis = getDiscriminante(r);
        if (tieneRaices(dis)) {
            getRaices(r);
        } else if (tieneRaiz(dis)) {
            getRaiz(r);
        } else {
            System.out.println("No existe solución para este problema");
        }
    }
}
