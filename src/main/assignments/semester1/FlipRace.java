/*
 * Copyright 2015 Armand Agopian
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

package assignments.semester1;

public class FlipRace {
    public static void main(String[] args) {
        final int GOAL = 3;
        int count1 = 0, count2 = 0;

        Coin coin1 = new Coin();
        Coin coin2 = new Coin();
        while (count1 < GOAL && count2 < GOAL) {
            coin1.flip();
            coin2.flip();

            System.out.print("Coin 1: " + coin1);
            System.out.println(" Coin 2: " + coin2);

            count1 = (coin1.isHeads()) ? count1 + 1 : 0;
            count2 = (coin2.isHeads()) ? count2 + 1 : 0;
        }

        if (count1 < GOAL) {
            System.out.println("Coin 2 Wins!");
        } else if (count2 < GOAL) {
            System.out.println("Coin 1 Wins!");
        } else {
            System.out.println("It's a TIE!");
        }
    }
}
