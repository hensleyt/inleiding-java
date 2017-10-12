package h13voorbeelden;
import java.awt.*;
import java.applet.*;

public class h13voorbeeld3 extends Applet {

    double gemiddelde;

    public void init() {
        double c = 6;
        double d = 7;
        gemiddelde = berekenGemiddelde(c, d);
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gemiddelde, 50, 60 );
    }

    double berekenGemiddelde(double a, double b) {
        double som;
        double gem;
        som = a + b;
        gem = som / 2;
        return gem;
    }
}