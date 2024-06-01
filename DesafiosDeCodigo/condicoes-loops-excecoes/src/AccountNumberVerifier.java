import java.util.Scanner;

public class AccountNumberVerifier {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        try {
            System.out.println("Enter your account number");
            String input = scanner.nextLine();
            verifyAccountNumber(input);

            System.out.println("Valid account number."); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void verifyAccountNumber(String accountNumber) throws IllegalArgumentException { 
        if(accountNumber.length() != 8){
            throw new IllegalArgumentException("Error: Invalid account number. Please enter exactly 8 digits.");
        }
    }
}
