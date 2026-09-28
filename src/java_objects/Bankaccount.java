package java_objects;

public class Bankaccount {

 
    private final String accountNumber;
    private String accountHolderName;
    private double balance;


    public Bankaccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if (initialBalance < 0) {
            this.balance = 0.0;
            System.out.println("Warning: initial balance cannot be negative. Balance set to $0.00.");
        } else {
            this.balance = initialBalance;
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
    public void setAccountHolderName(String newName) {
        accountHolderName = newName;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    
    }
    public double calculateLoan() {
        double loanRate;

        if (balance < 10000) {
            loanRate = 0.10;
        } else if (balance >= 11000 && balance <= 60000) {
            loanRate = 0.25;
        } else {
            loanRate = 0.30;
        }

        return balance * loanRate;
    }

    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder  : " + accountHolderName);
        System.out.printf("Balance         : $%.2f%n", balance);
        System.out.printf("Eligible Loan   : $%.2f%n", calculateLoan());
        System.out.println("------------------------");
    }


    public static void main(String[] args) {

        Bankaccount acc1 = new Bankaccount("ACC1001", "Alex Mugisha", 5000.00);
        Bankaccount acc2 = new Bankaccount("ACC1002", "Sonia Bajeneza", 45000.00);
        Bankaccount acc3 = new Bankaccount("ACC1003", "Eric Niyonsaba", -200.00); 
        acc1.deposit(1500.00);
        acc2.withdraw(20000.00);
        acc3.deposit(300.00);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        acc3.displayAccountDetails();

        acc1.setAccountHolderName("Alex M. Mugisha");
        System.out.println("\nUpdated name: " + acc1.getAccountHolderName());
    }
}
    

