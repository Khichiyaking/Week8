package ans12;
//Write a Java program to create a class called BankAccount with private instance
//variables accountNumber and balance. Provide public getter and setter methods to
//access and modify these variables.
public class BankAccount {

    private int accountnumber;
    private double balance;

    public BankAccount(int accountnumber1, double balance1){
        this.accountnumber = accountnumber1;
        this.balance = balance1;
    }
    // Getter method
    public int getAccountnumber(){
        return accountnumber;
    }
    public double getBalance(){
        return balance;
    }
    //Setter method
    public void setAccountnumber (int accountnumber2){
        this.accountnumber = accountnumber2;
    }
    public void setBalance(double balance2){
        this.balance = balance2;
    }
    public static void main(String[] args) {
     BankAccount yesbank = new BankAccount(9988776,22500.80);
        System.out.println("Account Number :" + yesbank.getAccountnumber());
        System.out.println("Balance :" +yesbank.getBalance());
        //modify
        yesbank.setBalance(15000.20);
        System.out.println("New Balance:" +yesbank.getBalance());
    }
}
