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

import java.util.Random;

public class CardPicker {
    String card = "";
    int cardV;
    Random rand = new Random();
    int suitNum, cardNum;

    public String cardName() {
        suitNum = rand.nextInt(3) + 1;
        cardNum = rand.nextInt(12) + 1;
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
                break;
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
                break;
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
                break;
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
                break;
            }
        }
        return card;
    }

    public int cardVal() {
        if (card.equalsIgnoreCase("S1") || card.equalsIgnoreCase("D1") || card.equalsIgnoreCase("H1") || card.equalsIgnoreCase("C1")) {
            cardV = 11;
        } else if (card.equalsIgnoreCase("S2") || card.equalsIgnoreCase("D2") || card.equalsIgnoreCase("H2") || card.equalsIgnoreCase("C2")) {
            cardV = 2;
        } else if (card.equalsIgnoreCase("S3") || card.equalsIgnoreCase("D3") || card.equalsIgnoreCase("H3") || card.equalsIgnoreCase("C3")) {
            cardV = 3;
        } else if (card.equalsIgnoreCase("S4") || card.equalsIgnoreCase("D4") || card.equalsIgnoreCase("H4") || card.equalsIgnoreCase("C4")) {
            cardV = 4;
        } else if (card.equalsIgnoreCase("S5") || card.equalsIgnoreCase("D5") || card.equalsIgnoreCase("H5") || card.equalsIgnoreCase("C5")) {
            cardV = 5;
        } else if (card.equalsIgnoreCase("S6") || card.equalsIgnoreCase("D6") || card.equalsIgnoreCase("H6") || card.equalsIgnoreCase("C6")) {
            cardV = 6;
        } else if (card.equalsIgnoreCase("S7") || card.equalsIgnoreCase("D7") || card.equalsIgnoreCase("H7") || card.equalsIgnoreCase("C7")) {
            cardV = 7;
        } else if (card.equalsIgnoreCase("S8") || card.equalsIgnoreCase("D8") || card.equalsIgnoreCase("H8") || card.equalsIgnoreCase("C8")) {
            cardV = 8;
        } else if (card.equalsIgnoreCase("S9") || card.equalsIgnoreCase("D9") || card.equalsIgnoreCase("H9") || card.equalsIgnoreCase("C9")) {
            cardV = 9;
        } else if (card.equalsIgnoreCase("S10") || card.equalsIgnoreCase("D10") || card.equalsIgnoreCase("H10") || card.equalsIgnoreCase("C10") || card.equalsIgnoreCase("S11") || card.equalsIgnoreCase("D11") || card.equalsIgnoreCase("H11") || card.equalsIgnoreCase("C11") || card.equalsIgnoreCase("S12") || card.equalsIgnoreCase("D12") || card.equalsIgnoreCase("H12") || card.equalsIgnoreCase("C12") || card.equalsIgnoreCase("S13") || card.equalsIgnoreCase("D13") || card.equalsIgnoreCase("H13") || card.equalsIgnoreCase("C13")) {
            cardV = 10;
        }
        return cardV;
    }
}
