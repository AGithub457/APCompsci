/**
 * Copyright (C) 2015 Armdev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int sum = 0, value = 0, count = 0;
        double average;
        Scanner scan = new Scanner(System.in);

        while (value != 0); {
            count++;
            sum += value;
            
            System.out.print("Enter an integer (0 to quit): ");
            while (true) {
                if (!scan.hasNextInt()) {
                    scan.next();
                    System.out.print("Enter an integer only!!!");
                }
                else {
                    value = scan.nextInt();
                    break;
                }
            }
            scan.nextLine();
            System.out.println("The sum so far is " + sum);
        }

        System.out.println ();
        if (count == 0) {
            System.out.println("No values were entered.");
        }
        else {
            average = (double)sum / count;
            DecimalFormat fmt = new DecimalFormat("0.###");
            System.out.println("The average is " + fmt.format(average));
        }
    }
        
}
