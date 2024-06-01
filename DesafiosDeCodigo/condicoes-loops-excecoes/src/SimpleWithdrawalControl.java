import java.util.Scanner;

public class SimpleWithdrawalControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter your daily withdrawal limit");
        double dailyLimit = scanner.nextDouble();

        for (int i = 0; i <= dailyLimit; i++) {
            System.out.println("Enter your withdrawal");
            double withdrawalAmount = scanner.nextDouble();
            
            if (withdrawalAmount == 0) {
                System.out.println("Transactions closed.");
                break;
            }

            if (withdrawalAmount > dailyLimit) {
                System.out.println("Daily withdrawal limit reached. Transactions closed.");
                break;
            }

            dailyLimit -= withdrawalAmount;

            System.out.println("Withdrawal successful. Remaining limit: " + dailyLimit);
        }
       
        scanner.close(); 
    }
}
