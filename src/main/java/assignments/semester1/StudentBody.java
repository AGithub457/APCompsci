/*
 * Copyright 2015 Armand Agopian
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

public class StudentBody {
    public static void main(String[] args) {
        Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
        Address jHome = new Address("21 Jump Street", "Lynchburg", "VA", 24551);
        Student john = new Student("John", "Smith", jHome, school);
        Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
        Student marsha = new Student("Marsha", "Jones", mHome, school);
        System.out.println(john);
        System.out.println();
        System.out.println(marsha);
    }
}
