package h8;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Knoppenenvensters1 extends Applet {
    Button knopOk, knopReset;
    String veranderdText, naOk, naReset, naReset2, naReset3;
    Label knopLabel;
    TextField tekstvak;
    public void init() {
        tekstvak = new TextField("Klik hier om te typen.", 20);
        knopLabel = new Label("Verander 'appel'.");
        veranderdText = "appel";
        naReset = "Info:";
        naReset2 = "Druk op het 'Ok' knopje om 'appel' te veranderen.";
        naReset3 = "Druk op het 'Reset' knopje om (alles) leeg te maken.";
        knopOk = new Button("Ok");
        knopOk.addActionListener( new OkListener() );
        knopReset = new Button("Reset");
        knopReset.addActionListener(new ResetListener());
        add(knopLabel);
        add(tekstvak);
        add(knopOk);
        add(knopReset);
    }

    public void paint(Graphics g) {
        g.drawString(veranderdText, 50, 60);
        g.drawString(naReset, 50, 100);
        g.drawString(naReset2, 50, 120);
        g.drawString(naReset3, 50, 140);
    }

    // Als je op het knopje Ok drukt
    class OkListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            naOk = "Druk op het 'Ok' knopje om het weer te veranderen.";
            naReset2 = naOk;
            veranderdText = tekstvak.getText();
            tekstvak.setText("Het werkt!");
            repaint();
        }
    }

    // Als je op het knopje Reset drukt
    class ResetListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            veranderdText = "";
            naReset = "";
            naReset2 = "";
            naReset3 = "";
            tekstvak.setText("");
            knopLabel.setText("");
            repaint();
        }
    }
}