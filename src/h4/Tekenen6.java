package h4;
import java.awt.*;
import java.applet.*;

public class Tekenen6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.gray);
        g.fillRect(70, 40, 10, 200);
        g.setColor(Color.black);
        g.fillRect(55, 50, 40, 100);
        g.setColor(Color.red);
        g.fillOval(65, 60, 20, 20);
        g.setColor(Color.orange);
        g.fillOval(65, 90, 20, 20);
        g.setColor(Color.green);
        g.fillOval(65, 120, 20, 20);
    }
}