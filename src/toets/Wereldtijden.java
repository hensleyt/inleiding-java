package toets;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Created by hensl on 12-10-2016.
 */
public class Wereldtijden extends Applet {
    Label infoLabel;
    TextField tekstvakUur;
    Button knop;
    String london, tokyo, newyork, sydney;
    int uur, uur1, uur2, uur3, uur4, berekening1, berekening2, berekening3, berekening4;
    boolean trueFalse, falseTrue;
    public void init() {
        trueFalse = true;
        falseTrue = false;
        london = "";
        tokyo = "";
        newyork = "";
        sydney = "";
        berekening1 = 1;
        berekening2 = 7;
        berekening3 = 6;
        berekening4 = 9;

        infoLabel = new Label("Voor een uur in");
        tekstvakUur = new TextField("", 5);
        tekstvakUur.addActionListener( new KnopListener() );
        knop = new Button("Toon Tijden");
        knop.addActionListener( new KnopListener() );

        add(infoLabel);
        add(tekstvakUur);
        add(knop);
    }

    public void paint(Graphics g) {
        int x, y;
        x = 50;
        y = 60;

        g.drawString(london,x,y);

        y = y + 20;
        g.drawString(tokyo,x,y);

        y = y + 20;
        g.drawString(newyork,x,y);

        y = y + 20;
        g.drawString(sydney,x,y);

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            uur = Integer.parseInt(tekstvakUur.getText());
            if (uur >= 0 && uur < 24)
            {
                uur1 = uur - berekening1;
                uur2 = uur1 + berekening2;
                uur3 = uur - berekening3;
                uur4 = uur + berekening4;
            }
            if (uur < 0)
            if (trueFalse = true) {
                london = "Tijd in London: " + uur1 + ":00 uur";
                tokyo = "Tijd in Tokyo: " + uur2 + ":00 uur";
                newyork = "Tijd in New York: " + uur3 + ":00 uur";
                sydney = "Tijd in Sydney: " + uur4 + ":00 uur";
            }
            else {
                london = "Ongeldige invoer";
                tokyo = "";
                newyork = "";
                sydney = "";
            }
            repaint();
        }
    }
}
