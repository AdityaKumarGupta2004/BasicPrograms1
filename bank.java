class BankAccount {
    String accountHolder;
    double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs " + balance);
    }

    // Method to transfer money to another account
    public void transferMoney(BankAccount receiver, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Rs " + amount + " transferred successfully to " + receiver.accountHolder);
        } else {
            System.out.println("Insufficient funds or invalid amount for transfer.");
        }
    }
}

public class bank {
    public static void main(String[] args) {
        // Creating two bank accounts
        BankAccount senderAccount = new BankAccount("Sender", 1000.0);
        BankAccount receiverAccount = new BankAccount("Receiver", 500.0);

        // Displaying initial account information
        System.out.println("Before Transfer:");
        senderAccount.displayAccountInfo();
        receiverAccount.displayAccountInfo();

        // Transferring Rs 500 from sender to receiver
        senderAccount.transferMoney(receiverAccount, 500.0);

        // Displaying updated account information
        System.out.println("\nAfter Transfer:");
        senderAccount.displayAccountInfo();
        receiverAccount.displayAccountInfo();
    }
}
