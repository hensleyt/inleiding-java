package h2;
//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Applet2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.blue);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Hensley", 50, 60 );
    }

}