package lucas.poo.ejercicio3extra;

public class RaicesService {
    Raices raices = new Raices();

    public RaicesService(double a, double b, double c) {
        raices.setA(a);
        raices.setB(b);
        raices.setC(c);
    }

    public double getDiscriminante() {
        double a = raices.getA();
        double b = raices.getB();
        double c = raices.getC();
        double discriminante;
        discriminante = Math.pow(b, 2) - 4 * a * c;
        return discriminante;
    }

    public boolean tieneRaices() {
        if (getDiscriminante() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            // (-b +- sqrt(b^2 - 4 ac)) / -2a
            double raiz1;
            double raiz2;
            double a = raices.getA();
            double b = raices.getB();
            double c = raices.getC();
            raiz1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            raiz2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        } else {
            System.out.println("No tiene raices o solo tiene 1");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            // (-b +- sqrt(b^2 - 4 ac)) / -2a
            double raiz;
            double a = raices.getA();
            double b = raices.getB();
            raiz = (-b / (2 * a));
            System.out.println("La raiz es :" + raiz);
        } else {
            System.out.println("No tiene raices");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene solucion");
        }
    }
}
