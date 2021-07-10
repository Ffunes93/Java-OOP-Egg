package lucas.poo.ejercicio12;

public class app {
    public static void main(String[] args) {
        PersonaService persona = new PersonaService();
        persona.crearPersona();
        System.out.println(persona.calcularEdad());
        System.out.println(persona.menorQue(25));
        persona.mostrarPersona();

    }

}
