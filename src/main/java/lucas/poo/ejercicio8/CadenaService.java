package lucas.poo.ejercicio8;

import java.util.Scanner;

public class CadenaService {
    Cadena cadena = new Cadena();

    public void crearFrase(String frase) {
        cadena.setFrase(frase);
    }

    public int mostrarVocales() {
        int vocales = 0;
        int longitud = cadena.getLongitud();
        String frase = cadena.getFrase().toUpperCase();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals("A") || frase.substring(i, (i + 1)).equals("E")
                    || frase.substring(i, (i + 1)).equals("I") || frase.substring(i, (i + 1)).equals("O")
                    || frase.substring(i, (i + 1)).equals("U")) {
                vocales += 1;
            }
        }
        return vocales;
    }

    public String invertirFrase() {
        String frase = cadena.getFrase();
        int longitud = cadena.getLongitud();
        String fraseInvertida = "";
        int i = longitud;
        while (i > 0) {
            fraseInvertida += frase.substring((i - 1), i);
            i -= 1;
        }
        return fraseInvertida;
    }

    public int vecesRepetido(String letra) {
        int repetido = 0;
        String frase = cadena.getFrase();
        int longitud = cadena.getLongitud();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals(letra)) {
                repetido += 1;
            }
        }
        return repetido;
    }

    public void compararLongitud(String fraseIngresada) {
        String fraseInicial = cadena.getFrase();
        if (fraseInicial.length() > fraseIngresada.length()) {
            System.out.println("La frase " + fraseInicial + " es mas larga");
        } else {
            System.out.println("La frase " + fraseIngresada + " es mas larga");
        }
        if (fraseInicial.length() == fraseIngresada.length()) {
            System.out.println("Ambas frases son iguales en longitud");
        }
    }

    public void unirFrases(String fraseIngresada) {
        String fraseInicial = cadena.getFrase();
        String frase;
        System.out.println("Ingrese la frase a unir");
        frase = fraseInicial + " " + fraseIngresada;
        System.out.println(frase);
    }

    public void reemplazar(String letra) {
        String frase = cadena.getFrase();
        String nuevaFrase = "";
        int longitud = cadena.getLongitud();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals("a")) {
                nuevaFrase += letra;
            } else {
                nuevaFrase += frase.substring(i, (i + 1));
            }
        }
        System.out.println(nuevaFrase);
    }

    public boolean contiene(String letra) {
        int longitud = cadena.getLongitud();
        boolean contiene = false;
        String frase = cadena.getFrase();
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals(letra)) {
                return true;
            }
        }
        return contiene;
    }
}