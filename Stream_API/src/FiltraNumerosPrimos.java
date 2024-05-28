import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FiltraNumerosPrimos {
    public static void main(String[] args) {
        // Desafio 17 - Filtrar os números primos da lista:
        // Com a ajuda da Stream API, filtre os números primos da lista e exiba o
        // resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> filtroPrimos = numeros.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
    
        System.out.println("Números primos filtrados " + filtroPrimos);

        System.out.println("----------------------------------------------------------------");

        List<Integer> primos = numeros.stream()
                .filter(FiltraNumerosPrimos::isPrime)
                .collect(Collectors.toList());

                System.out.println("Números Primos:");
                primos.forEach(System.out::println);
                
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> number % n == 0);
    }
}
