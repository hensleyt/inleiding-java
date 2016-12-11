package h12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Tabellen6 extends Applet {

    int[] tabelGetallen = {11, 1, 11, 2, 2, 2, 2, 2, 9, 10};
    int invoer = 0, aantal = 0;
    TextField tekstvak;
    Button knop;

    public void init() {

        tekstvak = new TextField("",5);
        add(tekstvak);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("Tabel grootte: 10" ,50,60);
        g.drawString("Alle waarden in de tabel: 1, 2, 9, 10" ,50,80);
        g.drawString("Aantal gelijke waarden van " + invoer + " = " + aantal,50,100);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            invoer = Integer.parseInt(tekstvak.getText());

            aantal = 0;

            for (int i = 0; i < tabelGetallen.length; i++){

                if (tabelGetallen[i] == invoer) {
                    aantal++;
                    if (aantal < 1) {
                        aantal = 0;
                    }
                }
            }
            repaint();
        }
    }
}