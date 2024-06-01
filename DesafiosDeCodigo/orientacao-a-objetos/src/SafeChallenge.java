import java.util.Scanner;

abstract class Safe {
  protected String type;
  protected String openingMethod;

  public Safe(String type, String openingMethod) {
    this.type = type;
    this.openingMethod = openingMethod;
  }

  public void printInformation() {
    System.out.println("Type: " + this.type);
    System.out.println("Opening method: " + this.openingMethod);
  }
}

class DigitalSafe extends Safe {
  private int password;

  public DigitalSafe(int password) {
    super("Digital Safe", "Password");
    this.password = password;
  }

  DigitalSafe() {
    super("Digital Safe", "Password");
  }

  public boolean validatePassword(int passwordConfirmation) {
    return passwordConfirmation == this.password;
  }
}

class PhysicalSafe extends Safe {
  public PhysicalSafe() {
    super("Physical Safe", "Key");
  }
}

public class SafeChallenge {
  public static void main(String[] args) {
    // Reading the type of safe (first line of input)
    Scanner scanner = new Scanner(System.in);
    String safeType = scanner.nextLine();

    // TODO: Implement the necessary condition to verify secure safes:
    if (safeType.equalsIgnoreCase("digital")) {
      DigitalSafe digitalSafe = new DigitalSafe();
      digitalSafe.printInformation();
      int password = scanner.nextInt();
      digitalSafe = new DigitalSafe(password);
      int validation = scanner.nextInt();
      boolean condition = digitalSafe.validatePassword(validation);
      if (condition) {
        System.out.println("Safe opened!");
      } else {
        System.out.println("Incorrect password!");
      }
    } else {
      PhysicalSafe physicalSafe = new PhysicalSafe();
      physicalSafe.printInformation();
    }
    scanner.close();
  }
}
