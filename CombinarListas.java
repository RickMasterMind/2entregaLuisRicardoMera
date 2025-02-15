import java.util.*;

public class CombinarListas {
    public static List<Integer> combinarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>(lista1);
        resultado.addAll(lista2);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números para la primera lista: ");
        int n = scanner.nextInt();
        List<Integer> lista1 = new ArrayList<>();
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            lista1.add(scanner.nextInt());
        }

        System.out.print("Ingrese la cantidad de números para la segunda lista: ");
        int m = scanner.nextInt();
        List<Integer> lista2 = new ArrayList<>();
        System.out.println("Ingrese los números:");
        for (int i = 0; i < m; i++) {
            lista2.add(scanner.nextInt());
        }

        System.out.println("Listas combinadas: " + combinarListas(lista1, lista2));
        scanner.close();
    }
}
