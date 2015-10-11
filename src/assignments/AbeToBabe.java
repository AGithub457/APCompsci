package assignments;

import java.util.Scanner;

/**
 * Created by Armand on 10/10/2015.
 */
public class AbeToBabe {
    public static void main(String[] args) {
        String word1;
        String word2;
        int val;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word: ");
        word1 = scan.nextLine();
        System.out.println("Enter your second word: ");
        word2 = scan.nextLine();

        val = word1.compareTo(word2);

        if (val == 0) {
            System.out.println(word1 + " is the same as " + word2);
        }
        if (val < 0) {
            System.out.println(word1 + " comes before " + word2);
        }
        if (val > 0) {
            System.out.println(word1 + " comes after " + word2);
        }
    }
}
