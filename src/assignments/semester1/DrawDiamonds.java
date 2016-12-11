/*
 * Copyright © 2017 Armand Agopian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package assignments.semester1;

import java.util.Scanner;

public class DrawDiamonds {
    public static void main(String[] args) {
        int width, height, heightT;
        String starM = "";
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter width of diamond (odd number): ");
            width = scan.nextInt();
            if (width % 2 != 0) {
                break;
            }
        }
        while (true) {
            System.out.println("Enter height of diamond (greater than or equal to width): ");
            height = scan.nextInt();
            if (height >= width) {
                heightT = height - width;
                break;
            }
        }

        //top
        for (int i = 1; i < width + 1; i += 2) {
            for (int j = 0; j < (width / 2) - i / 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        //middle if necessary for extra height
        for (int i = 1; i <= width; i++) {
            starM += "*";
        }
        for (int i = 1; i <= heightT; i++) {
            System.out.println(starM);
        }

        //bottom
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
