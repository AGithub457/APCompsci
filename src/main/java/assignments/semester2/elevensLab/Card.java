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

package assignments.semester2.elevensLab;

public class Card {
    private String suit;
    private String rank;
    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) {
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
    }

    public String suit() {
        return suit;
    }

    public String rank() {
        return rank;
    }

    public int pointValue() {
        return pointValue;
    }

    public boolean matches(Card otherCard) {
        boolean match = false;
        if ((this.rank).equals(otherCard.rank) && (this.suit).equals(otherCard.suit)) {
            System.out.println("The two cards tested were equal.");
            match = true;
        } else {
            match = false;
        }
        return match;
    }

    @Override
    public String toString() {
        return (rank + " of " + suit + " has a point value of " + pointValue);
    }
}
