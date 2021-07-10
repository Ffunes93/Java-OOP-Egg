package lucas.poo.ejercicio11;

import java.util.Date;

public class app {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        Date fecha = new Date(1994, 7, 19);
        int year = fechaActual.getYear() - fecha.getYear();
        System.out.println(year);
    }
}
