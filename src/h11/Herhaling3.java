package h11;
import java.applet.*;
import java.awt.*;
public class Herhaling3 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {

        int som1 = 0;
        int som2 = 1;
        int teller = 0;
        int y = 10;
        int x = 10;

        do {
            y += 15;
            g.drawString("" + som1, x, y );
            y += 15;
            g.drawString("" + som2, x, y );
            som1 = som1 + som2;
            som2 = som1 + som2;
            teller++;
        } while (teller < 10);
    }
}