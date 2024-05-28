import java.util.Arrays;
import java.util.List;

public class NumerosDivisiveis {
    public static void main(String[] args) {
        // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
        // Com a Stream API, encontre a soma dos números da lista que são divisíveis
        // tanto por 3 quanto por 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);

        int somaDivisiveis = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(n -> n.intValue()).sum();

        System.out.println("A soma dos números divisiveis por 5 e por 3 é " + somaDivisiveis);
    }
}
