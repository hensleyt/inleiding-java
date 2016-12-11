package h12;

import java.applet.*;
import java.awt.*;

public class Tabellen1 extends Applet {

    int[] tabelGetallen = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int[] arrayTest = {0};
    int optellen, gemiddelde;

    public void init() {

        for (int teller = 0; teller < tabelGetallen.length; teller ++) {

            arrayTest[0] = arrayTest[0] + tabelGetallen[teller];
            optellen = arrayTest[0];
        }
        gemiddelde = optellen / tabelGetallen.length;
    }

    public void paint(Graphics g) {

        for (int teller = 0; teller < tabelGetallen.length; teller ++) {
            int yCounter = 20 * teller + 20;
            g.drawString("" + tabelGetallen[teller], 50, yCounter);
        }
        g.drawString("Gemiddelde: " + gemiddelde, 50, 220);
    }
}