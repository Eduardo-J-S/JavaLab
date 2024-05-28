import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparNumerosParesImpares {
    public static void main(String[] args) {
        // Desafio 16 - Agrupe os números em pares e ímpares:
        // Utilize a Stream API para agrupar os números em duas listas separadas, uma
        // contendo os números pares e outra contendo os números ímpares da lista
        // original, e exiba os resultados no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

        System.out.println("Lista de números pares: " + pares);
        System.out.println("Lista de números ímpares: " + impares);

        System.out.println("----------------------------------------------------------------------");

        Map<Boolean, List<Integer>> agrupados = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        // collect(Collectors.partitioningBy(n -> n % 2 == 0)): Agrupa os números em
        // dois grupos - pares (onde n % 2 == 0 é true) e ímpares (onde n % 2 == 0 é
        // false). O resultado é um Map<Boolean, List<Integer>>, onde a chave true
        // representa os números pares e a chave false representa os números ímpares.

        System.out.println("Números Pares:");
        agrupados.get(true).forEach(System.out::println);

        System.out.println("\nNúmeros Ímpares:");
        agrupados.get(false).forEach(System.out::println);

    }
}
