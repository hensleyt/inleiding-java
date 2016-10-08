package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Beslissingen3 extends Applet {
    TextField tekstvak;
    Label instructieLabel;
    String Maand, Dagen;
    int maandNr;

    public void init() {
        Maand = "";
        instructieLabel = new Label("Typ het maandnummer in en druk op enter");
        add(instructieLabel);
        tekstvak = new TextField("", 2);
        tekstvak.addActionListener( new CijferListener() );
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(Maand, 50, 80 );
        g.drawString(Dagen, 50, 100 );
    }

    class CijferListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            maandNr = Integer.parseInt(tekstvak.getText());
            switch(maandNr) {
                case 1:
                    Maand = "Maand: Januari";
                    Dagen = "Heeft aantal dagen: 31";
                    break;
                case 2:
                    Maand = "Maand: Februari";
                    Dagen = "Heeft aantal dagen: 28";
                    break;
                case 3:
                    Maand = "Maand: Maart";
                    Dagen = "Heeft aantal dagen: 31";
                    break;
                case 4:
                    Maand = "Maand: April";
                    Dagen = "Heeft aantal dagen: 30";
                    break;
                case 5:
                    Maand = "Maand: Mei";
                    Dagen = "Heeft aantal dagen: 31";
                    break;
                case 6:
                    Maand = "Maand: Juni";
                    Dagen = "Heeft aantal dagen: 30";
                    break;
                case 7:
                    Maand = "Maand: Juli";
                    Dagen = "Heeft aantal dagen: 31";
                    break;
                case 8:
                    Maand = "Maand: Augustus";
                    Dagen = "Heeft aantal dagen: 31";
                    break;
                case 9:
                    Maand = "Maand: September";
                    Dagen = "Heeft aantal dagen: 30";
                    break;
                case 10:
                    Maand = "Maand: Oktober";
                    Dagen = "Heeft aantal dagen: 31";
                    break;
                case 11:
                    Maand = "Maand: November";
                    Dagen = "Heeft aantal dagen: 30";
                    break;
                case 12:
                    Maand = "Maand: December";
                    Dagen = "Heeft aantal dagen: 31";
                    break;
                default:
                    Maand = "Dit maand bestaat niet ..!";
                    Dagen = "";
                    break;
            }
            repaint();
        }
    }
}