package lucas.poo.ejercicio4extra;

import java.util.Scanner;

public class NIFService {
    NIF nif = new NIF();

    public void crearNif() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su dni");
        long dni = scan.nextLong();
        nif.setDni(dni);
    }

    public String calcularNif() {
        String[] letras = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
                "H", "L", "C", "K", "E" };
        long dni = nif.getDni();
        int letra = (int) dni % 23;
        nif.setNif(letras[letra]);
        return letras[letra];
    }

    public void mostrar() {
        String codigo = nif.getDni() + "-" + calcularNif();
        System.out.println("El codigo Nif es: " + codigo);
    }
}
