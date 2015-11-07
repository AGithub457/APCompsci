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

public class AsteriskShapes {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose:");
        System.out.println("A) Basic Right Triangle");
        System.out.println("B) Inverted Right Triangle");
        System.out.println("C) Equilateral Triangle");
        System.out.println("D) Inverted Equilateral Triangle");
        System.out.println("E) Perfect Diamond");
        System.out.println("F) Variable Height Diamond");
        String choice = scan.next();
        int width = shapeWidth();

        if(choice.equalsIgnoreCase("a")) {
            for (int i = 1; i < width + 1; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else if(choice.equalsIgnoreCase("b")) {
            for (int i = width; i > 0; i--) {
               for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else if(choice.equalsIgnoreCase("c")) {
            top(width);
        } else if(choice.equalsIgnoreCase("d")) {
            for (int i = width; i > 0; i-= 2) {
                for (int j = 0; j < (width / 2) - i / 2; j++) {
                    System.out.print(" ");
                } for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else if(choice.equalsIgnoreCase("e")) {
            top(width);
            bottom(width);
        } else if(choice.equalsIgnoreCase("f")) {
            int height = shapeHeight(width);

            top(width);
            middle(width, height);
            bottom(width);
        } else {
            System.out.println("Sorry not one of the options");
        }
    }

    static int shapeWidth() {
        while(true) {
            System.out.println("Enter width of diamond (odd number): ");
            int width = scan.nextInt();
            if (width % 2 != 0) {
                return width;
            }
        }
    }

    static int shapeHeight(int width) {
        while (true) {
            System.out.println("Enter height of diamond (greater than or equal to width): ");
            int height = scan.nextInt();
            if (height >= width) {
                return height;
            }
        }
    }

    public static void top(int width) {
        for (int i = 1; i < width + 1; i += 2) {
            for (int j = 0; j < (width / 2) - i / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    public static void middle(int width, int height) {
        String starM = "";
        int heightR = height - width;
        for (int i = 1; i <= width; i++) {
            starM += "*";
        }
        for (int i = 1; i <= heightR; i++) {
            System.out.println(starM);
        }
    }

    public static void bottom(int width) {
        for (int i = width - 2; i > 0; i -= 2) {
            for (int j = 0; j < (width / 2) - i / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
