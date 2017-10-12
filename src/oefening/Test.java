package oefening;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {
    double c1;
    double c2;
    double c3;

    double uitkomst;
    double gemiddelde;
    int afkap;

    @Override
    public void init() {
        super.init();

        c1 = 6;
        c2 = 6;
        c3 = 6;
        gemiddelde = (c1 + c2 + c3) / 3;
        afkap = (int) (gemiddelde * 10);
        uitkomst = (double) afkap / 10;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("" + gemiddelde, 50, 50);
        g.drawString("" + afkap, 50, 70);
        g.drawString("" + uitkomst, 50, 90);

    }
}
