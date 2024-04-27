package ans10;
//Write a Java program to create a base class BankAccount with methods deposit() and
//withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
//withdraw() method in each subclass to impose different withdrawal limits and fees.
public class CheckingAccount extends Bankaccount{
    public static final double withdrawfee = 2.00;

    public CheckingAccount(double balance) {
        super(balance);
    }

    //public CheckingAccount(double balance){}
    //super (balance);
public static void withdraw(double amount){
        double totalamount = amount +withdrawfee;
        if (totalamount <= balance){
            balance -= totalamount;
            System.out.println("Withdraw" + amount);
            System.out.println("Withdrawfee" + withdrawfee);
            System.out.println("Current Balance" +balance);
        } else {
            System.out.println("Insufficient Balance");
        }
}
}
