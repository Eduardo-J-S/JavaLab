# SumNumbers

Esta classe implementa uma lista de números inteiros e fornece métodos para adicionar números, calcular a soma, encontrar o maior e o menor número, e exibir todos os números na lista. Como parte de um exercicio de List do bootcamp Santander DIO.

## Métodos

### Construtor

- `SumNumbers()`: Inicializa a lista de números inteiros.

### Métodos Públicos

- `void addNumber(int number)`: Adiciona um número à lista.
- `int calculateSum()`: Calcula e retorna a soma de todos os números na lista. Lança uma exceção se a lista estiver vazia.
- `int findLargestNumber()`: Encontra e retorna o maior número na lista. Lança uma exceção se a lista estiver vazia.
- `int findSmallestNumber()`: Encontra e retorna o menor número na lista. Lança uma exceção se a lista estiver vazia.
- `List<Integer> displayNumbers()`: Retorna uma lista contendo todos os números presentes na lista. Lança uma exceção se a lista estiver vazia.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        SumNumbers sumNumbers = new SumNumbers();

        // Adicionando números à lista
        sumNumbers.addNumber(10);
        sumNumbers.addNumber(20);
        sumNumbers.addNumber(5);

        // Calculando a soma dos números
        System.out.println("Soma: " + sumNumbers.calculateSum());

        // Encontrando o maior número
        System.out.println("Maior número: " + sumNumbers.findLargestNumber());

        // Encontrando o menor número
        System.out.println("Menor número: " + sumNumbers.findSmallestNumber());

        // Exibindo todos os números
        System.out.println("Números: " + sumNumbers.displayNumbers());
    }
}
