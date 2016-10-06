package h6;

import java.applet.Applet;
import java.awt.*;

public class Getallen3 extends Applet {
int positiefGetal1, positiefGetal2, uitkomst, negatiefUitkomst;

    @Override
    public void init() {
        super.init();
        positiefGetal1 = 30;
        positiefGetal2 = 50;
        uitkomst = 30 + 50;
        negatiefUitkomst = -uitkomst;

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Negatief uitkomst = " + negatiefUitkomst, 50, 50);
    }
}
