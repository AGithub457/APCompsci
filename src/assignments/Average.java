package assignments;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Armdev on 10/13/15.
 */
public class Average {
    public static void main(String[] args) {
        int sum = 0, value = 0, count = 0;
        double average;
        Scanner scan = new Scanner(System.in);

        while (value != 0); {
            count++;
            sum += value;
            try {
                System.out.print("Enter an integer (0 to quit): ");
                value = scan.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.print("Enter an integer only!!!");
                scan.next();
            }
            scan.nextLine();
            System.out.println("The sum so far is " + sum);
        }

        System.out.println ();
        if (count == 0) {
            System.out.println("No values were entered.");
        }
        else {
            average = (double)sum / count;
            DecimalFormat fmt = new DecimalFormat("0.###");
            System.out.println("The average is " + fmt.format(average));
        }
    }
        
}
