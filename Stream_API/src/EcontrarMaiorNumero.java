import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EcontrarMaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

         Optional<Integer> segundoMaior = numeros.stream()
                                                .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
                                                .skip(1) // Pula o primeiro elemento (maior número)
                                                .findFirst(); // Encontra o primeiro elemento (segundo maior número)

        // Exibe o resultado no console
        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior número é: " + segundoMaior.get());
        } else {
            System.out.println("A lista não possui um segundo maior número.");
        }
    }
}
