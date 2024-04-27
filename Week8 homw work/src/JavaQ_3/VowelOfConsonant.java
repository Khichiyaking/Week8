package JavaQ_3;

import java.util.Scanner;

//3. Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel of Consonant, depending on the user input. If the user input
//Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
//error message.
//For eg: Input an alphabet: p
//Expected Output:
//Input letter is Consonant
public class VowelOfConsonant {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Input an alphabet");
        String letter = ab.next();
        if (!letter.matches("[A-Za-z]")){
            System.out.println("Error");
        } else {
            letter = letter.toLowerCase();
            if (letter.matches("aeiou")){
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }
    }
}
