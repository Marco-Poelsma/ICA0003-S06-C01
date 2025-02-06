public class Coche {
    private double velocidad;

    public void acelerar(double incremento) {
        velocidad += incremento;
    }

    public void frenar(double decremento) {
        velocidad -= decremento;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public Coche() {
        velocidad = 0;
    }

    public Coche(double velocidad) {
        this.velocidad = velocidad;
    }

    public static void menu() {
        System.out.println("[1] Acelerar");
        System.out.println("[2] Frenar");
        System.out.println("[3] Imprimir velocidad");
        System.out.println("[4] Salir");
    }
}
