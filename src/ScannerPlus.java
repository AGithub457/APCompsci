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

import java.util.Scanner;

public class ScannerPlus {
    Scanner scan = new Scanner(System.in);

    public int scanInt(String s) {
        while (true) {
            if (!scan.hasNextInt()) {
                scan.next();
                System.out.print("Enter an integer only: ");
            } else {
                int result = scan.nextInt();
                return result;
            }
        }
    }

    public double scanDouble(String s) {
        while (true) {
            if (!scan.hasNextDouble()) {
                scan.next();
                System.out.print("Enter an integer only: ");
            } else {
                double result = scan.nextDouble();
                return result;
            }
        }
    }

    public char scanChar(String s) {
        char result = scan.findInLine(".").charAt(0);
        return result;
    }

    public String scanStringS(String s) {
        String tokens[] = s.split(" ");
        String result = tokens[0];
        return result;
    }

    public String scanStringM(String s) {
        while (true) {
            if (!scan.hasNextLine()) {
                scan.next();
                System.out.print("Enter an integer only: ");
            } else {
                String result = scan.nextLine();
                return result;
            }
        }
    }
}
