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

package assignments.semester1;

import java.util.ArrayList;
import java.util.Scanner;

public class Alphabetizer {
    public static void main(String[] args) {
        String input;
        String yn;
        String sorted = "";
        ArrayList<String> ar = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        alphaAsk:
        while (true) {
            System.out.println("Enter a word to alphabetize: ");
            input = scan.nextLine();
            ar.add(input);

            System.out.println("Do you want to enter another word to alphabetize? (Y/N)");
            while (true) {
                yn = scan.nextLine();
                if (yn.equalsIgnoreCase("n")) {
                    break alphaAsk;
                } else if (yn.equalsIgnoreCase("y")) {
                    break;
                } else {
                    System.out.println("Enter either Y or N...");
                }
            }
        }

        java.util.Collections.sort(ar);
        for (String s : ar) {
            sorted += s + "\n";
        }

        System.out.println("Your alphabetized list: \n" + sorted);
    }
}
