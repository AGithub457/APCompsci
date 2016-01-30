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

package assignments.semester2;

public class CountInstances {
    public static void main(String[] args) {
        Slogan obj;

        obj = new Slogan("Remember the Alamo.");
        System.out.println(obj);

        obj = new Slogan("Don't worry. Be happy.");
        System.out.println(obj);

        obj = new Slogan("Live free. Die happy.");
        System.out.println(obj);

        obj = new Slogan("Talk is cheap.");
        System.out.println(obj);

        obj = new Slogan("Write once, Run anywhere");
        System.out.println(obj);

        System.out.println();
        System.out.println("Slogans created: " + Slogan.getCount());
    }
}
