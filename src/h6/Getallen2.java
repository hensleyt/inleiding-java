package h6;

import java.applet.Applet;
import java.awt.*;

public class Getallen2 extends Applet {
    int seconden;
    int uur;
    int dag;
    int jaar;

    @Override
    public void init() {
        super.init();
        seconden = 60;
        uur = seconden*60;
        dag = uur*24;
        jaar = dag*365;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Seconden = " + seconden, 50, 50);
        g.drawString("Seconden in een uur = " + uur, 50, 65);
        g.drawString("Seconden in een dag = " + dag, 50, 80);
        g.drawString("Seconden in een jaar = " + jaar, 50, 95);
    }
}