package h10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Beslissingen5 extends Applet {
    TextField nlTekstvak, enTekstvak, wiTekstvak;
    Label nlLabel, enLabel, wiLabel;
    Button ok;
    String cijfer, beoordeling, resultaat;
    double gemiddelde, gemiddeldeNL, gemiddeldeEN, gemiddeldeWI;

    public void init() {
        cijfer = "";
        beoordeling = "";
        resultaat = "";

        nlLabel = new Label("Nederlands");
        add(nlLabel);
        nlTekstvak = new TextField("", 3);
        add(nlTekstvak);

        enLabel = new Label("Engels");
        add(enLabel);
        enTekstvak = new TextField("", 3);
        add(enTekstvak);

        wiLabel = new Label("Wiskunde");
        add(wiLabel);
        wiTekstvak = new TextField("", 3);
        add(wiTekstvak);

        ok = new Button("Ok");
        ok.addActionListener(new DiplomaListener());
        add(ok);
    }

    public void paint(Graphics g) {
        g.drawString(cijfer + gemiddelde, 50, 80);
        g.drawString(beoordeling, 50, 100);
        g.drawString(resultaat, 50, 120);
    }

    class DiplomaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gemiddeldeNL = Double.parseDouble(nlTekstvak.getText());
            gemiddeldeEN = Double.parseDouble(enTekstvak.getText());
            gemiddeldeWI = Double.parseDouble(wiTekstvak.getText());
            gemiddelde = (gemiddeldeNL + gemiddeldeEN + gemiddeldeWI) / 3;
            if (gemiddelde >= 5.5 && gemiddelde <= 10) {
                cijfer = "Gemiddeld cijfer: ";
                beoordeling = "Gemiddelde is voldoende";
                resultaat = "Leerling is geslaagd.";
            }
            if (gemiddelde <= 5.499 && gemiddelde >= 0) {
                cijfer = "Gemiddeld cijfer: ";
                beoordeling = "Gemiddelde is onvoldoende";
                resultaat = "Leerling is gezakt.";
            }
            repaint();
        }
    }
}