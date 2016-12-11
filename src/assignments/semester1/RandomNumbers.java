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


import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        int inputNum;
        int ranNum;

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        inputNum = scan.nextInt();

        Random generator = new Random();
        ranNum = generator.nextInt(10 - 5 + 1) + 5;
        System.out.println("Random Number + your number: " + ranNum + inputNum);
    }
}
