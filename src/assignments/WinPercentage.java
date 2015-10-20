package assignments;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Armdev on 10/16/15.
 */
public class WinPercentage {
    public static void main(String[] args) {
        int numGames;
        int won = 0, lost = 0, tied = 0, total = 0;
        double ratioWon, ratioLost, ratioTied;
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getPercentInstance();

        System.out.println("Enter the total number of games: ");
        while (true) {
            if (!scan.hasNextInt()) {
                scan.next();
                System.out.print("Enter an integer only: ");
            } else {
                numGames = scan.nextInt();
                break;
            }
        }
        while (total < numGames || total < numGames) {
            won = 0;
            lost = 0;
            tied = 0;
            total = 0;
            System.out.println("Enter number of games won (0 to " + numGames + "): ");
            while (true) {
                if (!scan.hasNextInt()) {
                    scan.next();
                    System.out.print("Enter an integer only: ");
                } else {
                    won = scan.nextInt();
                    total += won;
                    if (total < 0) {
                        System.out.println("Too little games won!!!");
                    } else if (total > numGames) {
                        System.out.println("Too many games won!!!");
                    } else {
                        break;
                    }
                }
            }

            System.out.println("Enter number of games lost (0 to " + numGames + "): ");
            while (true) {
                if (!scan.hasNextInt()) {
                    scan.next();
                    System.out.print("Enter an integer only: ");
                } else {
                    lost = scan.nextInt();
                    total += lost;
                    if (total < 0) {
                        System.out.println("Too little games lost!!!");
                    } else if (total > numGames) {
                        System.out.println("Too many games lost!!!");
                    } else {
                        break;
                    }
                }
            }

            System.out.println("Enter number of games tied (0 to " + numGames + "): ");
            while (true) {
                if (!scan.hasNextInt()) {
                    scan.next();
                    System.out.print("Enter an integer only: ");
                } else {
                    tied = scan.nextInt();
                    total += tied;
                    if (total < 0) {
                        System.out.println("Too little games tied!!!");
                    } else if (total > numGames) {
                        System.out.println("Too many games tied!!!");
                    } else {
                        break;
                    }
                }
            }

            if (total < numGames) {
                System.out.println("Total win/loss/tie does not match the total number of games entered!!\n");
            } else {
                break;
            }
        }

        ratioWon = (double)won / numGames;
        ratioLost = (double)lost / numGames;
        ratioTied = (double)tied / numGames;

        System.out.println("\nWinning percentage: " + fmt.format(ratioWon));
        System.out.println("Losing percentage: " + fmt.format(ratioLost));
        System.out.println("Tying percentage: " + fmt.format(ratioTied));
    }
}
