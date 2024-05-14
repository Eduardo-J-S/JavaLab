import java.util.Scanner;

public class BankingSimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double balance = 0; 
        String menu = "Choose an option: \n 1 - Deposit \n 2 - Withdraw \n 3 - Check Balance \n 0 - Exit";

       
        while (true) { 
            System.out.println(menu);
            int option = scanner.nextInt(); 

            if(option == 0) {
                System.out.println("Program terminated.");
                break;
            }

            switch (option) {
                case 1:
                    System.out.println("Enter the amount to be deposited: ");
                    double deposit = scanner.nextDouble();
                    balance += deposit;
                    System.out.println("Current balance: " + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawal: ");
                    double withdrawal = scanner.nextDouble();
                    if(balance >= withdrawal){
                        balance -= withdrawal;
                        System.out.println("Current balance: " + balance);
                    }else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + balance);
                    break;
                default:
                    System.out.println("Invalid option. Please try again."); 
                    break;
            }
        }
        scanner.close();
    }
}
