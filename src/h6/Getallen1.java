package h6;

import java.applet.*;
import java.awt.*;

public class Getallen1 extends Applet {
    double verdiend;
    double mensen;
    double uitkomst;

    public void init() {
        verdiend = 113;
        mensen = 4;
        uitkomst = (verdiend / mensen);
    }

    public void paint(Graphics g) {
        g.drawString("Verdiend = €" + verdiend , 20, 20);
        g.drawString("Jan: €" + uitkomst, 20, 40);
        g.drawString("Ali: €" + uitkomst, 20, 60);
        g.drawString("Jeannette: €" + uitkomst, 20, 80);
        g.drawString("Ik: €" + uitkomst, 20, 100);
    }
}