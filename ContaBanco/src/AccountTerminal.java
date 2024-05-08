public class AccountTerminal {
    int number;
    String agency;
    String clientName;
    double balance;
    
    public AccountTerminal() {}

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getAgency() {
        return agency;
    }
    public void setAgency(String agency) {
        this.agency = agency;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Hello " + this.clientName + "! Thank you for creating an account with our bank. Your agency is " + this.agency + ", account number " + this.number + ", and your balance of $" + this.balance + " is already available for withdrawal.";
    }

}
