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

public class Multiples {
    public static void main(String[] args) {
        int value, limit, mult, count = 5;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive value: ");
        value = scan.nextInt();

        System.out.println("Enter an upper limit: ");
        limit = scan.nextInt();

        System.out.println("\nThe multiples of " + value + " between " + value + " and " + limit + " (inclusive) are:");

        for (mult = value; mult <= limit; mult += value) {
            System.out.print(mult + "\t");

            count--;
            if (count == 0) {
                System.out.println();
                count = 5;
            }
        }
    }
}
