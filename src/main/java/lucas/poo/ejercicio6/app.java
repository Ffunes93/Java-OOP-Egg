package lucas.poo.ejercicio6;

public class app {
    public static void main(String[] args) {

        // Ejercicio 6
        CafeteraService cafetera = new CafeteraService();
        cafetera.llenarCafetera();
        cafetera.servirTaza(25);
        cafetera.servirTaza(25);
        cafetera.servirTaza(20);
        cafetera.servirTaza(25);
        cafetera.servirTaza(35);
    }
}
