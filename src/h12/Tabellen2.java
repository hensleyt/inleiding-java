package h12;

import java.applet.*;
import java.awt.*;

public class Tabellen2 extends Applet {

    Button[] knop;
    int knopNummer = 1;

    public void init() {

        knop = new Button[25];

        for (int teller = 0; teller < knop.length; teller++) {

            knop[teller] = new Button("Knop " + knopNummer);
            add(knop[teller]);

            knopNummer++;
        }
    }
}