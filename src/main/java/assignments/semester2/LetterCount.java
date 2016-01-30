/*
 * Copyright © 2015 Armand Agopian
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

package assignments.semester2;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        final int numChars = 26;
        int[] upper = new int[numChars];
        int[] lower = new int[numChars];
        char current;
        int other = 0;

        System.out.println("Enter a sentence: ");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        for (int ch = 0; ch < line.length(); ch++) {
            current = line.charAt(ch);
            if (current >= 'A' && current <= 'Z') {
                upper[current - 'A']++;
            } else if (current >= 'a' && current <= 'z') {
                lower[current - 'a']++;
            } else {
                other++;
            }
        }

        System.out.println();
        for (int letter = 0; letter < upper.length; letter++) {
            System.out.print((char) (letter + 'A'));
            System.out.print(": " + upper[letter]);
            System.out.print("\t\t" + (char) (letter + 'a'));
            System.out.println(": " + lower[letter]);
        }
    }
}
