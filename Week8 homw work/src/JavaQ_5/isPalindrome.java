package JavaQ_5;
//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//Itshould return true ifthe number is a palindrome number otherwise itshould return false.
//Check the tips below for more info about palindromes. Example Input/Output
//isPalindrome(-1221); → should return true
//isPalindrome(707); → should return true
//isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to 11212.
//Tip:What is a Palindrome number? A palindrome numberis a number which when reversed is equal
//to the original number. For example: 121, 12321, and 1001 etc.
//Tip: Logic to check a palindrome number
//Find the reverse of the given number. Store itin some variable,say reverse. Compare the number with the reverse.
//If both are the same then the number is a palindrome otherwise it is not.
public class isPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = -number;
        }
        int originalnumber = number;
        int reversednumber = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            reversednumber = reversednumber * 10 + lastdigit;
            number /= 10;
        }
        return originalnumber == reversednumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}

