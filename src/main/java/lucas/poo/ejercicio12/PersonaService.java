package lucas.poo.ejercicio12;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Persona persona = new Persona();

    public void crearPersona() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        persona.setNombre(scan.nextLine());
        System.out.println("Ingrese su fecha de nacimiento (dia)");
        persona.setDia(scan.nextInt());
        System.out.println("Ingrese su fecha de nacimiento (mes)");
        persona.setMes(scan.nextInt());
        System.out.println("Ingrese su fecha de nacimiento (year)");
        persona.setYear(scan.nextInt());
    }

    public int calcularEdad() {
        Date fechaActual = new Date();
        int year = fechaActual.getYear();
        int mes = fechaActual.getMonth();
        int dia = fechaActual.getDate();
        int anios = 0;
        if (mes < persona.getFechaNacimiento().getMonth()) {
            anios = year - persona.getFechaNacimiento().getYear() - 1;
        } else if (mes == persona.getFechaNacimiento().getMonth()) {
            if (dia < persona.getFechaNacimiento().getDate()) {
                anios = year - persona.getFechaNacimiento().getYear() - 1;
            } else {
                anios = year - persona.getFechaNacimiento().getYear();
            }
        } else {
            anios = year - persona.getFechaNacimiento().getYear();
        }
        return anios;
    }

    public boolean menorQue(int edad) {
        if (calcularEdad() < edad) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrarPersona() {
        String fechaNacimiento;
        System.out.println("Nombre: " + persona.getNombre());
        fechaNacimiento = persona.getDia() + "/" + (persona.getMes() + 1) + "/" + (persona.getYear() + 1900);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    }
}
