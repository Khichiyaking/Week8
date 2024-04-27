package ans10;
//Write a Java program to create a base class BankAccount with methods deposit() and
//withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
//withdraw() method in each subclass to impose different withdrawal limits and fees.
public class Bankaccount {
    public static double balance = 200;
    public Bankaccount(double balance){
        this.balance= balance;
    }

    public static void deposit(double amount) {
        balance += amount;
        System.out.println("total Money :"+balance);
        System.out.println("Current balance" +balance);
    }
    public static void withdraw(double amount) {
        if (balance <= amount) {
            balance -= amount;
            System.out.println("Total after Withdraw :"+balance);
            System.out.println("Current balance after withdraw" +balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    public static double getbalance(){
        return balance;
    }
    public static void main(String[] args) {
        deposit(500);
        withdraw(400);
    }

}
