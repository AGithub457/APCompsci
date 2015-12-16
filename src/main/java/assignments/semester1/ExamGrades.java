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

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExamGrades {
    public static void main(String[] args) {
        int grade, count = 0, sum = 0, max, min;
        double average;
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter the first grade (-1 to quit): ");
        grade = scan.nextInt();

        max = min = grade;

        while (grade >= 0) {
            count++;
            sum += grade;

            if (grade > max) {
                max = grade;
            } else if (grade < min) {
                min = grade;
            }

            System.out.println("Enter the next grade (-1 to quit): ");
            grade = scan.nextInt();
        }

        if (count == 0) {
            System.out.println("No valid grades were entered");
        } else {
            DecimalFormat dfmt = new DecimalFormat("0.##");
            average = (double) sum / count;
            System.out.println("\nTotal number of students: " + count);
            System.out.println("Average grade: " + dfmt.format(average));
            System.out.println("Highest grade: " + max);
            System.out.println("Lowest grade: " + min);
        }
    }
}
