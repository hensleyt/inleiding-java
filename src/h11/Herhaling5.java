package h11;
import java.applet.*;
import java.awt.*;
public class Herhaling5 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 0, x = 0;

        for(teller = 0; teller < 5; teller++) {
            y += 20;
            x += 20;
            g.drawRect(x , y, 20, 20 );
        }
    }
}
