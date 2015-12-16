/*
 * Copyright 2015 Armand Agopian
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

package java.assignments.semester1;

import java.util.Scanner;

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

        for (int i = 1; i <= column; i++) {
            row1 += row1A;
            row2 += row2A;
        }

        for (int i = 1; i <= row; i++) {
            System.out.println(row1);
            System.out.println(row2);
        }

        System.out.println(row1);
    }
}
