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

package other;

public class RSA {
    public static void main(String[] args) {
        int maxCount = 500;
        int stepper = 0;
        int[] primeNumbers = new int[maxCount];
        boolean checkZero = false;
        for (int i = 2; checkZero == false; i++) {
            if (primeNumbers[maxCount - 1] != 0) {
                checkZero = true;
            }
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primeNumbers[stepper] = i;
                stepper++;
            }
        }
        
        /* int p = (int )(Math.random() * 500 + 1);
        int q = (int )(Math.random() * 500 + 1);
        int n = (p * q);
        int m = (p - 1)*(q - 1);
        int e = 3;
        while(m.gcd(e).intValue() > 1) e = e.add(new BigInteger("2"));
       
        {
            d = e.modInverse(m);
        } */
        for (int i = 0; i < primeNumbers.length; i++) {
            int j = i + 1;
            System.out.print(j + ". ");
            System.out.println(primeNumbers[i]);
        }
        // System.out.println(Arrays.toString(primeNumbers)); 
    }
}
