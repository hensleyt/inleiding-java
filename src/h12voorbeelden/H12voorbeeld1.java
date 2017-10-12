package h12voorbeelden;
import java.awt.*;
import java.applet.*;
public class H12voorbeeld1 extends Applet {
    double salaris[];

    public void init() {
        salaris = new double [5];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
        }
    }
}