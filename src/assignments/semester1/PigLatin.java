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

package assignments.semester1;

import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        String sentence, result, another;
        Scanner scan = new Scanner(System.in);

        PigLatinTranslator translator = new PigLatinTranslator();
        do {
            System.out.println();
            System.out.println("Enter a sentence (no punctuation):");
            sentence = scan.nextLine();
            System.out.println();
            result = translator.translate(sentence);
            System.out.println("That sentence in Pig Latin is:");
            System.out.println(result);
            System.out.println();
            System.out.print("Translate another sentence (y/n)? ");
            another = scan.nextLine();
        } while (another.equalsIgnoreCase("y"));
    }
}