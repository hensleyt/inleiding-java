package h8;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Knoppenenvensters2 extends Applet {
    Button manKnop, vrouwKnop, pManKnop, pVrouwKnop;
    Label manLabel, vrouwLabel, pManLabel, pVrouwLabel;
    TextField manField, vrouwField, pManField, pVrouwField;
    String manString, vrouwString, pManString, pVrouwString;
    String manStringVak, vrouwStringVak, pManStringVak, pVrouwStringVak;
    int manPlus, vrouwPlus, pManPlus, pVrouwPlus;
    public void init() {
        setSize(1000, 400);

        manField = new TextField("", 3);
        manKnop = new Button("Man +1");
        ManKnopListener mkl = new ManKnopListener();
        manKnop.addActionListener(mkl);
        manLabel = new Label("Mannen");
        add(manField);
        add(manKnop);
        add(manLabel);
        manString = "Totaal aantal mannen: ";

        vrouwField = new TextField("", 3);
        vrouwKnop = new Button("Vrouw +1");
        VrouwKnopListener vkl = new VrouwKnopListener();
        vrouwKnop.addActionListener(vkl);
        vrouwLabel = new Label("Vrouwen");
        add(vrouwField);
        add(vrouwKnop);
        add(vrouwLabel);
        vrouwString = "Totaal aantal vrouwen: ";

        pManField = new TextField("", 3);
        pManKnop = new Button("Potentiële Man +1");
        pManKnopListener pmkl = new pManKnopListener();
        pManKnop.addActionListener(pmkl);
        pManLabel = new Label("Potentiële Mannen");
        add(pManField);
        add(pManKnop);
        add(pManLabel);
        pManString = "Totaal aantal potentiële mannen: ";

        pVrouwField = new TextField("", 3);
        pVrouwKnop = new Button("Potentiële Vrouw +1");
        pVrouwKnopListener pvkl = new pVrouwKnopListener();
        pVrouwKnop.addActionListener(pvkl);
        pVrouwLabel = new Label("Potentiële Vrouw");
        add(pVrouwField);
        add(pVrouwKnop);
        add(pVrouwLabel);
        pVrouwString = "Totaal aantal potentiële vrouwen: ";

    }

    public void paint(Graphics g) {
        g.drawString(manString + manPlus,30,60);
        g.drawString(vrouwString + vrouwPlus,30,80);
        g.drawString(pManString + pManPlus,30,100);
        g.drawString(pVrouwString + pVrouwPlus,30,120);
    }

    class ManKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            manPlus = manPlus + 1;
            manField.setText("" + manPlus);
            repaint();
        }
    }
    class VrouwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwPlus = vrouwPlus + 1;
            vrouwField.setText("" + vrouwPlus);
            repaint();
        }
    }
    class pManKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pManPlus = pManPlus + 1;
            pManField.setText("" + pManPlus);
            repaint();
        }
    }
    class pVrouwKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pVrouwPlus = pVrouwPlus + 1;
            pVrouwField.setText("" + pVrouwPlus);
            repaint();
        }
    }
}
