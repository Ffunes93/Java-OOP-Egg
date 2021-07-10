package lucas.poo.ejercicio6extra;

import java.util.Vector;

public class Ahorcado {
    private Vector palabra = new Vector(10);
    private int cantidadLetrasEncontradas;
    private int cantidadTurnosRestantes;

    public Ahorcado() {

    }

    public Ahorcado(char palabra[], int cantidadLetrasEncontradas, int cantidadTurnosRestantes) {
        for (char letra : palabra) {
            this.palabra.addElement(letra);
        }
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadTurnosRestantes = cantidadTurnosRestantes;
    }

    public void setPalabra(char[] palabra) {
        for (char letra : palabra) {
            this.palabra.addElement(letra);
        }
    }

    public Vector getPalabra() {
        return this.palabra;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadLetrasEncontradas() {
        return this.cantidadLetrasEncontradas;
    }

    public void setCantidadTurnosRestantes(int cantidadTurnosRestantes) {
        this.cantidadTurnosRestantes = cantidadTurnosRestantes;
    }

    public int getCantidadTurnosRestantes() {
        return this.cantidadTurnosRestantes;
    }
}
