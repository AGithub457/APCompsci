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

package assignments.RockPaperScissorsPlus;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    RPS choiceUser;
    RPS choiceComp;
    int compResult;

    public boolean playGame() {
        //get user input
        if (!userInput()) return false;

        //generate computer data
        compGen();

        //find winner and loser
        //compare two RPS
        //if 1 - RPS user wins over RPS computer
        //if 0 - RPS ties with RPS computer
        //if -1 - RPS loses against RPS computer
        //save results in compResult
        compResult = RPS.match(choiceUser, choiceComp);

        //print the result
        printResult();

        return true;
    }

    private boolean userInput() {
        //scan user input for RPorS as string
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter either rock, paper, or scissors: ");
        String sUser = scan.next().toLowerCase();

        //convert string to RPS
        //save RPS in choiceUser
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
        //random number generator between 0-2
        Random rand = new Random();
        int randNum = rand.nextInt(3);

        //convert number to RPS
        //save RPS in choiceComp
        switch (randNum) {
            case 0 : choiceComp = RPS.Rock; break;
            case 1 : choiceComp = RPS.Paper; break;
            case 2 : choiceComp = RPS.Scissors; break;
        }
    }

    private void printResult() {
        //print results
        String printThis = "";
        switch (compResult) {
            case 1 : printThis = "You won"; break;
            case 0 : printThis = "You tied"; break;
            case -1 : printThis = "You lost"; break;
        }
        System.out.println("You had " + choiceUser.name() + " and the computer had " + choiceComp.name());
        System.out.println(printThis);
    }
}
