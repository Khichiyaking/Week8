package JavaQ_7;
//Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//The method needsto find the first and the last digit of the parameter number passed to the method,
//using a loop and return the sum of the first and the last digit of that number.
//If the number is negative then the method needsto return -1 to indicate an invalid value.
public class FirstandLastDigitsum {

    public static int sumfirstandLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }
    public static void main(String[] args) {
        System.out.println(sumfirstandLastDigit(232));
        System.out.println(sumfirstandLastDigit(545));
        System.out.println(sumfirstandLastDigit(0));
        System.out.println(sumfirstandLastDigit(-119));
    }

}
