import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankTransactionRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input informing the initial account balance
        double balance = scanner.nextDouble();

        // Read the input with the total number of transactions
        int totalTransactions = scanner.nextInt();

        // List to store transactions
        List<String> transactions = new ArrayList<>();

        // Loop to iterate over transactions
        for (int i = 1; i <= totalTransactions; i++) {
            // Read the input with the transaction type (D for deposit or S for withdrawal)
            // The "toUpperCase" method standardizes the transaction type to uppercase
            char transactionType = scanner.next().toUpperCase().charAt(0);
            // Read the input with the transaction amount
            double transactionAmount = scanner.nextDouble();

            // Update the account balance and add the transaction to the list
            if (transactionType == 'D') {
                balance += transactionAmount;
                transactions.add("Deposit of " + transactionAmount);
            } else if (transactionType == 'S') {
                balance -= transactionAmount;
                transactions.add("Withdrawal of " + transactionAmount);
            } else {
                System.out.println("Invalid option. Use D for deposit or S for withdrawal.");
                i--; // Decrement the index to repeat the iteration
            }
        }

        // TODO: Display the final balance and the list of transactions as per the examples table.
        System.out.println("Balance: " + balance);
        System.out.println("Transactions:");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println((i + 1) + ". " + transactions.get(i));
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
