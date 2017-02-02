package h14;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

public class Multimedia2 extends Applet {

    Button deelKaartenKnop = new Button("Deel kaarten");
    String speler1String = "";
    String[] kleurenStringArray = {"Schoppen ", "Harten ", "Klaveren ", "Ruiten "},
            kaartenStringArray = {"aas", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer"},
            speler1 = new String[12],
            speler2 = new String[12],
            speler3 = new String[12],
            speler4 = new String[12];
    public void init() {
        deelKaartenKnop.addActionListener(new DeelKaartenKnopListener());
        add(deelKaartenKnop);
    }

    public void paint(Graphics g) {

        for (int teller = 0; teller < kleurenStringArray.length; teller++) {
            g.drawString(speler1String, 60, 40 * teller  + 20);
        }

    }


    class DeelKaartenKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int randomKaartKleur, randomKaartNummer;

            randomKaartKleur = new Random().nextInt(kleurenStringArray.length);
            randomKaartNummer = new Random().nextInt(kaartenStringArray.length);


            // Tekst op het scherm laten verschijnen
            speler1String = kleurenStringArray[randomKaartKleur] + kaartenStringArray[randomKaartNummer];
            repaint();

        }
    }
}
//    private String deelKaart() {
//        int random = new Random().nextInt(deck.length);
//        String kaart = deck[random];
//
//        //vervang de inhoud van deck
//        String[] hulpLijst = new String[deck.length - 1];
//        int hulpindex = 0;
//        for (int i = 0; i < deck.length; i++) {
//            if (i != random) {
//                hulpLijst[hulpindex] = deck[i];
//                hulpindex++;
//            }
//        }
//        deck = hulpLijst;
//        return kaart;
//    }