package lucas.poo.ejercicio5;

public class app {
    public static void main(String[] args) {

        // Ejercicio 5
        CuentaService cuenta = new CuentaService();
        cuenta.crearCuenta();
        cuenta.consultarSaldo();
        cuenta.consultarDatos();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        cuenta.ingresar(1500);
        cuenta.consultarSaldo();
        cuenta.retirar(300);
        cuenta.consultarSaldo();
    }
}
