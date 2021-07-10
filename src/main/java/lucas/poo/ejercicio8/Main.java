package lucas.poo.ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CadenaService cadena = new CadenaService();
        System.out.println("Ingrese la frase");
        cadena.crearFrase(scan.nextLine());
        // System.out.println("La cantidad de vocales que tiene es: " +
        // cadena.mostrarVocales());
        // System.out.println("La frase invertida es: " + cadena.invertirFrase());
        // System.out.println("La letra se repite: " + cadena.vecesRepetido("a"));
        // System.out.println("Ingrese palabra a comparar longitud");
        // cadena.compararLongitud(scan.nextLine());
        // System.out.println("Ingrese palabra a unir");
        // cadena.unirFrases(scan.nextLine());
        System.out.println("Ingrese la letra que desea colocar");
        cadena.reemplazar(scan.nextLine());
        System.out.println("Ingrese la letra a buscar");
        if (cadena.contiene(scan.nextLine())) {
            System.out.println("Si la contiene");
        } else {
            System.out.println("No la contiene");
        }
    }
}
