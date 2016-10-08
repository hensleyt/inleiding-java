package h10;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Beslissingen1 extends Applet {
    TextField invoer1, invoer2;
    Button knopBerekenen;
    Label groterDan;
    int getal1, getal2;
    public void init() {
        invoer1 = new TextField("", 5);
        invoer2 = new TextField("", 5);
        groterDan = new Label("is groter dan");
        add(invoer1);
        add(groterDan);
        add(invoer2);
        knopBerekenen = new Button("Controleer");
        knopBerekenen.addActionListener( new KnopListener());
        add(knopBerekenen);
    }


    public void paint(Graphics g) {
        g.drawString("" + getal1 + " is groter dan " + getal2 + ": " + (getal1 > getal2), 50, 60 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(invoer1.getText());
            getal2 = Integer.parseInt(invoer2.getText());
            repaint();
        }
    }
}