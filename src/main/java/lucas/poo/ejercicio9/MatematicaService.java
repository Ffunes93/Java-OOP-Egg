package lucas.poo.ejercicio9;

public class MatematicaService {
    Matematica operacion = new Matematica();

    public MatematicaService(double numero1, double numero2) {
        operacion.setNumero1(numero1);
        operacion.setNumero2(numero2);
    }

    public int devolverMayor() {
        double numero1 = operacion.getNumero1();
        double numero2 = operacion.getNumero2();
        if (numero1 > numero2) {
            return 1;
        }
        if (numero2 > numero1) {
            return 2;
        }
        return 0;
    }

    public int calcularPotencia() {
        int numero1, numero2;
        numero1 = (int) operacion.getNumero1();
        numero2 = (int) operacion.getNumero2();
        if (devolverMayor() == 1) {
            return (int) Math.pow(numero1, numero2);
        }
        if (devolverMayor() == 2) {
            return (int) Math.pow(numero1, numero2);
        }
        return 0;
    }

    public double calcularRaiz() {
        int numero1, numero2;
        numero1 = Math.abs((int) operacion.getNumero1());
        numero2 = Math.abs((int) operacion.getNumero2());
        if (devolverMayor() == 1) {
            return Math.sqrt(numero2);
        }
        if (devolverMayor() == 2) {
            return Math.sqrt(numero1);
        }
        return 0;
    }
}
