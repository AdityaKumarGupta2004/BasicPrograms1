public class MAin {
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
