import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarNumerosInterlavo {
    public static void main(String[] args) {
        // Desafio 13 - Filtrar os números que estão dentro de um intervalo:
        // Utilize a Stream API para filtrar os números que estão dentro de um intervalo
        // específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> filtro = numeros.stream().filter(num -> num > 5 && num < 10).collect(Collectors.toList());

        System.out.println("Números entre 5 e 10");
        System.out.println(filtro);
    }
}
