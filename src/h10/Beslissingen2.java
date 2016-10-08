package h10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Beslissingen2 extends Applet {
    TextField invoer1, invoer2;
    Button knopBerekenen;
    Label vergelijkLabel;
    int getal1, getal2;
    public void init() {
        invoer1 = new TextField("", 5);
        invoer2 = new TextField("", 5);
        vergelijkLabel = new Label("is groter/kleiner dan");
        add(invoer1);
        add(vergelijkLabel);
        add(invoer2);
        knopBerekenen = new Button("Controleer");
        knopBerekenen.addActionListener( new KnopListener());
        add(knopBerekenen);
    }


    public void paint(Graphics g) {
        g.drawString("" + getal1 + " is groter dan " + getal2 + ": " + (getal1 > getal2), 50, 60 );
        g.drawString("" + getal1 + " is kleiner dan " + getal2 + ": " + (getal1 < getal2), 50, 80 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(invoer1.getText());
            getal2 = Integer.parseInt(invoer2.getText());
            repaint();
        }
    }
}