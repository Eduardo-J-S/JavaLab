import java.util.Arrays;
import java.util.List;

public class VerificaNumerosIguais {
    public static void main(String[] args) {
        // Desafio 18 - Verifique se todos os números da lista são iguais:
        // Utilizando a Stream API, verifique se todos os números da lista são iguais e
        // exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //List<Integer> numeros2 = Arrays.asList(3, 3, 3, 3, 3);

        boolean todosIguais = numeros.stream()
                .allMatch(num -> num.equals(numeros.get(0)));

        if (!todosIguais) {
            System.out.println("Os números da lista não são todos iguais");
        } else {
            System.out.println("Os números da lista são todos iguais");
        }
    }
}
