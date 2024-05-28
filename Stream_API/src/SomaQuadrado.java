import java.util.Arrays;
import java.util.List;

public class SomaQuadrado {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int result = numeros.stream().mapToInt(num -> num * num).sum();

        System.out.println("A soma dos quadrados dos números da lista é");
        System.out.println(result);
    }
}
