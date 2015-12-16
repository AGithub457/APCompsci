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

package java.assignments.semester1;

public class Die {
    private final int MIN_FACES = 4;
    private int numFaces;
    private int faceValue;

    public Die() {
        numFaces = 6;
        faceValue = 1;
    }

    public Die(int faces) {
        if (faces < MIN_FACES)
            numFaces = 6;
        else
            numFaces = faces;
        faceValue = 1;
    }

    public int roll() {
        faceValue = (int) (Math.random() * numFaces) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
