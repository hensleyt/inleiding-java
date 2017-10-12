package h6voorbeelden;
import java.awt.*;
import java.applet.*;
public class H6voorbeeld4 extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 8;
        b = 8;
        c = 3;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}