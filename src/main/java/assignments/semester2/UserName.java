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

import java.util.Arrays;
import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] guests = {"Jeffrey", "Jesse", "Corn", "Melissa", "Jackie"};

        //guests = Arrays.copyOf(guests, guests.length*2);
        //boolean check arraylength
        String name;
        boolean found = false;
        System.out.println("Enter a name: ");
        name = scan.next();

        for(int index = 0; index < guests.length; index++) {
            if(name.equalsIgnoreCase(guests[index])) {
                found = true;
            }
        }

        if(found) {
            System.out.println(name + " is on the guest list.");
        } else {
            System.out.println(name + " is not on the guest list.");
        }
    }
}
