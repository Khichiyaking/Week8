package ans3;
//3. Write a Java program to create a class known as "BankAccount" with methods called deposit() and
// withdraw(). Create a subclass called SavingsAccount that overrides the
//withdraw() method to prevent withdrawals if the account balance falls below one hundred.
public class Bankaccount {
    public static double balance = 200;

    public static void deposit(double amount) {
        balance += amount;
        System.out.println("total Money :"+balance);
    }

    public static void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Total after Withdraw :"+balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static double getbalance(){
        return balance;
    }

    public static void main(String[] args) {
           // deposit(100);
            withdraw(50);
    }


    }

