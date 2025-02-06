public class Calculadora {
    private static double n1;
    private static double n2;

    private static StringBuilder sb = new StringBuilder();

    public static void setN1(double n1) {
        Calculadora.n1 = n1;
        sb.append("Introducido número decimal ").append(n1).append("\n");
    }
    public static void setN2(double n2) {
        Calculadora.n2 = n2;
        sb.append("Introducido número decimal ").append(n2).append("\n");
    }
    public static double sumar() {
        sb.append("Sumar numeros\n");
        return n1 + n2;
    }
    public static double restar() {
        sb.append("Restar numeros\n");
        return n1 - n2;
    }
    public static double multiplicar() {
        sb.append("Multiplicar numeros\n");
        return n1 * n2;
    }
    public static void mostrarLogs() {
        System.out.println(sb.toString());
    }

    public static void menu() {
        System.out.println("MENU:");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Mostrar logs");
        System.out.println("[5] Salir");
        System.out.print("Escoge una operación [1-5] : ");
    }

    public static void main() {
        System.out.println("Introduce un número decimal:");
        n1 = Main.scan.nextDouble();
        System.out.println("Introduce otro número decimal");
        n2 = Main.scan.nextDouble();
        setN1(n1);
        setN2(n2);

        while (true) { 
            menu();
            byte opcion = Main.scan.nextByte();
            switch(opcion) {
                case 1 -> {
                    double r = sumar();
                    System.out.println("La suma es: " + r);
                }
                case 2 -> {
                    double r = restar();
                    System.out.println("La resta es: " + r);
                }
                case 3 -> {
                    double r = multiplicar();
                    System.out.println("El producto es: " + r);
                }
                case 4 -> {
                    System.out.println(sb.toString());
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Opcion incorrecta");
                }
            }
            if (opcion == 5) break;
        }
    }
}
