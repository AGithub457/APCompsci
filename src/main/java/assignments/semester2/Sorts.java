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

package assignments.semester2;

public class Sorts {
    public static void selectionSort(int[] numbers) {
        int min, temp;

        for(int index = 0; index < numbers.length - 1; index++){
            min=index;
            for(int scan = index + 1; scan < numbers.length; index++) {
                if(numbers[scan] < numbers[min]) {
                    min = scan;
                }
            }

            temp = numbers[min];
            numbers[min] = numbers[index];
            numbers[index] = temp;
        }
    }

    public static void insertionSort(int[] numbers) {
        for(int index = 1; index < numbers.length; index++){
            int key = numbers[index];
            int position = index;

            while(position > 0 && numbers[position-1] > key) {
                numbers[position] = numbers[position-1];
                position--;
            }

            numbers[position] = key;
        }
    }

    public static void insertionSort(Comparable[] objects) {
        for(int index = 1; index < objects.length; index++) {
            Comparable key = objects[index];
            int position = index;

            while(position > 0 && objects[position-1].compareTo(key) > 0) {
                objects[position] = objects[position-1];
                position--;
            }

            objects[position] = key;
        }
    }
}
