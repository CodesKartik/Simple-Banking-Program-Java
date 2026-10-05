class bankAccount {
    private String accountNumber;
    private double balance;

    public bankAccount(String acc, double initBal) {
        this.accountNumber = acc;
        setBalance(initBal);
    }
    public double getBalance() {
        return balance;
    }
    private void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
}

public class encap {
    public static void main(String[] args) {
        bankAccount account = new bankAccount("123456", 1000.0);
        System.out.println("Account Balance: " + account.getBalance());
    }
}
