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
import java.util.Random;

public class NumberCount {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arrayInput = new int[50];
        int[] arrayCounter = new int[51];

        for (int i = 0; i < arrayInput.length; i++) {
            arrayInput[i] = rand.nextInt(51);
            arrayCounter[arrayInput[i]]++;
        }

        System.out.println(Arrays.toString(arrayInput));
        for (int i = 0; i < arrayCounter.length; i++) {
            System.out.println((i) + ":" + arrayCounter[i]);
        }
    }
}
