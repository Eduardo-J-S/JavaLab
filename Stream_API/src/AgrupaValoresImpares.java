import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AgrupaValoresImpares {
    public static void main(String[] args) {

        // Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
        // Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e
        // exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> result = numeros.stream().filter(num -> num % 2 != 0 && (num % 3 == 0 || num % 5 == 0))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
