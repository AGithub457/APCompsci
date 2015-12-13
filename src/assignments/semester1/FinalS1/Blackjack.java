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

package assignments.semester1.FinalS1;

import java.util.Random;

public class Blackjack {
    String comp, user, suit, card, cardsUsed = "";
    int total, totalWin, totalLoss, totalTie;
    Random rand = new Random();

    public void playGame() {
        comp = card();
        user = card();
    }

    private String card() {
        int suitNum = rand.nextInt(3) + 1;
        int cardNum = rand.nextInt(12) + 1;
        switch (suitNum) {
            case 1: {
                switch (cardNum) {
                    case 1:
                        card = "S1";
                        break;
                    case 2:
                        card = "S2";
                        break;
                    case 3:
                        card = "S3";
                        break;
                    case 4:
                        card = "S4";
                        break;
                    case 5:
                        card = "S5";
                        break;
                    case 6:
                        card = "S6";
                        break;
                    case 7:
                        card = "S7";
                        break;
                    case 8:
                        card = "S8";
                        break;
                    case 9:
                        card = "S9";
                        break;
                    case 10:
                        card = "S10";
                        break;
                    case 11:
                        card = "S11";
                        break;
                    case 12:
                        card = "S12";
                        break;
                    case 13:
                        card = "S13";
                        break;
                }
            }
            case 2: {
                switch (cardNum) {
                    case 1:
                        card = "D1";
                        break;
                    case 2:
                        card = "D2";
                        break;
                    case 3:
                        card = "D3";
                        break;
                    case 4:
                        card = "D4";
                        break;
                    case 5:
                        card = "D5";
                        break;
                    case 6:
                        card = "D6";
                        break;
                    case 7:
                        card = "D7";
                        break;
                    case 8:
                        card = "D8";
                        break;
                    case 9:
                        card = "D9";
                        break;
                    case 10:
                        card = "D10";
                        break;
                    case 11:
                        card = "D11";
                        break;
                    case 12:
                        card = "D12";
                        break;
                    case 13:
                        card = "D13";
                        break;
                }
            }
            case 3: {
                switch (cardNum) {
                    case 1:
                        card = "H1";
                        break;
                    case 2:
                        card = "H2";
                        break;
                    case 3:
                        card = "H3";
                        break;
                    case 4:
                        card = "H4";
                        break;
                    case 5:
                        card = "H5";
                        break;
                    case 6:
                        card = "H6";
                        break;
                    case 7:
                        card = "H7";
                        break;
                    case 8:
                        card = "H8";
                        break;
                    case 9:
                        card = "H9";
                        break;
                    case 10:
                        card = "H10";
                        break;
                    case 11:
                        card = "H11";
                        break;
                    case 12:
                        card = "H12";
                        break;
                    case 13:
                        card = "H13";
                        break;
                }
            }
            case 4: {
                switch (cardNum) {
                    case 1:
                        card = "C1";
                        break;
                    case 2:
                        card = "C2";
                        break;
                    case 3:
                        card = "C3";
                        break;
                    case 4:
                        card = "C4";
                        break;
                    case 5:
                        card = "C5";
                        break;
                    case 6:
                        card = "C6";
                        break;
                    case 7:
                        card = "C7";
                        break;
                    case 8:
                        card = "C8";
                        break;
                    case 9:
                        card = "C9";
                        break;
                    case 10:
                        card = "C10";
                        break;
                    case 11:
                        card = "C11";
                        break;
                    case 12:
                        card = "C12";
                        break;
                    case 13:
                        card = "C13";
                        break;
                }
            }
        }
        cardsUsed += card;
        System.out.println(cardsUsed);
        return card;
    }

    private void printResult() {
        System.out.println("Total games played: " + total);
        System.out.println("Total games won:    " + totalWin);
        System.out.println("Total games lost:   " + totalLoss);
        System.out.println("Total games tied:   " + totalTie);
    }
}
