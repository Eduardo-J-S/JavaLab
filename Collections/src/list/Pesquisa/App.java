package list.Pesquisa;

public class App {
    public static void main(String[] args) {
        SumNumbers sumNumbers = new SumNumbers();

        sumNumbers.addNumber(10);
        sumNumbers.addNumber(20);
        sumNumbers.addNumber(30);
        sumNumbers.addNumber(5);
        sumNumbers.addNumber(15);

        System.out.println("Numbers in the list: " + sumNumbers.displayNumbers());
        System.out.println("Sum of numbers: " + sumNumbers.calculateSum());
        System.out.println("Higher number: " + sumNumbers.findLargestNumber());
        System.out.println("Smallest number: " + sumNumbers.findSmallestNumber());
    }
}
