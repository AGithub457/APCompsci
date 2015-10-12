package assignments;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Created by Armand on 9/29/2015.
 */
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