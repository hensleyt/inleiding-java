package h11;
import java.applet.*;
import java.awt.*;
public class Herhaling8 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 10, x = 10;
        int beginX = 1, beginY = 1;

        for(teller = 0; teller < 100; teller++) {
            y += 10;
            x += 10;
            g.drawOval( beginX, beginY, x, y );
        }
    }
}
