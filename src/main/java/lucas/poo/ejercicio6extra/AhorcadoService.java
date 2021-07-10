package lucas.poo.ejercicio6extra;

import java.util.Scanner;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class AhorcadoService {
    Ahorcado ahorcado = new Ahorcado();

    public void crearJuego() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la palabra a adivinar");
        String palabra = scan.next();
        System.out.println("Ingrese la cantidad de turnos maximos");
        int turnos = scan.nextInt();
        char[] palabraAhorcado = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraAhorcado[i] = palabra.charAt(i);
        }
        ahorcado.setPalabra(palabraAhorcado);
        ahorcado.setCantidadLetrasEncontradas(0);
        ahorcado.setCantidadTurnosRestantes(turnos);
    }

    public void longitud() {
        System.out.println("Longitud de la palabra: " + ahorcado.getPalabra().size());
    }

    public void buscarLetra() {
        Scanner scan = new Scanner(System.in);
        int encontrado = 0;
        System.out.println("Ingrese una letra");
        char letra = scan.next().charAt(0);
        if (encontradas(letra)) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
            for (int i = 0; i < ahorcado.getPalabra().size(); i++) {
                if (ahorcado.getPalabra().elementAt(i).toString().charAt(0) == letra) {
                    encontrado += 1;
                }
            }
            ahorcado.setCantidadLetrasEncontradas(ahorcado.getCantidadLetrasEncontradas() + encontrado);
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
            ahorcado.setCantidadTurnosRestantes(ahorcado.getCantidadTurnosRestantes() - 1);
        }
        System.out.println("Numero de letras(encontradas, faltantes): (" + ahorcado.getCantidadLetrasEncontradas()
                + ", " + (ahorcado.getPalabra().size() - ahorcado.getCantidadLetrasEncontradas()) + ")");

    }

    public boolean encontradas(char letra) {
        for (int i = 0; i < ahorcado.getPalabra().size(); i++) {
            if (ahorcado.getPalabra().elementAt(i).toString().charAt(0) == letra) {
                return true;
            }
        }
        return false;
    }

    public int intentos() {
        return ahorcado.getCantidadTurnosRestantes();
    }

    public void juego() {
        crearJuego();
        while (intentos() > 0) {
            buscarLetra();
            longitud();
            System.out.println("Numero de oportunidades restantes: " + intentos());
            if (intentos() > 1 && ahorcado.getCantidadLetrasEncontradas() == ahorcado.getPalabra().size()) {
                System.out.println("Ha ganado!");
                break;
            }
            if (intentos() == 0) {
                System.out.println("Ahorcado!");
                break;
            }
        }
    }
}
