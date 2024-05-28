import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MediaNumeros {
    public static void main(String[] args) {

        // Desafio 5 - Calcule a média dos números maiores que 5:
        // Com a Stream API, calcule a média dos números maiores que 5 e exiba o
        // resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream().filter(dai -> dai > 5).reduce(0, Integer::sum);

        System.out.println(soma / numeros.stream().filter(dai -> dai > 5).count());

        System.out.println("---------------------------------------------------");

        OptionalDouble media = numeros.stream().mapToInt(Integer::intValue).filter(dai -> dai > 5).average();

        if (media.isPresent()) {
            System.out.println("A média dos números maiores que 5 é: " + media.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 na lista");
        }
    }
}
