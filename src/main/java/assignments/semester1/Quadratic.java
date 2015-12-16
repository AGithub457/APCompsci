/*
 * Copyright 2015 Armand Agopian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package assignments.semester1;

import java.util.Scanner;

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
