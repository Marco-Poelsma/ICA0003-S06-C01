public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void dormir() {
        System.out.println("Zzz");
    }

    public void hablar() {
        System.out.println("Bla bla bla...");
    }

    public void decirNombre() {
        System.out.println(nombre);
    }
}
