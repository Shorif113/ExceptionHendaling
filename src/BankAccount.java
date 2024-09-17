public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. Deposit must be greater than zero.");
        }
        balance += amount;
        System.out.println("Depositing $" + amount);
        System.out.println("New balance: $" + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Invalid amount. Withdrawal must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds!");
        }
        balance -= amount;
        System.out.println("Withdrawing $" + amount);
        System.out.println("New balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }
}

