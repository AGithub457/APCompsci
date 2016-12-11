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

package assignments.semester1;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomPhoneNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(743);
        int num3 = rand.nextInt(10000);

        DecimalFormat Format3 = new DecimalFormat("000");
        DecimalFormat Format4 = new DecimalFormat("0000");

        String phoneNumber = Format3.format(num1) + "-" + Format3.format(num2) + "-" + Format4.format(num3);
        System.out.println(phoneNumber);
    }
}