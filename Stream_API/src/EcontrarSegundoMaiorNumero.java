import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EcontrarSegundoMaiorNumero {
    public static void main(String[] args) {
        // Desafio 7 - Encontrar o segundo número maior da lista:
        // Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o
        // resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número é: " + segundoMaior.get());
        } else {
            System.out.println("A lista não possui um segundo maior número.");
        }
    }
}
