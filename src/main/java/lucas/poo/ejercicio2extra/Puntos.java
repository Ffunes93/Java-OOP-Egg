package lucas.poo.ejercicio2extra;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Puntos {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Puntos() {

    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return this.x1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY1() {
        return this.y1;
    }

    public int getY2() {
        return this.y2;
    }

    public void crearPuntos() {
        System.out.println("Por favor ingrese la primer coordenada");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese x");
        setX1(scan.nextInt());
        System.out.println("Ingrese y");
        setY1(scan.nextInt());
        System.out.println("Por favor ingrese la segunda coordenada");
        System.out.println("Ingrese x");
        setX2(scan.nextInt());
        System.out.println("Ingrese y");
        setY2(scan.nextInt());
        scan.close();
    }

    public double calcularDistancia() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("###.##", decimalFormatSymbols);
        double abs = (double) this.x2 - this.x1;
        double ord = (double) this.y2 - this.y1;
        double distancia = (double) Math.sqrt(Math.pow(abs, 2) + Math.pow(ord, 2));
        distancia = Double.parseDouble(decimalFormat.format(distancia));
        return distancia;
    }

}
