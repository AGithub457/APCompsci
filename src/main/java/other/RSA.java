import java.util.Arrays;
import java.security.SecureRandom;

public class RSA {
    public static void main (String[] args) {
        int maxCount = 500;
        int stepper = 0;
        int[] primeNumbers = new int[maxCount];
        boolean checkZero = false;
        for (int i = 2; checkZero == false; i++) {
            if(primeNumbers[maxCount-1] != 0) {
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
         for(int i = 0; i < primeNumbers.length; i++) {
            int j = i+1;
            System.out.print(j + ". ");
            System.out.println(primeNumbers[i]);
        }
        // System.out.println(Arrays.toString(primeNumbers)); 
    }
}
