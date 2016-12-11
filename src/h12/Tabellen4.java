package h12;
import java.applet.*;
import java.awt.*;
public class Tabellen4 extends Applet {
    boolean gevonden;
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double gezocht;
    int teller = 0;

    public void init() {
        gezocht = 400;
        gevonden = false;

        while(teller < salaris.length) {
            if(salaris[teller] == gezocht) {
                gevonden = true;
                if(gevonden == true) {
                    teller = salaris.length;
                }
            }
            teller ++;
        }
    }

    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }
}