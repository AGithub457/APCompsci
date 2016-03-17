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

public class GradStudent extends Student {
    private String source;
    private double rate;

    public GradStudent(String studentName, int courses, String support, double payRate) {
        super(studentName, courses);

        source = support;
        rate = payRate;
    }

    public String toString() {
        String result = super.toString();

        result += "\nSupport source: " + source + "\n";
        result += "Hourly pay rate: " + rate;
        return result;
    }
}
