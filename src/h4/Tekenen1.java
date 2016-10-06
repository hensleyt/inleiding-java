package h4;
import java.awt.*;
import java.applet.*;

public class Tekenen1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(50, 120, 120, 120);
        g.drawLine(50, 120, 85, 240);
        g.drawLine(120, 120, 85, 240);
    }
}