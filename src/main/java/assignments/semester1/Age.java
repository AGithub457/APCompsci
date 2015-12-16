/*
 * Copyright 2015 Armand Agopian
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

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int age;
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an age: ");
            age = scan.nextInt();

            if (age < 21) {
                System.out.println("Too young");
            } else {
                System.out.println("Aww yeah...");
            }
        }
    }
}
