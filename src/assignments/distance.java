package assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Armand on 9/29/2015.
 */
public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first coordinate: ");
        String coordinate = scan.nextLine();
        String[] parts = coordinate.split(",");

        System.out.println("Enter your second coordinate: ");
        String coordinate2 = scan.nextLine();
        String[] parts2 = coordinate2.split(",");

        String x1 = parts[0].trim().substring(1).trim();
        String y1 = parts[1].trim().substring(0, parts[1].trim().length() - 1).trim();
        String x2 = parts2[0].trim().substring(1).trim();
        String y2 = parts2[1].trim().substring(0, parts2[1].trim().length() - 1).trim();
        int xDistance = Integer.parseInt(x2) - Integer.parseInt(x1);
        int yDistance = Integer.parseInt(y2) - Integer.parseInt(y1);

        double distance = Math.sqrt((Math.pow(xDistance, 2)) + (Math.pow(yDistance, 2)));

        DecimalFormat dfmt = new DecimalFormat("0.###");

        System.out.println("Your distance is: " + dfmt.format(distance) + " units");
    }
}
