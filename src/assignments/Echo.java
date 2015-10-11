package assignments;

import java.util.Scanner;

/**
 * Created by Armdev on 10/11/2015.
 */
public class Echo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter line of text: ");
        String message = scan.nextLine();

        System.out.println("Message: " + message);
    }
}
