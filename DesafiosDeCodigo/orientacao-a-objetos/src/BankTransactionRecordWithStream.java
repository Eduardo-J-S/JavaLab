import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BankTransactionRecordWithStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = scanner.nextDouble();
        int totalTransactions = scanner.nextInt();

        List<Transaction> transactions = new ArrayList<>();

        for (int i = 1; i <= totalTransactions; i++) {
          
            char transactionType = scanner.next().toUpperCase().charAt(0);
            double transactionAmount = scanner.nextDouble();

            // TODO: Create a new transaction and add it to the list of transactions
            Transaction transaction = new Transaction(transactionType, transactionAmount);
            transactions.add(transaction);

            // Check and update the account balance based on the transaction type
            if (transactionType == 'D') {
                balance += transactionAmount;
            } else if (transactionType == 'S') {
                balance -= transactionAmount;
            }
        }

        System.out.println("\nBalance: " + balance);
        System.out.println("\nTransactions:");
        transactions.stream()
                .map(transaction -> Character.toLowerCase(transaction.getType()) + " of " + transaction.getValue())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

class Transaction {
    private char type;
    private double value;

    public Transaction(char type, double value) {
        this.type = type;
        this.value = value;
    }

    public char getType() {
        return type;
    }

    public double getValue() {
        return value;
    }
}
