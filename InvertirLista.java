import java.util.*;

public class InvertirLista {
    public static List<Integer> invertirLista(List<Integer> lista) {
        List<Integer> resultado = new ArrayList<>(lista);
        Collections.reverse(resultado);
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

        System.out.println("Lista invertida: " + invertirLista(lista));
        scanner.close();
    }
}
