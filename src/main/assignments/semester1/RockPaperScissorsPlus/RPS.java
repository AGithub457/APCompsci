/*
 * Copyright 2015 Armand Agopian
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

package assignments.semester1.RockPaperScissorsPlus;

import java.util.Comparator;

public enum RPS implements Comparator<RPS> {
    Rock,
    Paper,
    Scissors;

    static public int match (RPS o1, RPS o2) {

        if (o1 == o2) return 0;

        if (o1 == RPS.Rock && o2 == RPS.Scissors) return 1;
        if (o1 == RPS.Paper && o2 == RPS.Rock) return 1;
        if (o1 == RPS.Scissors && o2 == RPS.Paper) return 1;

        return -1;
    }

    public int compare(RPS o1, RPS o2) {
        return RPS.match(o1,o2);
    }
}
