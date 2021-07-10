package lucas.poo.ejercicio5;

public class Cuenta {
    private int dni, numeroCuenta;
    private double saldo, interes;

    public Cuenta() {

    }

    public Cuenta(int dni, double saldo, int numeroCuenta, double interes) {
        this.dni = dni;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getDni() {
        return this.dni;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getInteres() {
        return this.interes;
    }
}