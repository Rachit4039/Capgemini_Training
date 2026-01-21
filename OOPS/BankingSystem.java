import java.util.ArrayList;
import java.util.List;

public class BankingSystem {

    interface Loanable {
        void applyForLoan(double amount);
        double calculateLoanEligibility();
    }

    static abstract class BankAccount implements Loanable {
        protected String accountNumber;
        protected String holderName;
        protected double balance;
        private String pin; 

        BankAccount(String accountNumber, String holderName, double balance, String pin) {
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = balance;
            this.pin = pin;
        }

        protected String getPin() {
            return pin;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }

        abstract double calculateInterest();
    }

    static class SavingsAccount extends BankAccount {

        SavingsAccount(String accountNumber, String holderName, double balance, String pin) {
            super(accountNumber, holderName, balance, pin);
        }

    
        double calculateInterest() {
            return balance * 0.04; 
        }

        
        public void applyForLoan(double amount) {
            System.out.println(holderName + " applied for loan: " + amount);
        }

     
        public double calculateLoanEligibility() {
            return balance * 2;
        }
    }

    static class CurrentAccount extends BankAccount {

        CurrentAccount(String accountNumber, String holderName, double balance, String pin) {
            super(accountNumber, holderName, balance, pin);
        }

        @Override
        double calculateInterest() {
            return balance * 0.01;
        }

        @Override
        public void applyForLoan(double amount) {
            System.out.println(holderName +  amount);
        }

        @Override
        public double calculateLoanEligibility() {
            return balance * 3; 
        }
    }

    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("ers", "rachit", 5000, "1234"));
        accounts.add(new CurrentAccount("erdg", "joshi", 10000, "5678"));

        for (BankAccount acc : accounts) {
            System.out.println(acc.holderName);
            System.out.println(acc.balance);
            System.out.println(acc.calculateInterest());
            System.out.println(acc.calculateLoanEligibility());
            acc.applyForLoan(2000);
        }
    }
}
