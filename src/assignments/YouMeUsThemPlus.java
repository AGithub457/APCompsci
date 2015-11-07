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

package assignments;

import javax.swing.*;
import java.awt.*;

public class YouMeUsThemPlus extends JApplet {

    public void paint ( Graphics g )
    {
        int width  = getWidth();
        int height = getHeight();
        int midWidth = width / 2;
        int midHeight = height / 2;
        // int radius;
        int diameter;
        int x = 0;
        int y = 0;


        if ( width < height ) {
            // radius = width / 2;
            diameter = width - 1; // To clear the extra artifact
            y = (height - diameter ) / 2;
        }
        else {
            // radius = height / 2;
            diameter = height - 1; // To clear the extra artifact
            x = (width - diameter) / 2;
        }

        g.setColor(Color.white);
        g.fillRect( 0, 0, width, height );
        g.setColor( Color.black );

        String text = "...";
        Graphics2D g2d = (Graphics2D)g.create();
        FontMetrics fm = g2d.getFontMetrics();
        int x1 = (getWidth() - fm.stringWidth(text)) / 2;
        int y2 = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
        //g.drawString(text, x1, y2);

        if (getWidth() == getHeight()) {
            g.drawString("Center", x1, y2);
        }

        g.drawOval ( x, y, diameter, diameter);
    }
}
