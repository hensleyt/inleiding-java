package h4;
import java.awt.*;
import java.applet.*;

public class Tekenen7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawRoundRect(50, 50, 200, 200, 50, 50);
        g.drawOval(55, 55, 190, 190);
        g.fillOval(90, 90, 40, 40);
        g.fillOval(90, 90, 40, 40);
        g.fillOval(170, 90, 40, 40);
        g.fillOval(90, 170, 40, 40);
        g.fillOval(170, 170, 40, 40);
    }
}