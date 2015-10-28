package assignments;

import java.util.Scanner;

/**
 * Created by Armdev on 10/27/2015.
 */
public class DrawBoxes {
    public static void main(String[] args) {
        String row1 = "+";
        String row2 = "|";
        String row1A = " -- +";
        String row2A = "    |";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number of rows and columns (#x#): ");
        String string = scan.nextLine();

        String[] size = string.split("x");
        int row = Integer.parseInt(size[0]);
        int column = Integer.parseInt(size[1]);

        for(int i = 1; i <= column; i++) {
            row1 += row1A;
            row2 += row2A;
        }

        for(int i = 1; i <= row; i++) {
            System.out.println(row1);
            System.out.println(row2);
        }

        System.out.println(row1);
    }
}
