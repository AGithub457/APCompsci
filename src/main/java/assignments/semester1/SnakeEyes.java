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

public class SnakeEyes {
    public static void main(String[] args) {
        final int ROLLS = 500;
        int snakeEyes = 0, num1, num2;
        Die die1 = new Die();
        Die die2 = new Die(20);
        for (int roll = 1; roll <= ROLLS; roll++) {
            num1 = die1.roll();
            num2 = die2.roll();
            if (num1 == 1 && num2 == 1) {
                snakeEyes++;
            }
        }
        System.out.println("Number of rolls: " + ROLLS);
        System.out.println("Number of snake eyes: " + snakeEyes);
        System.out.println("Ratio: " + (float) snakeEyes / ROLLS);
    }
}
