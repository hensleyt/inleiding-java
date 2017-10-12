package h10voorbeelden;
import java.awt.*;
import java.applet.*;

public class H10voorbeeld3b extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        g.drawString("" + 6 + " is groter dan " + 5 + ": " +
                (!(6 > 5)), 50, 60 );
        g.drawString("" + 6 + " is groter dan "+ 5 + " en groter dan " +
                8 + ": " + (6 > 5 && 6 > 8), 50, 80 );
        g.drawString("" + 6 + " is kleiner dan " + 5 + ": " +
                (! (6 < 5)), 50, 100 );
        g.drawString("" + 6 + " is kleiner dan "+ 5 + " en kleiner dan " +
                8 + ": " + (6 < 5 && 6 < 8), 50, 120 );
    }
}