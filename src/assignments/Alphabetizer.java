package assignments;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Armdev on 10/22/2015.
 */
public class Alphabetizer {
    public static void main(String[] args) {
        String input;
        String yn;
        String sorted = "";
        ArrayList<String> ar = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        alphaAsk:
        while(true) {
            System.out.println("Enter a word to alphabetize: ");
            input = scan.nextLine();
            ar.add(input);

            System.out.println("Do you want to enter another word to alphabetize? (Y/N)");
            while(true) {
                yn = scan.nextLine();
                if (yn.equalsIgnoreCase("n")) {
                    break alphaAsk;
                } else if (yn.equalsIgnoreCase("y")) {
                    break;
                } else {
                    System.out.println("Enter either Y or N...");
                }
            }
        }

        java.util.Collections.sort(ar);
        for (String s : ar)
        {
            sorted += s + "\n";
        }

        System.out.println("Your alphabetized list: \n" + sorted);
    }
}
