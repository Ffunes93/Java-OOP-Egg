package lucas.poo.ejercicio8;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {

    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = this.frase.length();
    }

    public String getFrase() {
        return this.frase;
    }

    public int getLongitud() {
        return this.longitud;
    }

}
