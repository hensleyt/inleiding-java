package h10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Beslissingenpraktijk extends Applet {
    TextField tekstvak;
    Label instructieLabel;
    String beoordeling;
    int cijfer;

    public void init() {
        beoordeling = "";
        instructieLabel = new Label("Type het cijfer in en druk op enter");
        add(instructieLabel);
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener( new CijferListener() );
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(beoordeling, 50, 60 );
    }

    class CijferListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer = Integer.parseInt(tekstvak.getText());
            switch(cijfer) {
                case 1:
                    beoordeling = "slecht";
                    break;
                case 2:
                    beoordeling = "slecht";
                    break;
                case 3:
                    beoordeling = "slecht";
                    break;
                case 4:
                    beoordeling = "onvoldoende";
                    break;
                case 5:
                    beoordeling = "matig";
                    break;
                case 6:
                    beoordeling = "voldoende";
                    break;
                case 7:
                    beoordeling = "voldoende";
                    break;
                case 8:
                    beoordeling = "goed";
                    break;
                case 9:
                    beoordeling = "goed";
                    break;
                case 10:
                    beoordeling = "goed";
                    break;
                default:
                    beoordeling = "Dit cijfer bestaat niet ..!";
                    break;
            }
            repaint();
        }
    }
}