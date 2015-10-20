package assignments;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Armdev on 10/16/15.
 */
public class WinPercentage {
    public static void main(String[] args) {
        final int numGames = 12;
        int won;
        double ratio;
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getPercentInstance();

        System.out.println("Enter number of games won (0 to 12): ");
        while (true) {
            if (!scan.hasNextInt()) {
                scan.next();
                System.out.print("Enter an integer only: ");
            }
            else{
                won = scan.nextInt();
                break;
            }
        }

        while (won < 0 || won > numGames) {
            System.out.println("Enter a number of wins between 0 and 12: ");
            while (true) {
                if (!scan.hasNextInt()) {
                    scan.next();
                    System.out.print("Enter an integer only!!!");
                }
                else{
                    won = scan.nextInt();
                    break;
                }
            }
        }

        ratio = (double)won / numGames;

        System.out.println("\nWinning percentage: " + fmt.format(ratio));
    }
}
