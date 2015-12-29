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

package assignments.semester1;

public class BottlesOfBeer {
    public static void main(String[] args) {
        for (int count = 99; count >= 0; count--) {
            int count2 = count - 1;

            if (count == 1) {
                System.out.println(count + " bottle of beer on the floor");
                System.out.println(count + " bottle of beer");
                System.out.println("Pick one up, pass it around");
                System.out.println(count2 + " bottles of beer on the floor\n");
            } else if (count == 0) {
                System.out.println(count + " bottles of beer on the floor");
                System.out.println(count + " bottles of beer");
                System.out.println("Go to the store, buy some more");
                count2 = 99;
                System.out.println(count2 + " bottles of beer on the floor\n:)");
            } else {
                System.out.println(count + " bottles of beer on the floor");
                System.out.println(count + " bottles of beer");
                System.out.println("Pick one up, pass it around");
                if (count2 == 1) {
                    System.out.println(count2 + " bottle of beer on the floor\n");
                } else {
                    System.out.println(count2 + " bottles of beer on the floor\n");
                }
            }
        }
    }
}
