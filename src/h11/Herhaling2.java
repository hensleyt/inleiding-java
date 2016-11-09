package h11;
import java.applet.*;
import java.awt.*;
public class Herhaling2 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int x = 50;

        for(teller = 20; teller >= 10; teller--) {
            x += 20;
            g.drawString("" + teller, x, 45 );
        }
    }
}
