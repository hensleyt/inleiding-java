package oefening;

import java.applet.Applet;
import java.awt.*;


public class Variabelen extends Applet {
    Color achtergrondKleur;
    Color tekstKleur;
    int getal1;
    int getal2;
    Font  mijnFont;


    @Override
    public void init() {
        super.init();
        setSize(600, 400);
        achtergrondKleur = new Color(0, 102, 204);
        tekstKleur = new Color(153, 51, 0);
        getal1 = 20;
        getal2 = 30;
        setBackground(achtergrondKleur);
        mijnFont = new Font("Verdana", Font.BOLD, 50);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(tekstKleur);
        int x = 50;
        int y = 50;
        g.setFont(mijnFont);
        g.drawString("Som is : " + (getal1 + getal2), x, y );
        y = y + 40;
        g.drawString("Produkt is : " + (getal1 * getal2), x, y );

    }
}
