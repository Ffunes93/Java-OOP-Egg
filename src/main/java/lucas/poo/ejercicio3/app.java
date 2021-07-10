package lucas.poo.ejercicio3;

public class app {
    public static void main(String[] args) {
        // Ejercicio 3
        Operacion operacion = new Operacion(3, 6);
        System.out.println("El numero 1 es " + operacion.getNumero1());
        System.out.println("El numero 2 es " + operacion.getNumero2());
        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        if (operacion.multiplicar() == 0) {
            System.out.println("Error - Multiplicacion por 0");
        } else {
            System.out.println("Multiplicacion" + operacion.multiplicar());
        }
        if (operacion.dividir() == 0) {
            System.out.println("Error - Division por 0");
        } else {
            System.out.println("Division:" + operacion.dividir());
        }
        operacion.crearOperacion(15, 0);
        System.out.println("El numero 1 es " + operacion.getNumero1());
        System.out.println("El numero 2 es " + operacion.getNumero2());
        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        if (operacion.multiplicar() == 0) {
            System.out.println("Error - Multiplicacion por 0");
        } else {
            System.out.println("Multiplicacion" + operacion.multiplicar());
        }
        if (operacion.dividir() == 0) {
            System.out.println("Error - Division por 0");
        } else {
            System.out.println("Division:" + operacion.dividir());
        }
    }
}
