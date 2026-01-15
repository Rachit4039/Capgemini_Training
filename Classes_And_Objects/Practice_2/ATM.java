
public class ATM {
    static class BankAccount{
        private String accountHolder;
        private int accountNumber;
        private int balance;

        BankAccount(String accountHolder,int accountNumber,int balance ){
            this.accountHolder=accountHolder;
            this.accountNumber=accountNumber;
            this.balance=balance;
        }

        void depositeMoney(int extraMoney){
            balance +=extraMoney;
        }

        void WithdrawMoney(int WithMoney){
            balance -=WithMoney;
        }

        void Display(){
            System.out.print(balance);
        }
    }

    public static void main(String args[]){
        BankAccount b = new BankAccount("Rachit", 1104543, 500);
        b.depositeMoney(500);
        b.WithdrawMoney(100);
        b.Display();
    }
}
