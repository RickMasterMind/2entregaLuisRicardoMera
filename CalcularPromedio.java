import java.util.*;

public class CalcularPromedio {
    public static double calcularPromedio(List<Integer> lista) {
        if (lista.isEmpty()) return 0;
        double suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma / lista.size();
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

        System.out.println("promedio de la lista: " + calcularPromedio(lista));
        scanner.close();
    }
}
