import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {
    public static int getValidParams(Scanner input, String message){
        int parameter = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println(message);
                parameter = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number for the account number.");
                input.nextLine();
            }
        }
        return parameter;
    }
}
