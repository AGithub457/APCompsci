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

        System.out.println("Enter a word: ");
        while (true) {
            if (!scan.hasNextLine()) {
                scan.next();
                System.out.print("Enter a word only: ");
            } else {
                word = scan.nextLine();
                break;
            }
        }

        char[] wordArray = word.toCharArray();
        char[] wordRArray = new StringBuilder(word).reverse().toString().toCharArray();

        if (Arrays.equals(wordArray, wordRArray)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}
