import java.text.DecimalFormat;
import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        // Reading input data:
        Scanner scanner = new Scanner(System.in);
        String accountHolder = scanner.next();
        int accountNumber = scanner.nextInt();
        double balance = scanner.nextDouble();
        double interestRate = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolder, balance, interestRate);

        System.out.println("Savings Account:");
        savingsAccount.displayInformation();

        scanner.close();
    }
}

class BankAccount {
    protected int number;
    protected String holder;
    protected double balance;

    public BankAccount(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void displayInformation() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        System.out.println(holder);
        System.out.println(number);
        System.out.println("Balance: $" + decimalFormat.format(balance));
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int number, String holder, double balance, double interestRate) {
        // TODO: Properly implement this constructor overload.
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("Interest rate: " + this.interestRate + "%");
        // TODO: Complete the information with the interest rate.
    }
}
