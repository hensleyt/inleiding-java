package h4;
import java.awt.*;
import java.applet.*;

public class Tekenen2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(100, 100, 175, 50);
        g.drawLine(250, 100, 175, 50);
        g.drawRect(100, 100, 150, 100);
        g.drawRect(200, 150, 30, 50);
        g.drawRect(208, 158, 14, 24);
        g.drawRect(210, 160, 10, 20);
        g.drawRect(208, 185, 14, 5);
        g.drawOval(224, 176, 4, 4);
        g.drawRect(120, 150, 65, 35);
        g.drawRect(123, 153, 28, 13);
        g.drawRect(154, 153, 28, 13);
        g.drawRect(123, 169, 28, 13);
        g.drawRect(154, 169, 28, 13);
    }
}