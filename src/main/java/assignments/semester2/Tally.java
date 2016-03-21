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

public class Tally {
    static int[] tally = {3, 4, 5, 6, 7, 11, 13, 14, 22, 34, 35, 36, 51, 52, 64, 63, 65, 66, 66, 84, 95, 96, 92};

    public static void main(String[] args) {

    }

    public static void printArray() {
        int k = 1;

        for (int i = 0; i < tally.length; i++) {
            int k2 = k + 9;
            System.out.print(k + " - " + k2 + " | ");

            for (int j = 0; j < tally[i]; j++) {
                System.out.print("*");
            }

            k += 10;
            System.out.println();
        }
    }
    
}