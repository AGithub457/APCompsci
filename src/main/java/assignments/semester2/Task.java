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

public class Task implements Priority {
    private String chore;
    private int allowance, priorityLevel;

    public Task(String job, int payment) {
        chore=job;
        allowance=payment;
        priorityLevel=1;
    }

    public void setPriority(int level) {
        priorityLevel=level;
    }

    public int getPriority() {
        return priorityLevel;
    }

    public String getChore() {
        return chore;
    }

    public int getAllowance() {
        return allowance;
    }
}
