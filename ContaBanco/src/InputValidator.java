import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidator {

    public static String getValidName(Scanner input) {
        String name = "";
        boolean validName = false;
        while (!validName) {
            System.out.print("Enter your name: ");
            name = input.nextLine().trim();
            if (!name.isEmpty()) {
                validName = true;
            } else {
                System.out.println("Please enter a valid name.");
            }
        }
        return name;
    }

    public static int getValidAccountNumber(Scanner input) {
        int accountNumber = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the account number (numbers only): ");
                accountNumber = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number for the account number.");
                input.nextLine();
            }
        }
        return accountNumber;
    }

}
