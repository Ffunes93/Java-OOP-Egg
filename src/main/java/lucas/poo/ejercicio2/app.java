package lucas.poo.ejercicio2;

public class app {
    public static void main(String[] args) {
        // Ejercicio 2
        Circunferencia circulo = new Circunferencia();
        circulo.crearCircunferencia(5.35);
        System.out.println(circulo.getRadio());
        System.out.println(circulo.getArea());
        System.out.println(circulo.getPerimetro());
        circulo.setRadio(4);
        System.out.println(circulo.getRadio());
        System.out.println(circulo.getArea());
        System.out.println(circulo.getPerimetro());
    }
}
