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

package assignments.semester1.DrawAsteriskShapesPlus;

import java.util.Scanner;

public class CoreParams {
    int width, height;
    Scanner scan = new Scanner(System.in);

    public ShapeChoice promptInputParams() {
        System.out.println("Choose:");
        System.out.println("A) Basic Right Triangle");
        System.out.println("B) Inverted Right Triangle");
        System.out.println("C) Equilateral Triangle");
        System.out.println("D) Inverted Equilateral Triangle");
        System.out.println("E) Perfect Diamond");
        System.out.println("F) Variable Height Diamond");
        String choice = scan.next();
        width = shapeWidth();
        height = shapeHeight(width);

        if (choice.equalsIgnoreCase("a")) return ShapeChoice.triangle;
        if (choice.equalsIgnoreCase("b")) return ShapeChoice.invertedTriangle;
        if (choice.equalsIgnoreCase("c")) return ShapeChoice.equilateralTriangle;
        if (choice.equalsIgnoreCase("d")) return ShapeChoice.invertedEquilateralTriangle;
        if (choice.equalsIgnoreCase("e")) return ShapeChoice.diamond;
        if (choice.equalsIgnoreCase("f")) return ShapeChoice.variableHeightDiamond;

        System.out.println("Bye");
        return ShapeChoice.unknown;
    }

    public void drawShape(ShapeChoice shapeChoice) {

        IDrawShape drawer = null;

        switch (shapeChoice) {
            case triangle:
                drawer = new ShapeTriangle();
                break;
            case invertedTriangle:
                new ShapeTriangleInverted();
                break;
            case equilateralTriangle:
                new ShapeTriangleEquilateral();
                break;
            case invertedEquilateralTriangle:
                new ShapeTriangleEquilateralInverted();
                break;
            case diamond:
                new ShapeDiamond();
                break;
            case variableHeightDiamond:
                new ShapeDiamondVariableHeight();
                break;
        }

        if (drawer != null) drawer.drawShape(width, height);
    }

    int shapeWidth() {
        while (true) {
            System.out.println("Enter width of diamond (odd number): ");
            int width = scan.nextInt();
            if (width % 2 != 0) {
                return width;
            }
        }
    }

    int shapeHeight(int width) {
        while (true) {
            System.out.println("Enter height of diamond (greater than or equal to width): ");
            int height = scan.nextInt();
            if (height >= width) {
                return height;
            }
        }
    }

}
