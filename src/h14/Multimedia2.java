package h14;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

public class Multimedia2 extends Applet {
    Button deelKaartenKnop = new Button("Deel kaarten");
    String[] deck = new String[52],
            kleurenStringArray = {"Schoppen ", "Harten ", "Klaveren ", "Ruiten "},
            kaartenStringArray = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"},
            speler1 = new String[13],
            speler2 = new String[13],
            speler3 = new String[13],
            speler4 = new String[13];

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

    public void init() {
        deelKaartenKnop.addActionListener(new DeelKaartKnopListener());
        add(deelKaartenKnop);
        int teller = 0;
        for (int i = 0; i < kleurenStringArray.length; i++) {

            for (int j = 0; j < kaartenStringArray.length; j++) {
                if (teller < deck.length) {
                    deck[teller] = kleurenStringArray[i] + kaartenStringArray[j];
                    teller++;
                }
            }
        }
        for (int k = 0; k < speler1.length; k++) {
            speler1[k] = deelKaart();
            speler2[k] = deelKaart();
            speler3[k] = deelKaart();
            speler4[k] = deelKaart();
        }
    }

    public void paint(Graphics g) {

    }



    class DeelKaartKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {



            for (int i = 0; i < speler1.length; i++) {

                getGraphics().drawString(speler1[i], 10, 20 * i + 20);
                getGraphics().drawString(speler2[i], 110, 20 * i + 20);
                getGraphics().drawString(speler3[i], 210, 20 * i + 20);
                getGraphics().drawString(speler4[i], 310, 20 * i + 20);
            }

        }
    }
}