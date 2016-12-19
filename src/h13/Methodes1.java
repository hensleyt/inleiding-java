package h13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Methodes1 extends Applet {

    Color knopKleurNaam;
    Button knopRood, knopBlauw, knopGroen, knopPaars, knopOranje;
    String kleurNaamString = "", kleurNaam = "";

    public void init() {

        setSize(500,300);

        knopKleurNaam = new Color(0,0,0);

        knopRood = new Button("Rode Knop");
        knopRood.addActionListener( new KnopRoodListener());
        knopRood.setBackground(Color.RED);
        add(knopRood);

        knopBlauw = new Button("Blauwe Knop");
        knopBlauw.addActionListener( new KnopBlauwListener());
        knopBlauw.setBackground(Color.BLUE);
        add(knopBlauw);

        knopGroen = new Button("Groene Knop");
        knopGroen.addActionListener( new KnopGroenListener());
        knopGroen.setBackground(Color.GREEN);
        add(knopGroen);

        knopPaars = new Button("Paarse Knop");
        knopPaars.addActionListener( new KnopPaarsListener());
        knopPaars.setBackground(Color.MAGENTA);
        add(knopPaars);

        knopOranje = new Button("Oranje Knop");
        knopOranje.addActionListener( new KnopOranjeListener());
        knopOranje.setBackground(Color.ORANGE);
        add(knopOranje);
    }

    public void paint(Graphics g) {

        g.drawString(kleurNaamString, 10, 50);
        g.setColor(knopKleurNaam);
        g.drawString(kleurNaam, 125, 50);
    }

    class KnopRoodListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            kleurNaamString = "Kleur van de knop is ";
            knopKleurNaam = Color.RED;
            kleurNaam = "Rood";
            repaint();
        }
    }

    class KnopBlauwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            kleurNaamString = "Kleur van de knop is ";
            knopKleurNaam = Color.BLUE;
            kleurNaam = "Blauw";
            repaint();
        }
    }

    class KnopGroenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            kleurNaamString = "Kleur van de knop is ";
            knopKleurNaam = Color.GREEN;
            kleurNaam = "Green";
            repaint();
        }
    }

    class KnopPaarsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            kleurNaamString = "Kleur van de knop is ";
            knopKleurNaam = Color.MAGENTA;
            kleurNaam = "Paars";
            repaint();
        }
    }

    class KnopOranjeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            kleurNaamString = "Kleur van de knop is ";
            knopKleurNaam = Color.ORANGE;
            kleurNaam = "Oranje";
            repaint();
        }
    }
}