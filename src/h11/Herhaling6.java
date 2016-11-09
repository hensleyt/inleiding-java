package h11;
import java.applet.*;
import java.awt.*;
public class Herhaling6 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 10, x = 10;
        int beginX = 100, beginY = 100;

        for(teller = 0; teller < 5; teller++) {
            y += 10;
            x += 10;
            beginX -= 5;
            beginY -= 5;
            g.drawOval( beginX, beginY, x, y );
        }
    }
}
