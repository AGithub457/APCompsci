package assignments;

import java.util.Scanner;

/**
 * Created by Armdev on 9/28/2015.
 */
public class Quadratic {
    public static void main(String[] args) {
        int a, b, c;

        System.out.println("Enter the coefficient of x squared: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        System.out.println("Enter the coefficient of x: ");
        Scanner scan2 = new Scanner(System.in);
        b = scan2.nextInt();

        System.out.println("Enter the constant: ");
        Scanner scan3 = new Scanner(System.in);
        c = scan3.nextInt();

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        double root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Root #1: " + root1);
        System.out.println("Root #2: " + root2);
    }
}
