package assignments;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Armdev on 10/20/2015.
 */
public class Palindrome {
    public static void main(String[] args) {
        String word;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        word = scan.nextLine();
        //wordR = word;
        //new StringBuilder(wordR).reverse().toString();

        char[] wordArray = word.toCharArray();
        char[] wordRArray = new StringBuilder(word).reverse().toString().toCharArray();
        //char[] wordRArray = wordR.toCharArray();

        if (Arrays.equals(wordArray, wordRArray)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}