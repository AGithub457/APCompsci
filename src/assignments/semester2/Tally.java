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

import java.util.Arrays;

public class Tally {

    public static void main(String[] args) {
        int[] tallyInit = {3, 4, 5, 6, 7, 11, 13, 14, 22, 34, 35, 36, 51, 52, 64, 63, 65, 66, 66, 84, 95, 96, 92};
        int[] tally = new int[10];
        Sorts.insertionSort(tallyInit);

        for (int i = 0; i < tallyInit.length; i++) {
            if (tallyInit[i] >= 0 && tallyInit[i] <= 10) {
                tally[0]++;
            } else if (tallyInit[i] >= 11 && tallyInit[i] <= 20) {
                tally[1]++;
            } else if (tallyInit[i] >= 21 && tallyInit[i] <= 30) {
                tally[2]++;
            } else if (tallyInit[i] >= 31 && tallyInit[i] <= 40) {
                tally[3]++;
            } else if (tallyInit[i] >= 41 && tallyInit[i] <= 50) {
                tally[4]++;
            } else if (tallyInit[i] >= 51 && tallyInit[i] <= 60) {
                tally[5]++;
            } else if (tallyInit[i] >= 61 && tallyInit[i] <= 70) {
                tally[6]++;
            } else if (tallyInit[i] >= 71 && tallyInit[i] <= 80) {
                tally[7]++;
            } else if (tallyInit[i] >= 81 && tallyInit[i] <= 90) {
                tally[8]++;
            } else if (tallyInit[i] >= 91 && tallyInit[i] <= 100) {
                tally[9]++;
            }
        }
        System.out.println(Arrays.toString(tallyInit));
        System.out.println(Arrays.toString(tally));
        printArray(tally);
    }

    public static void printArray(int[] tally) {
        int[] count = tally;
        int k = 1;

        for (int i = 0; i < count.length; i++) {
            int k2 = k + 9;
            System.out.print(k + " - " + k2 + " | ");

            for (int j = 0; j < count[i]; j++) {
                System.out.print("*");
            }

            k += 10;
            System.out.println();
        }
    }

}