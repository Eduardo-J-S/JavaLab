import java.util.Arrays;
import java.util.List;

public class SomaPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        int result = numeros.stream().filter(numero -> numero % 2 == 0).mapToInt(value -> value).sum();

        System.out.println(result);
    }
}
