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
    public static void main(String[] args) {
        int k = 1;
        int tally[] = {4,6,45,23,5,2,76,8,32,45,2,56,12,13,54,13};

        for(int i = 0; i < tally.length; i++) {
            int k2 = k + 9;
            System.out.print(k + " - " + k2 + " | ");

            for(int j = 0; j < tally[i]; j++) {
                System.out.print("*");
            }

            k += 10;
            System.out.println();
        }
    }
}
