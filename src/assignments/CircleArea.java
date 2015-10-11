package assignments;

import java.util.Scanner;

/**
 * Created by Armand on 10/11/2015.
 */
public class CircleArea {

    public static void main(String[] args) {
        double radius;
        double area;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = scan.nextDouble();

        area = (radius) * (radius) * Math.PI;

        System.out.println("Your area is: " + area);
    }
}