import java.util.*;

public class ListaPotencia {
    public static List<Integer> listaPotencia(int potencia, List<Integer> lista) {
        List<Integer> resultado = new ArrayList<>();
        for (int num : lista) {
            resultado.add((int) Math.pow(num, potencia));
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        List<Integer> lista = new ArrayList<>();
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            lista.add(scanner.nextInt());
        }

        System.out.print("Ingrese la potencia: ");
        int potencia = scanner.nextInt();

        System.out.println("Lista Potencia: " + listaPotencia(potencia, lista));
        scanner.close();
    }
}
