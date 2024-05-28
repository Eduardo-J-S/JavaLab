import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {

        // Desafio 14 - Encontre o maior número primo da lista:
        // Com a Stream API, encontre o maior número primo da lista e exiba o resultado
        // no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorPrimo = numeros.stream().filter(num -> num % 2 != 0).sorted(Comparator.reverseOrder()).findFirst();

        System.out.println("O maior número primo é");
        System.out.println(maiorPrimo.get());
    }
}
