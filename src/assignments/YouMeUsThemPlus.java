package assignments;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Armdev on 9/24/15.
 */
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
