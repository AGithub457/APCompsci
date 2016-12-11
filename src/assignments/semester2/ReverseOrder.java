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

package assignments.semester2;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        System.out.println("The size of the array: " + numbers.length);
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Enter number " + (index + 1) + ": ");
            Scanner scan = new Scanner(System.in);
            numbers[index] = scan.nextDouble();
        }

        System.out.println("The numbers in reverse order: ");
        for (int index = numbers.length - 1; index >= 0; index--)
            System.out.println(numbers[index] + "  ");
        System.out.println();
    }
}
