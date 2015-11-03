package assignments;

import java.util.Scanner;

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
public class MinOfThree {

    public static void main(String[] args) {
        int num1, num2, num3, min;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 < num2) {
            if (num1 < num3) {
                min = num1;
            }
            else {
                min = num3;
            }
        }
        else if (num2 < num3) {
            min = num2;
        }
        else {
            min = num3;
        }

        System.out.println("Minimum value: " + min);
    }
}
