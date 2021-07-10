package lucas.poo.ejercicio12;

import java.util.Date;

public class Persona {
    private String nombre;
    private int dia;
    private int mes;
    private int year;

    public Persona() {

    }

    public Persona(String nombre, int dia, int mes, int year) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = (mes - 1);
        this.year = (year - 1900);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = (mes - 1);
    }

    public void setYear(int year) {
        this.year = (year - 1900);
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getYear() {
        return this.year;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Date getFechaNacimiento() {
        Date fecha = new Date(this.year, this.mes, this.dia);
        return fecha;
    }
}
