package lucas.poo.ejercicio7;

public class app {
    public static void main(String[] args) {
        // Ejercicio 7
        double mayores, menores, menosPeso, buenPeso, masPeso;
        mayores = 0;
        menores = 0;
        menosPeso = 0;
        buenPeso = 0;
        masPeso = 0;
        PersonaService persona = new PersonaService();
        persona.crearPersona("Lucas", 26, 82, 175);
        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
            mayores += 1;
        } else {
            System.out.println("No es mayor de edad");
            menores += 1;
        }
        if (persona.calcularIMC() == 1) {
            System.out.println("Esta por encima del peso ideal");
            masPeso += 1;
        }
        if (persona.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
            buenPeso += 1;
        }
        if (persona.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
            menosPeso += 1;
        }
        if (persona.calcularIMC() == 2) {
            System.out.println("Error");
        }
        PersonaService persona2 = new PersonaService();
        persona2.crearPersona("Pamela", 56, 65, 163);
        if (persona2.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
            mayores += 1;
        } else {
            System.out.println("No es mayor de edad");
            menores += 1;
        }
        if (persona2.calcularIMC() == 1) {
            System.out.println("Esta por encima del peso ideal");
            masPeso += 1;
        }
        if (persona2.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
            buenPeso += 1;
        }
        if (persona2.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
            menosPeso += 1;
        }
        if (persona2.calcularIMC() == 2) {
            System.out.println("Error");
        }
        PersonaService persona3 = new PersonaService();
        persona3.crearPersona("Tony", 57, 80, 173);
        if (persona3.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
            mayores += 1;
        } else {
            System.out.println("No es mayor de edad");
            menores += 1;
        }
        if (persona3.calcularIMC() == 1) {
            System.out.println("Esta por encima del peso ideal");
            masPeso += 1;
        }
        if (persona3.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
            buenPeso += 1;
        }
        if (persona3.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
            menosPeso += 1;
        }
        if (persona3.calcularIMC() == 2) {
            System.out.println("Error");
        }
        PersonaService persona4 = new PersonaService();
        persona4.crearPersona("Tomas", 17, 65, 170);
        if (persona4.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
            mayores += 1;
        } else {
            System.out.println("No es mayor de edad");
            menores += 1;
        }
        if (persona4.calcularIMC() == 1) {
            System.out.println("Esta por encima del peso ideal");
            masPeso += 1;
        }
        if (persona4.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
            buenPeso += 1;
        }
        if (persona4.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
            menosPeso += 1;
        }
        if (persona4.calcularIMC() == 2) {
            System.out.println("Error");
        }
        System.out.println("Hay " + mayores + " mayores, es decir " + (mayores / 4 * 100) + " %");
        System.out.println("Hay " + menores + " menores, es decir " + (menores / 4 * 100) + " %");
        System.out.println("Hay " + menosPeso + " delgados, es decir " + (menosPeso / 4 * 100) + " %");
        System.out.println("Hay " + buenPeso + " de buen peso, es decir " + (buenPeso / 4 * 100) + " %");
        System.out.println("Hay " + masPeso + " de mas peso, es decir " + (masPeso / 4 * 100) + " %");
    }
}
