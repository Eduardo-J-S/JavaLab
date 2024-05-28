import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdemCrescente {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> result = numeros.stream().sorted().collect(Collectors.toList());

        System.out.println(result);
    }
}
