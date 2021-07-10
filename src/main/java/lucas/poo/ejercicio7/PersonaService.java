package lucas.poo.ejercicio7;

public class PersonaService {
    Persona persona = new Persona();

    public void crearPersona(String nombre, int edad, double peso, double altura) {
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setPeso(peso);
        persona.setAltura(altura);
    }

    public int calcularIMC() {
        double imc, peso, altura;
        altura = persona.getAltura() / 100;
        peso = persona.getPeso();
        imc = peso / Math.pow(altura, 2);
        if (imc > 25) {
            return 1;
        }
        if (imc < 20) {
            return -1;
        }
        if (imc >= 20 && imc <= 25) {
            return 0;
        }
        return 2;
    }

    public boolean esMayorDeEdad() {

        if (persona.getEdad() >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
