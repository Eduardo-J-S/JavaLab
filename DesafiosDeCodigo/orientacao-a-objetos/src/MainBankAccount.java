import java.util.Scanner;

public class MainBankAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Create a new bank account with the initial balance
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        // Read the input with the deposit amount and call the "deposit" method
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Read the input with the withdrawal amount and call the "withdraw" method
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        // TODO: Increment the balance with the amount and print "Deposit made."
        this.balance += amount;
        System.out.println("Deposit made.");
        printBalance();
    }

    public void withdraw(double amount) {
        // TODO: Check if the balance is sufficient considering the amount:
        // If yes, update the balance and print "Withdrawal made."
        // If not, print "Insufficient balance. Withdrawal not made."
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal not made.");
        } else {
            System.out.println("Withdrawal made.");
            this.balance -= amount;
            printBalance();
        }
    }

    private void printBalance() {
        System.out.printf("Current balance: %.1f\n", this.balance);
    }
}
