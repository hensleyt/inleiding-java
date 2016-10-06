package h8;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Knoppenenvensters3 extends Applet {
    TextField invoerenBedrag;
    Label bedragInclbtw;
    Button ok;
    Double uitgerekendBedrag, btw, ingevoerdBedrag;
    String rekenMethode, antwoord, kommaStreepje;
    public void init() {
        bedragInclbtw = new Label("Bedrag Incl. 21% BTW");
        add(bedragInclbtw);

        invoerenBedrag = new TextField("Voer hier het bedrag in.", 20);
        add(invoerenBedrag);

        ok = new Button("Ok");
        add(ok);
        ok.addActionListener(new plusBtwListener());

        // Strings
        rekenMethode = "Ingevoerd bedrag + 21% BTW = (antwoord in euros)";
        kommaStreepje = "";
        antwoord = "";
    }


    public void paint(Graphics g) {
        g.drawString(rekenMethode + antwoord + kommaStreepje, 50, 60);
    }

    class plusBtwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            btw = 1.21;
            rekenMethode = "Ingevoerd bedrag + 21% BTW = \u20ac ";
            kommaStreepje = ",-";

            String uitrekenen = invoerenBedrag.getText();
            ingevoerdBedrag = Double.parseDouble( uitrekenen );
            uitgerekendBedrag = ingevoerdBedrag * btw;
            antwoord = uitgerekendBedrag.toString();
            repaint();
        }
    }
}
