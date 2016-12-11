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

import java.util.Scanner;

public class MiniQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Question q1, q2;
        String possible;

        q1 = new Question("What is the capital of U.S.A.?", "Washington DC");
        q1.setComplexity(4);

        q2 = new Question("If you had a million dollars, would you save it or spend it??", "idk");
        q2.setComplexity(10);

        System.out.println(q1.getQuestion());
        System.out.println(" (Level: " + q1.getComplexity() + ")");
        possible = scan.nextLine();
        if (q1.answerCorrect(possible)) {
            System.out.println("Correct");
        } else {
            System.out.println("No, the answer is " + q1.getAnswer());
        }

        System.out.println();
        System.out.print(q2.getQuestion());
        System.out.println(" Level: " + q2.getComplexity() + ")");
        possible = scan.nextLine();
        if (q2.answerCorrect(possible)) {
            System.out.println("Correct");
        } else {
            System.out.println("No, the answer is " + q2.getAnswer());
        }
    }
}
