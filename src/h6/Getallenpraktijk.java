package h6;

import java.applet.Applet;
import java.awt.*;

public class Getallenpraktijk extends Applet {
    double c1;
    double c2;
    double c3;

    double uitkomst;
    double gemiddelde;
    int afkap;

    @Override
    public void init() {
        super.init();

        c1 = 5.9;
        c2 = 6.3;
        c3 = 6.9;
        gemiddelde = (c1 + c2 + c3) / 3;
        afkap = (int) (gemiddelde * 10);
        uitkomst = (double) afkap / 10;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("" + uitkomst, 50, 50);

    }
}
