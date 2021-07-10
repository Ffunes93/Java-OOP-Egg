package lucas.poo.ejercicio6;

public class CafeteraService {
    Cafetera cafetera = new Cafetera(100, 0);

    public void llenarCafetera() {
        int capacidadMaxima = cafetera.getCapacidadMaxima();
        cafetera.setCantidadActual(capacidadMaxima);
    }

    public void servirTaza(int size) {
        int cantidadTotal = cafetera.getCantidadActual();
        if (cantidadTotal == 0) {
            System.out.println("No hay cafe, por favor rellene la cafetera");
        } else {
            if (cantidadTotal < size) {
                System.out.println("La taza no se lleno completamente");
                System.out.println("La taza se lleno en " + cantidadTotal + " unidades");
                cafetera.setCantidadActual(0);
            } else {
                System.out.println("La taza se lleno completamente");
                cafetera.setCantidadActual(cantidadTotal - size);
            }
        }
    }

    public void vaciarCafetera() {
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe(int cantidad) {
        cafetera.setCantidadActual(cantidad);
    }
}
