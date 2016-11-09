package h11;
import java.applet.*;
import java.awt.*;
public class Herhaling4 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int y = 50;
        int drie = 3;
        int antwoord;

        for(teller = 0; teller <= 10; teller++) {
            y += 20;
            antwoord = teller * drie;
            g.drawString("" + teller + " x " + drie + " = " + antwoord, 50, y );
        }
    }
}