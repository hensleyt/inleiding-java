package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Beslissingen4 extends Applet {
    TextField tekstvakMaand, tekstvakJaar;
    Label instructieLabel;
    String Maand, Dagen, Jaar;
    int maandNr, jaartal;

    public void init() {
        instructieLabel = new Label("Type het jaartal en het maandnummer in en druk op enter");

        tekstvakJaar = new TextField("",6);
        tekstvakMaand = new TextField("",2);

        CijferListener cl = new CijferListener();
        tekstvakJaar.addActionListener( cl );
        tekstvakMaand.addActionListener( cl );

        add(instructieLabel);
        add(tekstvakJaar);
        add(tekstvakMaand);
    }

    public void paint(Graphics g) {
        g.drawString(Jaar, 50, 80 );
        g.drawString(Maand, 50, 100 );
        g.drawString(Dagen, 50, 120 );
    }

    class CijferListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jaartal = Integer.parseInt(tekstvakJaar.getText());
            maandNr = Integer.parseInt(tekstvakMaand.getText());
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                Jaar = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                Jaar = ""+ jaartal + " is geen schrikkeljaar";
            }
            switch(maandNr) {
                case 1:
                    Maand = "Maand: Januari";
                    Dagen = "Heeft aantal dagen: 31";
                    break;
                case 2:
                    Maand = "Maand: Februari";
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        Dagen = "Heeft aantal dagen: "+ " 29";
                    }
                    else {
                        Dagen = "Heeft aantal dagen: "+ " 28";
                    }
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
                    break;
            }
            repaint();
        }
    }
}