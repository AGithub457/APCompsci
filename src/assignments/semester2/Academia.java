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

public class Academia {
    public static void main(String[] args) {
        Student Frank = new Student("Frank", 5);
        StudentAthlete Suki = new StudentAthlete("Suki", 4, "Soccer");
        StudentScholar David = new StudentScholar("David", 7, "Mathematics");

        System.out.println(Frank);
        System.out.println();

        System.out.println(Suki);
        System.out.println();

        System.out.println(David);
        System.out.println();
    }
}
