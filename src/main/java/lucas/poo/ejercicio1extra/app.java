package lucas.poo.ejercicio1extra;

public class app {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("How deep is your love", "Bee Gees");
        System.out.println(cancion.getAutor());
        System.out.println(cancion.getTitulo());
        cancion.setAutor("Sting");
        cancion.setTitulo("Shape of my Heart");
        System.out.println(cancion.getAutor());
        System.out.println(cancion.getTitulo());
    }
}
