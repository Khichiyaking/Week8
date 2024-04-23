package ans3;
//3. Write a Java program to create a class known as "BankAccount" with methods called
//deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
//withdraw() method to prevent withdrawals if the account balance falls below one
//hundred.
public class Savingaccount extends Bankaccount{


    public static void withdraw(double amount){
        if(getbalance() - amount < 100){
            System.out.println("Balance is low");
        }
        else{
            System.out.println("You have enough balance");
        }
    }
    public static void main(String[] args) {
        withdraw(90.0);
    }
    }
