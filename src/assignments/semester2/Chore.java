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

import java.util.Scanner;

public class Chore {
    public static void main(String[] args) {
        Task t1, t2, t3;
        int level, levelMin, levelMax;
        Scanner scan = new Scanner(System.in);

        t1 = new Task("List: Take the dogs out.", 5);
        t1.setPriority(5);
        t2 = new Task("List: Build a computer.", 15);
        t2.setPriority(15);
        t3 = new Task("List: Earn a million bucks.", 31);
        t3.setPriority(30);

        System.out.println("\n" + t1.getChore());
        System.out.println("Conscience: I think it's around a level " + t1.getAllowance() + " chore.");
        System.out.println("How much do you think it's worth?");
        level = scan.nextInt();
        levelMin = t1.getPriority() - 5;
        levelMax = t1.getPriority() + 5;
        if (level >= levelMin && level <= levelMax) {
            System.out.println("Close enough, the exact priority level was " + t1.getPriority() + ".");
        } else {
            System.out.println("Close, but no cigar.");
        }

        System.out.println("\n" + t2.getChore());
        System.out.println("Conscience: I think it's around a level " + t2.getAllowance() + " chore.");
        System.out.println("How much do you think it's worth?");
        level = scan.nextInt();
        levelMin = t2.getPriority() - 5;
        levelMax = t2.getPriority() + 5;
        if (level >= levelMin && level <= levelMax) {
            System.out.println("Close enough, the exact priority level was " + t2.getPriority() + ".");
        } else {
            System.out.println("Close, but no cigar.");
        }

        System.out.println("\n" + t3.getChore());
        System.out.println("Conscience: I think it's around a level " + t3.getAllowance() + " chore.");
        System.out.println("How much do you think it's worth?");
        level = scan.nextInt();
        levelMin = t3.getPriority() - 5;
        levelMax = t3.getPriority() + 5;
        if (level >= levelMin && level <= levelMax) {
            System.out.println("Close enough, the exact priority level was " + t3.getPriority() + ".");
        } else {
            System.out.println("Close, but no cigar.");
        }
    }
}
