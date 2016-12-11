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

package assignments.semester2;

public class SortGrades {
    public static void main(String[] args) {
        int[] grades = {89, 94, 69, 80, 97, 85, 73, 91, 77, 85, 93};
        int[] grades2 = {89, 94, 69, 80, 97, 85, 73, 91, 77, 85, 93};

        Sorts.selectionSortInv(grades);
        Sorts.insertionSortInv(grades2);

        for (int index = 0; index < grades.length; index++) {
            System.out.print(grades[index] + "    ");
        }

        for (int index = 0; index < grades2.length; index++) {
            System.out.print(grades2[index] + "    ");
        }
    }
}
