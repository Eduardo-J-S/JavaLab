import java.util.Scanner;

public class AccountEligibilityChecker {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter your age");
        int age = scanner.nextInt(); 

        if(age >= 18){
            System.out.println("You are eligible to create a bank account.");
        } else {
            System.out.println("You are not eligible to create a bank account.");
        }

        scanner.close(); 
    }
}
