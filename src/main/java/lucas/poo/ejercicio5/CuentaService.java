package lucas.poo.ejercicio5;

import java.util.Scanner;

public class CuentaService {

    Cuenta cuenta = new Cuenta();

    public void crearCuenta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el dni");
        cuenta.setDni(scan.nextInt());
        System.out.println("Ingrese el saldo");
        cuenta.setSaldo(scan.nextDouble());
        System.out.println("Ingrese el numero de cuenta");
        cuenta.setNumeroCuenta(scan.nextInt());
        System.out.println("Ingrese el interes");
        cuenta.setInteres(scan.nextDouble());
        scan.close();
    }

    public void ingresar(double ingreso) {
        double saldo;
        saldo = cuenta.getSaldo();
        cuenta.setSaldo(saldo + ingreso);
    }

    public void retirar(double retiro) {
        double saldo;
        saldo = cuenta.getSaldo();
        if (saldo < retiro) {
            cuenta.setSaldo(0);
        } else {
            cuenta.setSaldo(saldo - retiro);
        }
    }

    public void extraccionRapida() {
        double saldo;
        saldo = cuenta.getSaldo();
        cuenta.setSaldo(saldo * .8);
    }

    public void consultarSaldo() {
        System.out.println(cuenta.getSaldo());
    }

    public void consultarDatos() {
        System.out.println(cuenta.getDni());
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getInteres());
        System.out.println(cuenta.getNumeroCuenta());
    }
}