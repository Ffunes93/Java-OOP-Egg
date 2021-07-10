package lucas.poo.ejercicio4;

public class app {
    public static void main(String[] args) {
        // Ejercicio 4
        Rectangulo rectangulo = new Rectangulo(2, 3);
        rectangulo.dibujarRectangulo();
        System.out.println(rectangulo.getAltura());
        System.out.println(rectangulo.getBase());
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
        rectangulo.setAltura(5);
        rectangulo.setBase(15);
        System.out.println(rectangulo.getAltura());
        System.out.println(rectangulo.getBase());
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
    }
}
