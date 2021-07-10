package lucas.poo.ejercicio5extra;

import java.util.Scanner;

public class app {
    public static String getMes() {
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre",
                "octubre", "noviembre", "diciembre" };
        String mesSecreto = meses[4];
        return mesSecreto;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Intente adivinar el mes");
        String mes = scan.next();
        if (mes.equals(getMes())) {
            System.out.println("Ha acertado");
        } else {
            while (!mes.equals(getMes())) {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
                mes = scan.next();
                if (mes.equals(getMes())) {
                    System.out.println("Ha acertado");
                }
            }
        }
    }
}
