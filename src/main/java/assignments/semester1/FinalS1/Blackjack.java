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

package assignments.semester1.FinalS1;

import java.util.ArrayList;

public class Blackjack {
    String comp, user;
    String suit, card;
    int compVal = 0, userVal = 0;
    int total, totalWin, totalLoss;
    ArrayList<String> cardsUsed = new ArrayList<>();
    CardPicker cp = new CardPicker();

    public void playGame() {
        card = cp.cardName();
        while (cardsUsed.contains(card)) {
            card = cp.cardName();
        }
        comp = card;
        compVal = cp.cardVal();
        cardsUsed.add(card);
        card = cp.cardName();
        while (cardsUsed.contains(card)) {
            card = cp.cardName();
        }
        user = card;
        userVal = cp.cardVal();
        cardsUsed.add(card);

        printResult();
        keepScore();
    }

    public void keepScore() {

    }

    public void printResult() {
        System.out.println(comp);
        System.out.println(user);
        System.out.println(compVal);
        System.out.println(userVal);
        System.out.println(cardsUsed);
        System.out.println("Total games played: " + total);
        System.out.println("Total games won:    " + totalWin);
        System.out.println("Total games lost:   " + totalLoss);
    }
}
