public class BankAccountHolder {
    public static void main(String[] args) {

        Bank bank = new Bank("SBI");
        Customer customer = new Customer("Rachit");

        bank.openAccount(5000);
        customer.viewBalance(bank);
    }
}

class Bank {
    String name;
    int balance;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(int balance) {
        this.balance = balance;
    }

    int getBalance() {
        return balance;
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance(Bank bank) {
        System.out.println(name + " and balance: " + bank.getBalance());
    }
}
