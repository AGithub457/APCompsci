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

public class Question implements Complexity {
    private String question, answer;
    private int complexityLevel;

    public Question(String query, String result) {
        question = query;
        answer = result;
        complexityLevel = 1;
    }

    public int getComplexity() {
        return complexityLevel;
    }

    public void setComplexity(int level) {
        complexityLevel = level;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean answerCorrect(String candidateAnswer) {
        return answer.equalsIgnoreCase(candidateAnswer);
    }

    public String toString() {
        return question + "\n" + answer;
    }
}
