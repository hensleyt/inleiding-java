package h12voorbeelden;
import java.awt.*;
import java.applet.*;
public class H12voorbeeld2 extends Applet  {
    double[] salaris;
    double[] kopie;

    public void init() {
        salaris = new double[5];
        kopie = new double[5];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
        kopie = salaris;
        kopie[3] = 1000;  //salaris[3] wordt nu ook gewijzigd!
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + kopie[teller], 50, 20 * teller + 20);
            g.drawString("" + salaris[teller], 100, 20 * teller + 20);
        }
    }
}