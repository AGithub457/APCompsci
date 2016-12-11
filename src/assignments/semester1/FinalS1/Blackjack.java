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

package assignments.semester1.FinalS1;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
    int total, totalWin, totalLoss;
    ArrayList<String> cardsUsed = new ArrayList<>();
    ArrayList<String> cardsUsedComp = new ArrayList<>();
    ArrayList<String> cardsUsedCompToPrint = new ArrayList<>();
    ArrayList<String> cardsUsedUser = new ArrayList<>();
    CardPicker cp = new CardPicker();
    Scanner scan = new Scanner(System.in);
    boolean endGame = true;
    boolean endGame2 = false;
    private String comp, user;
    private String suit, card;
    private int compVal = 0, compValToPrint = 0, userVal = 0;

    public void playGame() {
        endGame = true;
        endGame2 = false;
        compVal = 0;
        compValToPrint = 0;
        userVal = 0;
        cardsUsed.clear();
        cardsUsedComp.clear();
        cardsUsedCompToPrint.clear();
        cardsUsedUser.clear();
        roundInitial();
        printIntermResult();
        over21Check();

        while (endGame) {
            System.out.println("Do you want to hit or stand");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("stand")) {
                endGame2 = true;
                break;
            }
            roundNextComp();
            roundNextUser();
            printIntermResult();
            over21Check();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

        while (endGame2) {
            roundNextComp();
            printIntermResult();
            over21Check();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }

        printResult();
    }

    public void roundInitial() {
        comp = drawCard();
        compVal += cp.cardVal();
        cardsUsedComp.add(card);
        comp = drawCard();
        cardsUsedComp.add(card);
        compVal += cp.cardVal();
        cardsUsedCompToPrint.add(card);
        compValToPrint += cp.cardVal();

        user = drawCard();
        cardsUsedUser.add(card);
        userVal += cp.cardVal();
        user = drawCard();
        cardsUsedUser.add(card);
        userVal += cp.cardVal();
    }

    public void roundNextComp() {
        comp = drawCard();
        cardsUsedComp.add(card);
        compVal += cp.cardVal();
        cardsUsedCompToPrint.add(card);
        compValToPrint += cp.cardVal();
    }

    public void roundNextUser() {
        user = drawCard();
        cardsUsedUser.add(card);
        userVal += cp.cardVal();
    }

    public void over21Check() {
        if (userVal > 21) {
            if (cardsUsedUser.contains("S1") || cardsUsedUser.contains("D1") || cardsUsedUser.contains("H1") || cardsUsedUser.contains("C1")) {
                userVal -= 10;
                if (userVal > 21) {
                    System.out.println("You Lost. Awww...");
                    total++;
                    totalLoss++;
                    endGame = false;
                    endGame2 = false;
                } else {
                    System.out.println("Your points so far:\t" + userVal);
                }
            } else {
                System.out.println("You Lost. Awww...");
                total++;
                totalLoss++;
                endGame = false;
                endGame2 = false;
            }
        } else if (compVal > 21) {
            if (cardsUsedComp.contains("S1") || cardsUsedComp.contains("d1") || cardsUsedComp.contains("h1") || cardsUsedComp.contains("c1")) {
                compVal -= 10;
                if (compVal > 21) {
                    System.out.println("You Won! Congrats!");
                    total++;
                    totalWin++;
                    endGame = false;
                    endGame2 = false;
                } else {
                    System.out.println("Dealer's points so far:\t" + compValToPrint + " + hidden initial card");
                }
            } else {
                System.out.println("You Won! Congrats!");
                total++;
                totalWin++;
                endGame = false;
                endGame2 = false;
            }
        } else if (userVal == 21) {
            System.out.println("You Won! Congrats!");
            total++;
            totalWin++;
            endGame = false;
            endGame2 = false;
        } else if (compVal == 21) {
            System.out.println("You Lost. Awww...");
            total++;
            totalLoss++;
            endGame = false;
            endGame2 = false;
        }
    }

    public String drawCard() {
        card = cp.cardName();
        while (cardsUsed.contains(card)) {
            card = cp.cardName();
        }
        cardsUsed.add(card);
        return card;
    }

    public void printIntermResult() {
        System.out.println("");
        System.out.println("Dealer's visible cards:\t" + cardsUsedCompToPrint);
        System.out.println("Dealer's points so far:\t" + compValToPrint + " + hidden initial card");
        System.out.println("Your cards:\t" + cardsUsedUser);
        System.out.println("Your points so far:\t" + userVal);
        System.out.println("");
    }

    public void printResult() {
        System.out.println("");
        System.out.println("Total games played: " + total);
        System.out.println("Total games won:    " + totalWin);
        System.out.println("Total games lost:   " + totalLoss);
    }
}
