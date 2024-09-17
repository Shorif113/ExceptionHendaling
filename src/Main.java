public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 100.0);

        try {
            account.deposit(50.0);
            account.withdraw(200.0);
            account.withdraw(50.0);
            account.deposit(-10.0);
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final balance: $" + account.getBalance());
            System.out.println("End of transaction.");
        }
    }
}
