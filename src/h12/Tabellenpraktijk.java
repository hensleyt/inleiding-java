package h12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Tabellenpraktijk extends Applet {

    Button okKnop;
    Label[] naamLabel, telLabel;
    TextField[] naamTekstvak, telTekstvak;
    int teller = 0, nummer = 1, sizeHeight = 150;

    public void init() {

        naamLabel = new Label[10];
        naamTekstvak = new TextField[10];
        telLabel = new Label[10];
        telTekstvak = new TextField[10];

        okKnop = new Button("Ok");
        okKnop.addActionListener(new KnopListener());
        add(okKnop);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (teller < naamTekstvak.length) {
                naamLabel[teller] = new Label("Naam " + nummer + " : ");
                add(naamLabel[teller]);
                naamTekstvak[teller] = new TextField("",10);
                add(naamTekstvak[teller]);
                telLabel[teller] = new Label("Telefoonnummer " + nummer + " : ");
                add(telLabel[teller]);
                telTekstvak[teller] = new TextField("",10);
                add(telTekstvak[teller]);
                teller++;
                nummer++;
                // Laat de labels en tekstvakken verschijnen
                setSize(200,sizeHeight);
                sizeHeight = sizeHeight + 80;
            }
        }
    }
}