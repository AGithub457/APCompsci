/**
 * Copyright (C) 2015 Armdev
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package assignments;

import java.util.Scanner;

public class DrawAsteriskShapes {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Choose:");
            System.out.println("A) Basic Right Triangle");
            System.out.println("B) Inverted Right Triangle");
            System.out.println("C) Equilateral Triangle");
            System.out.println("D) Inverted Equilateral Triangle");
            System.out.println("E) Perfect Diamond");
            System.out.println("F) Variable Height Diamond");
            System.out.println("G) Square");
            System.out.println("H) Rectangle");
            String choice = scan.next();

            if (choice.equalsIgnoreCase("a")) triangle();
            if (choice.equalsIgnoreCase("b")) triangleInv();
            if (choice.equalsIgnoreCase("c")) triangleEquil();
            if (choice.equalsIgnoreCase("d")) triangleEquilInv();
            if (choice.equalsIgnoreCase("e")) diamond();
            if (choice.equalsIgnoreCase("f")) diamondVarHeight();
            if (choice.equalsIgnoreCase("g")) square();
            if (choice.equalsIgnoreCase("h")) squareVarHeight();
            else {
                System.out.println("Sorry not a correct option, bye!");
                System.exit(0);
            }

            System.out.println("Do you want to try another (Y/N)?");
            String choice2 = scan.next();

            if (choice2.equalsIgnoreCase("y"));
            else {
                break;
            }
        }
    }

    static int shapeWidthVar() {
            System.out.println("Enter width: ");
            return scan.nextInt();
    }
    static int shapeWidth() {
        while (true) {
            System.out.println("Enter width (odd number): ");
            int width = scan.nextInt();
            if (width % 2 != 0) {
                return width;
            }
        }
    }

    static int shapeHeightVar() {
        System.out.println("Enter height: ");
        return scan.nextInt();
    }
    static int shapeHeight(int width) {
        while (true) {
            System.out.println("Enter height (greater than or equal to width): ");
            int height = scan.nextInt();
            if (height >= width) {
                return height;
            }
        }
    }

    public static void interior(int width, int i) {
        for (int j = 0; j < (width / 2) - i / 2; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void triangle() {
        int width = shapeWidthVar();
        for (int i = 1; i < width + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void triangleInv() {
        int width = shapeWidthVar();
        for (int i = width; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void triangleEquil() {
        int width = shapeWidth();
        for (int i = 1; i < width + 1; i += 2) {
            interior(width, i);
        }
    }

    public static void triangleEquilInv() {
        int width = shapeWidth();
        for (int i = width; i > 0; i -= 2) {
            for (int j = 0; j < (width / 2) - i / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void diamond() {
        int width = shapeWidth();
        for (int i = 1; i < width + 1; i += 2) {
            interior(width, i);
        }
        for (int i = width - 2; i > 0; i -= 2) {
            interior(width, i);
        }
    }

    public static void diamondVarHeight() {
        int width = shapeWidth();
        int height = shapeHeight(width);
        for (int i = 1; i < width + 1; i += 2) {
            interior(width, i);
        }

        String starM = "";
        int heightRem = height - width;
        for (int i = 1; i <= width; i++) {
            starM += "*";
        }
        for (int i = 1; i <= heightRem; i++) {
            System.out.println(starM);
        }

        for (int i = width - 2; i > 0; i -= 2) {
            interior(width, i);
        }
    }

    public static void square() {
        int width = shapeWidthVar();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void squareVarHeight() {
        int width = shapeWidthVar();
        int height = shapeHeightVar();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}