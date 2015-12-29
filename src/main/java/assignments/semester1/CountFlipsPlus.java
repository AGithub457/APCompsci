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

import java.util.Scanner;

public class CountFlipsPlus {
    public static void main(String[] args) {
        int heads = 0, tails = 0;

        Coin myCoin = new Coin();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of times to flip: ");
        int numFlips = scan.nextInt();

        for (int count = 1; count <= numFlips; count++) {
            myCoin.flip();

            if (myCoin.isHeads()) {
                heads++;
            } else {
                tails++;
            }
        }

        System.out.println("The number of flips: " + numFlips);
        System.out.println("The number of heads: " + heads);
        System.out.println("The number of tails: " + tails);
    }
}
