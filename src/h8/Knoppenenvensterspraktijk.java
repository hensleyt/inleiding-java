package h8;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Knoppenenvensterspraktijk extends Applet {
    TextField vak1, vak2;
    Button keerKnop, deelKnop, plusKnop, minKnop;
    Double getal1, getal2, uitkomst;

    public void init() {
        vak1 = new TextField("", 15);
        add(vak1);

        vak2 = new TextField("", 15);
        add(vak2);

        keerKnop = new Button("*");
        add(keerKnop);
        KeerKnopListener kkl = new KeerKnopListener();
        keerKnop.addActionListener(kkl);

        deelKnop = new Button("/");
        add(deelKnop);
        DeelKnopListener dkl = new DeelKnopListener();
        deelKnop.addActionListener(dkl);

        plusKnop = new Button("+");
        add(plusKnop);
        PlusKnopListener pkl = new PlusKnopListener();
        plusKnop.addActionListener(pkl);

        minKnop = new Button("-");
        add(minKnop);
        MinKnopListener mkl = new MinKnopListener();
        minKnop.addActionListener(mkl);


    }



    class KeerKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 * getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }

    class DeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 / getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }

    class PlusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 + getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }

    class MinKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 - getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }
}
