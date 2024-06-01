import java.util.Scanner;

public class OverdraftVerification {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter your balance");
        double balance = scanner.nextDouble(); 
        System.out.println("Enter your withdrawal");
        double withdrawal = scanner.nextDouble(); 
        double overdraftLimit = 500; 

        if (balance >= withdrawal) {
            balance -= withdrawal;
            System.out.println("Transaction successful.");
        } else {
            double balanceAfterOverdraft = balance - withdrawal + overdraftLimit;
            if (balanceAfterOverdraft >= 0) {
                System.out.println("Transaction successful using overdraft.");
            } else {
                System.out.println("Transaction failed. Overdraft limit exceeded.");
            }
        }
        scanner.close(); 
    }
}
