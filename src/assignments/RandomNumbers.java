package assignments;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Armdev on 9/31/2015.
 */
public class RandomNumbers {
    public static void main(String[] args) {
        int inputNum;
        int ranNum;

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner (System.in);
        inputNum = scan.nextInt();

        Random generator = new Random();
        ranNum = generator.nextInt(10-5+1) +5;
        System.out.println("Random Number + your number: " + ranNum + inputNum);
    }
}
