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

        for (int k = 0; k < speler1.length; k++) {
            speler1[k] = "";
            speler2[k] = "";
            speler3[k] = "";
            speler4[k] = "";
        }

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
    }

    public void paint(Graphics g) {

        for (int i = 0; i < speler1.length; i++) {
            g.drawString(speler1[i], 10, 20 * i + 20);
            g.drawString(speler2[i], 110, 20 * i + 20);
            g.drawString(speler3[i], 210, 20 * i + 20);
            g.drawString(speler4[i], 310, 20 * i + 20);
        }
    }

    class DeelKaartKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            AudioClip deelKaartSound;
            URL padSound = Multimedia2.class.getResource("/resources/");
            deelKaartSound = getAudioClip(padSound, "ui_arcade_multiply1.wav");

            deck = new String[52];
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

            repaint();
            deelKaartSound.play();
        }
    }
}