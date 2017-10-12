package h8voorbeelden;
//Voorbeeld 8.1

import java.awt.*;
import java.applet.*;


public class Voorbeeld1 extends Applet {
    Button knop;

    public void init() {
        knop = new Button();
        knop.setLabel( "Klik op mij" );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Doet deze knop wel iets?", 50, 60 );
    }
}