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

package assignments.semester2;

public class Pets {
    public static void main(String[] args) {
        Dog fido = new Dog("Fido", 45);
        Snake sam = new Snake("Sam", 30);
        Oswald armand = new Oswald("Armand", 4);

        System.out.println(fido);
        System.out.println(fido.getName() + " says " + fido.speak());
        System.out.println(fido.move() + " " + fido.getName() + " " + fido.move());

        System.out.println();

        System.out.println(sam);
        System.out.println(sam.getName() + " says " + sam.speak());
        System.out.println(sam.move() + " " + sam.getName() + " " + sam.move());

        System.out.println();

        System.out.println(armand);
        System.out.println(armand.getName() + " says " + armand.speak());
        System.out.println(armand.move() + " " + armand.getName() + " " + armand.move());

    }
}
