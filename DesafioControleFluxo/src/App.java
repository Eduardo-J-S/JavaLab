import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstParameter = InputValidator.getValidParams(input, "Enter the first parameter:");
        int secondParameter = InputValidator.getValidParams(input, "Enter the second parameter:");
        input.close();

        try {
            Counter.count(firstParameter, secondParameter);
        } catch (InvalidParametersException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
