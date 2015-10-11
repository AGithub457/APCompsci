package assignments;

import java.util.Scanner;

/**
 * Created by Armdev on 10/2/15.
 */
public class Age {
    public static void main(String[] args) {
        int age;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an age: ");
            age = scan.nextInt();

            if (age < 21) {
                System.out.println("Too young");
            } else {
                System.out.println("Aww yeah...");
            }
        }
    }
}
