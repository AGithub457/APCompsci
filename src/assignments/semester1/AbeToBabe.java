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

public class AbeToBabe {
    public static void main(String[] args) {
        String word1;
        String word2;
        int val;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word: ");
        word1 = scan.nextLine();
        System.out.println("Enter your second word: ");
        word2 = scan.nextLine();

        val = word1.compareTo(word2);

        if (val == 0) {
            System.out.println(word1 + " is the same as " + word2);
        }
        if (val < 0) {
            System.out.println(word1 + " comes before " + word2);
        }
        if (val > 0) {
            System.out.println(word1 + " comes after " + word2);
        }
    }
}
