import java.util.*;

public class EliminarDuplicados {
    public static List<Integer> eliminarDuplicados(List<Integer> lista) {
        return new ArrayList<>(new LinkedHashSet<>(lista));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese la cantidad de numeros: ");
        int n = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();
        System.out.println("ingrese los numeros:");
        for (int i = 0; i < n; i++) {
            lista.add(scanner.nextInt());
        }

        System.out.println("lista sin duplicados: " + eliminarDuplicados(lista));
        scanner.close();
    }
}
