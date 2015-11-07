/**
 * Copyright (C) 2015 Armdev
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package assignments;

import javax.swing.*;
import java.awt.*;

public class YouMeUsThem extends JApplet {

    public void paint(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        String You = "You";

        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.red);
        g.fillOval(0, 0, 400, 400);

        g.setColor(Color.blue);
        g.fillRect(200, 59, 141, 141);

        g.setColor(Color.orange);
        g.fillRect(59, 200, 141, 141);

        Image poop = new ImageIcon(this.getClass().getResource("/images/poop.png")).getImage();
        g.drawImage(poop, 365, 325, 100, 100, this);
    }
}

