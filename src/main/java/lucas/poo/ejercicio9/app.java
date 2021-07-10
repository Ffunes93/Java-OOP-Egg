package lucas.poo.ejercicio9;

public class app {
    public static boolean devolver(Character letra) {
        if (letra == 'a') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // double numero1, numero2;
        // numero1 = Math.random() * 10;
        // numero2 = Math.random() * 10;
        // System.out.println("Numero 1: " + numero1);
        // System.out.println("Numero 2: " + numero2);
        // MatematicaService operacion = new MatematicaService(numero1, numero2);
        // System.out.println("El numero mayor es: " + operacion.devolverMayor());
        // System.out.println("La potencia es: " + operacion.calcularPotencia());
        // System.out.println("La raiz es: " + operacion.calcularRaiz());
        System.out.println("Tiene a: " + devolver('a'));
        System.out.println("Tiene a: " + devolver('b'));
    }
}
