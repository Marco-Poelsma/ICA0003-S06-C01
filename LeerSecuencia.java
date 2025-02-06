import java.util.ArrayList;
public class LeerSecuencia {
    public static ArrayList<Integer> numeros = new ArrayList<>();
    public static void leerImprimirNumeros() {
        while (true) {
            int n = Main.scan.nextInt();
            if (n == -1) break;
            numeros.add(n);
        }
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("#" + i + ": " + numeros.get(i));
        }
    }
}
