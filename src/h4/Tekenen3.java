package h4;
import java.awt.*;
import java.applet.*;

public class Tekenen3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(20, 130, 10, 150);
        g.fillOval(16, 116, 18, 18);
        g.setColor(Color.red);
//        g.fillArc(-20, 131, 100, 50, 0, 90);
//        g.fillArc(-20, 131, 100, 50, 0, 90);
        g.fillRect(30, 133, 100, 20);
        g.setColor(Color.white);
        g.fillRect(30, 153, 100, 20);
        g.setColor(Color.blue);
        g.fillRect(30, 173, 100, 20);
    }
}