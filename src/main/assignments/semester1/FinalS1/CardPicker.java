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
        switch(card) {
            case "S1":
                cardV = 11;
                break;
            case "S2":
                cardV = 2;
                break;
            case "S3":
                cardV = 3;
                break;
            case "S4":
                cardV = 4;
                break;
            case "S5":
                cardV = 5;
                break;
            case "S6":
                cardV = 6;
                break;
            case "S7":
                cardV = 7;
                break;
            case "S8":
                cardV = 8;
                break;
            case "S9":
                cardV = 9;
                break;
            case "S10":
                cardV = 10;
                break;
            case "S11":
                cardV = 11;
                break;
            case "S12":
                cardV = 12;
                break;
            case "S13":
                cardV = 13;
                break;
            case "D1":
                cardV = 11;
                break;
            case "D2":
                cardV = 2;
                break;
            case "D3":
                cardV = 3;
                break;
            case "D4":
                cardV = 4;
                break;
            case "D5":
                cardV = 5;
                break;
            case "D6":
                cardV = 6;
                break;
            case "D7":
                cardV = 7;
                break;
            case "D8":
                cardV = 8;
                break;
            case "D9":
                cardV = 9;
                break;
            case "D10":
                cardV = 10;
                break;
            case "D11":
                cardV = 11;
                break;
            case "D12":
                cardV = 12;
                break;
            case "D13":
                cardV = 13;
                break;
            case "H1":
                cardV = 11;
                break;
            case "H2":
                cardV = 2;
                break;
            case "H3":
                cardV = 3;
                break;
            case "H4":
                cardV = 4;
                break;
            case "H5":
                cardV = 5;
                break;
            case "H6":
                cardV = 6;
                break;
            case "H7":
                cardV = 7;
                break;
            case "H8":
                cardV = 8;
                break;
            case "H9":
                cardV = 9;
                break;
            case "H10":
                cardV = 10;
                break;
            case "H11":
                cardV = 11;
                break;
            case "H12":
                cardV = 12;
                break;
            case "H13":
                cardV = 13;
                break;
            case "C1":
                cardV = 11;
                break;
            case "C2":
                cardV = 2;
                break;
            case "C3":
                cardV = 3;
                break;
            case "C4":
                cardV = 4;
                break;
            case "C5":
                cardV = 5;
                break;
            case "C6":
                cardV = 6;
                break;
            case "C7":
                cardV = 7;
                break;
            case "C8":
                cardV = 8;
                break;
            case "C9":
                cardV = 9;
                break;
            case "C10":
                cardV = 10;
                break;
            case "C11":
                cardV = 11;
                break;
            case "C12":
                cardV = 12;
                break;
            case "C13":
                cardV = 13;
                break;
        }
        return cardV;
    }
}
