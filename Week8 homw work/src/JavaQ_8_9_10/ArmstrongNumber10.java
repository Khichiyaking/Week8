package JavaQ_8_9_10;

import java.util.Scanner;

public class ArmstrongNumber10 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = abc.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int lastDigit = number % 10;
            sum += Math.pow(lastDigit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
