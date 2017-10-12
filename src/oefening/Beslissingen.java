package  oefening;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Beslissingen extends Applet {
    Button knop;
    TextField tekstvak;
    Label label;
    String tekst;
    int getalstring;
    int hoogstegetal;
    int laagstegetal;
    boolean geklikt;


    @Override
    public void init() {

        knop = new Button("ok");
        tekstvak = new TextField("", 10);
        label = new Label("typ uw cijfer en druk op +");
        Knoplistener kl = new Knoplistener();
        knop.addActionListener(kl);
        tekst = "";
        add(tekstvak);
        add(knop);
        hoogstegetal = Integer.MIN_VALUE;
        laagstegetal = Integer.MAX_VALUE;




    }
    @Override
    public void paint(Graphics g) {
        setSize(700, 200);
        super.paint(g);
        int x = 50;
        int y = 70;

        g.drawString("hoogste getal" + hoogstegetal, x, y);

        g.drawString("laagste getal" + laagstegetal, x, 90);

    }

    class Knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String getalstring = tekstvak.getText();
            int getal = Integer.parseInt(getalstring);
            if (getal > hoogstegetal){
                hoogstegetal = getal;
            }
            if (getal < laagstegetal){
                laagstegetal = getal;
            }
            repaint();
        }
    }
}