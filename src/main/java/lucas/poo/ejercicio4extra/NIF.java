package lucas.poo.ejercicio4extra;

public class NIF {
    private long dni;
    private String nif;

    public NIF() {

    }

    public NIF(long dni) {
        this.dni = dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public long getDni() {
        return this.dni;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return this.nif;
    }
}
