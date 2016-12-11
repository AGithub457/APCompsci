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

package assignments.semester1.RockPaperScissorsPlus;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    RPS choiceUser;
    RPS choiceComp;
    int compResult, total, totalWin, totalLoss, totalTie;

    public boolean playGame() {
        if (!userInput()) return false;

        compGen();
        compResult = RPS.match(choiceUser, choiceComp);
        printResult();

        return true;
    }

    private boolean userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter either rock, paper, or scissors: ");
        String sUser = scan.next().toLowerCase();

        if (sUser.startsWith("r")) {
            choiceUser = RPS.Rock;
        } else if (sUser.startsWith("p")) {
            choiceUser = RPS.Paper;
        } else if (sUser.startsWith("s")) {
            choiceUser = RPS.Scissors;
        } else {
            System.out.println("Your entry " + sUser + " is not an approved input");
            return false;
        }
        return true;
    }

    private void compGen() {
        Random rand = new Random();
        int randNum = rand.nextInt(3);

        switch (randNum) {
            case 0:
                choiceComp = RPS.Rock;
                break;
            case 1:
                choiceComp = RPS.Paper;
                break;
            case 2:
                choiceComp = RPS.Scissors;
                break;
        }
    }

    private void printResult() {
        String printThis = "";
        switch (compResult) {
            case 1:
                printThis = "You won";
                totalWin++;
                break;
            case 0:
                printThis = "You tied";
                totalTie++;
                break;
            case -1:
                printThis = "You lost";
                totalLoss++;
                break;
        }
        total++;

        System.out.println("You had " + choiceUser.name() + " and the computer had " + choiceComp.name());
        System.out.println(printThis);
        System.out.println("Total games played: " + total);
        System.out.println("Total games won:    " + totalWin);
        System.out.println("Total games lost:   " + totalLoss);
        System.out.println("Total games tied:   " + totalTie);
    }
}
