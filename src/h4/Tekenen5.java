package h4;
import java.awt.*;
import java.applet.*;

public class Tekenen5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 100, 200);
    }
}