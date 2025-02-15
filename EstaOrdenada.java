import java.util.*;

public class EstaOrdenada {
    public static boolean estaOrdenada(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }
        return true;
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

        System.out.println("la lista esta ordenada?: " + estaOrdenada(lista));
        scanner.close();
    }
}
