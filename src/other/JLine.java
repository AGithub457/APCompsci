/**
 * Copyright (C) 2015 Armdev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package other;

import jline.TerminalFactory;
import jline.console.ConsoleReader;

import java.io.IOException;

public class JLine {
    public static void main(String[] args) {
        try {
            ConsoleReader console = new ConsoleReader();
            console.setPrompt("prompt> ");
            String line = null;
            while ((line = console.readLine()) != null) {
                console.println(line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                TerminalFactory.get().restore();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
