package assignments;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Armdev on 9/24/15.
 */
public class YouMeUsThem extends JApplet {

    public void paint ( Graphics g ) {
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

