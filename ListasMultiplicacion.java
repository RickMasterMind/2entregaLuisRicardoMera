import java.util.*;

public class ListasMultiplicacion {
    public static List<Integer> listasMultiplicacion(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>();
        int tamaño = Math.min(lista1.size(), lista2.size());
        for (int i = 0; i < tamaño; i++) {
            resultado.add(lista1.get(i) * lista2.get(i));
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese la cantidad de numeros para la primera lista: ");
        int n = scanner.nextInt();
        List<Integer> lista1 = new ArrayList<>();
        System.out.println("ingrese los numeros:");
        for (int i = 0; i < n; i++) {
            lista1.add(scanner.nextInt());
        }

        System.out.print("ingrese la cantidad de numeros para la segunda lista: ");
        int m = scanner.nextInt();
        List<Integer> lista2 = new ArrayList<>();
        System.out.println("ingrese los numeros:");
        for (int i = 0; i < m; i++) {
            lista2.add(scanner.nextInt());
        }

        System.out.println("multiplicación de listas: " + listasMultiplicacion(lista1, lista2));
        scanner.close();
    }
}
