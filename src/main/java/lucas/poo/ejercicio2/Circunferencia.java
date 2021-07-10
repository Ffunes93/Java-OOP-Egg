package lucas.poo.ejercicio2;

import static java.lang.Math.PI;

public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {

    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        double area;
        area = PI * Math.pow(this.radio, 2);
        return area;
    }

    public double getPerimetro() {
        double perimetro;
        perimetro = 2 * PI * this.radio;
        return perimetro;
    }
}
