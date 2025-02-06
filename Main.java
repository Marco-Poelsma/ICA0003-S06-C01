import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Ej 1
        Quotation.display();
        Quotation.setQuote("This is a new quote!");
        Quotation.display();

        //Ej 2
        Persona persona = new Persona("Juan");
        persona.decirNombre();
        persona.hablar();
        persona.dormir();

        //Ej 3
        TShirt tshirt = new TShirt(223388, "Camiseta manga corta mujer Perkins", 'M', 19.90, 100);
        tshirt.displayInformation();
        
        //Ej 4
        Scanner scan = new Scanner(System.in);
        Coche coche = new Coche();
        Coche.menu();
        byte opcion = scan.nextByte();
        while (opcion != 4) {
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese la cantidad de aceleración:");
                    coche.acelerar(scan.nextDouble());
                }
                case 2 -> {
                    System.out.println("Ingrese la cantidad de frenado:");
                    coche.frenar(scan.nextDouble());
                }
                case 3 -> System.out.println("La velocidad actual es: " + coche.getVelocidad());
                default -> System.out.println("Opción inválida.");
            }
            Coche.menu();
            opcion = scan.nextByte();
        }
    }
}