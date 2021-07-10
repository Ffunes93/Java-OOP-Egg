package lucas.poo.ejercicio10;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;

public class app {
    public static double[] rellenarVector(double[] vector, int longitud) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("###.##", decimalFormatSymbols);
        for (int i = 0; i < longitud; i++) {
            vector[i] = Double.parseDouble(decimalFormat.format(Math.random() * 10));
        }
        return vector;
    }

    public static double[] ordenarVector(double[] vector) {
        Arrays.sort(vector);
        return vector;
    }

    public static void main(String[] args) {
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];

        vectorA = rellenarVector(vectorA, 50);
        System.out.println(Arrays.toString(vectorA));
        vectorA = ordenarVector(vectorA);
        System.out.println(Arrays.toString(vectorA));
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                vectorB[i] = vectorA[i];
            }
            if (i >= 10 && i < 20) {
                vectorB[i] = 0.50;
            }
        }
        System.out.println("El vector A");
        System.out.println(Arrays.toString(vectorA));
        System.out.println("El vector B");
        System.out.println(Arrays.toString(vectorB));
    }
}
