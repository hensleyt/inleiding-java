package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Beslissingen4 extends Applet {
    TextField tekstvakMaand, tekstvakJaar;
    Label instructieLabel, jaarLabel, maandLabel;
    String Maand, Dagen, Jaar;
    int maandNr, jaartal;

    public void init() {
        Maand = "";
        Dagen = "";
        Jaar = "";
        instructieLabel = new Label("Typ het jaartal en het maandnummer in en druk daarna op enter");

        jaarLabel = new Label("Jaar");
        tekstvakJaar = new TextField("",6);
        maandLabel = new Label("Maand");
        tekstvakMaand = new TextField("",2);

        CijferListener cl = new CijferListener();
        tekstvakJaar.addActionListener( cl );
        tekstvakMaand.addActionListener( cl );

        add(instructieLabel);
        add(jaarLabel);
        add(tekstvakJaar);
        add(maandLabel);
        add(tekstvakMaand);
    }

    public void paint(Graphics g) {
        g.drawString(Jaar, 50, 80 );
        g.drawString(Maand + Dagen, 50, 100 );
    }

    class CijferListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            jaartal = Integer.parseInt(tekstvakJaar.getText());
            maandNr = Integer.parseInt(tekstvakMaand.getText());
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                Jaar = "Het jaar "+ jaartal + " is een schrikkeljaar";
            }
            else {
                Jaar = "Het jaar "+ jaartal + " is geen schrikkeljaar";
            }
            switch(maandNr) {
                case 1:
                    Maand = "De maand januari ";
                    Dagen = "heeft 31 dagen.";
                    break;
                case 2:
                    Maand = "De maand februari ";
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0 ) {
                        Dagen = "heeft 29 dagen.";
                    }
                    else {
                        Dagen = "heeft 28 dagen.";
                    }
                    break;
                case 3:
                    Maand = "De maand maart ";
                    Dagen = "heeft 31 dagen.";
                    break;
                case 4:
                    Maand = "De maand april ";
                    Dagen = "heeft 30 dagen";
                    break;
                case 5:
                    Maand = "De maand mei ";
                    Dagen = "heeft 31 dagen.";
                    break;
                case 6:
                    Maand = "De maand juni";
                    Dagen = "heeft 30 dagen.";
                    break;
                case 7:
                    Maand = "De maand juli ";
                    Dagen = "heeft 31 dagen.";
                    break;
                case 8:
                    Maand = "De maand augustus ";
                    Dagen = "heeft 31 dagen.";
                    break;
                case 9:
                    Maand = "De maand september ";
                    Dagen = "heeft 30 dagen.";
                    break;
                case 10:
                    Maand = "De maand oktober ";
                    Dagen = "heeft 31 dagen.";
                    break;
                case 11:
                    Maand = "De maand november ";
                    Dagen = "heeft 30 dagen.";
                    break;
                case 12:
                    Maand = "De maand december ";
                    Dagen = "heeft 31 dagen.";
                    break;
                default:
                    Maand = "De maand die je hebt ingevoerd bestaat niet ..!";
                    Dagen = "";
                    break;
            }
            repaint();
        }
    }
}