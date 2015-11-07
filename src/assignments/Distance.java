/**
 * Copyright (C) 2015 Armdev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package assignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first coordinate: ");
        String coordinate = scan.nextLine();
        String[] parts = coordinate.split(",");

        System.out.println("Enter your second coordinate: ");
        String coordinate2 = scan.nextLine();
        String[] parts2 = coordinate2.split(",");

        String x1 = parts[0].trim().substring(1).trim();
        String y1 = parts[1].trim().substring(0, parts[1].trim().length() - 1).trim();
        String x2 = parts2[0].trim().substring(1).trim();
        String y2 = parts2[1].trim().substring(0, parts2[1].trim().length() - 1).trim();
        int xDistance = Integer.parseInt(x2) - Integer.parseInt(x1);
        int yDistance = Integer.parseInt(y2) - Integer.parseInt(y1);

        double distance = Math.sqrt((Math.pow(xDistance, 2)) + (Math.pow(yDistance, 2)));

        DecimalFormat dfmt = new DecimalFormat("0.###");

        System.out.println("Your distance is: " + dfmt.format(distance) + " units");
    }
}
