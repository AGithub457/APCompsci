package assignments;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Armdev on 9/29/2015.
 */

public class SnowmanTwo extends JApplet {

    public void paint(Graphics g)
    {
        final int MID = 100;
        final int MID2 = MID + 175;
        final int TOP = 50;
        g.setColor(Color.cyan);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.blue);
        g.fillRect(0, 175, getWidth(), 50);
        g.drawString("Armdev", 0, 10);
        g.setColor(Color.yellow);
        g.fillOval(360, -40, 80, 80);

        g.setColor(Color.white);
        g.fillOval(MID-20, TOP, 40, 40);
        g.fillOval(MID-35, TOP+35, 70, 50);
        g.fillOval(MID-50, TOP+80, 100, 60);
        g.setColor(Color.black);
        g.fillOval(MID-10, TOP+10, 5, 5);
        g.fillOval(MID+5, TOP+10, 5, 5);
        g.drawArc(MID-10, TOP+20, 20, 10, 190, 160);
        g.drawLine(MID-25, TOP+60, MID-50, TOP+40);
        g.drawLine(MID+25, TOP+60, MID+55, TOP+60);
        g.drawLine(MID-20, TOP+5, MID+20, TOP+5);
        g.fillRect(MID-15, TOP-20, 30, 25);

        g.setColor(Color.white);
        g.fillOval(MID2-20, TOP, 40, 40);
        g.fillOval(MID2-35, TOP+35, 70, 50);
        g.fillOval(MID2-50, TOP+80, 100, 60);
        g.setColor(Color.black);
        g.fillOval(MID2-10, TOP+10, 5, 5);
        g.fillOval(MID2+5, TOP+10, 5, 5);
        g.drawArc(MID2-10, TOP+20, 20, 10, 190, 160);
        g.drawLine(MID2-25, TOP+60, MID2-50, TOP+40);
        g.drawLine(MID2+25, TOP+60, MID2+55, TOP+60);
        g.drawLine(MID2-20, TOP+5, MID2+20, TOP+5);
        g.fillRect(MID2-15, TOP-20, 30, 25);
    }
}