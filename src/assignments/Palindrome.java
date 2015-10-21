package assignments;

import java.util.Scanner;

/**
 * Created by Armdev on 10/20/2015.
 */
public class Palindrome {
    public static void main(String[] args) {
        String word;
        String wordR;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        word = scan.nextLine();
        wordR = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(wordR)) {
            System.out.println(word + " is a palindrome to " + wordR);
        } else {
            System.out.println(word + " is not a palindrome to " + wordR);
        }
    }
}