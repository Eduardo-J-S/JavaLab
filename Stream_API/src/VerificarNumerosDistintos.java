import java.util.Arrays;
import java.util.List;

public class VerificarNumerosDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.stream().distinct().count() == numeros.size();

        if (todosDistintos) {
            System.out.println("Todos os números da lista são distintos.");
        } else {
            System.out.println("A lista contém números repetidos.");
        }
    }
}
