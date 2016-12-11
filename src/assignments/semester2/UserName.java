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
import java.util.Scanner;

public class UserName {
    static String[] nameArray = new String[5];
    static String name;

    public static void main(String[] args) {
        int count = 0;
        int index = 0;
        boolean found;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter in a name: ");
        name = scan.next();

        while (true) {
            nameArray[index] = name;
            index++;
            count++;
            if (count == nameArray.length) {
                System.out.println("The names are: " + Arrays.toString(nameArray));
                increaseSize();
                System.out.println("The array was doubled.\n");
            }
            System.out.println("Please enter another one: ");
            name = scan.next();
            found = foundUserName();
            while (found) {
                System.out.println("This name is already used.\n");
                System.out.println("Please enter another one: ");
                name = scan.next();
                found = foundUserName();
            }
        }
    }

    private static boolean foundUserName() {
        boolean found = false;
        for (int index = 0; index < nameArray.length; index++) {
            if (name.equalsIgnoreCase(nameArray[index]))
                found = true;
        }
        return found;
    }

    private static void increaseSize() {
        String[] temp = new String[nameArray.length * 2];
        for (int index = 0; index < nameArray.length; index++)
            temp[index] = nameArray[index];
        nameArray = temp;
    }
}
