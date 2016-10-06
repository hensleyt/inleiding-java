package h4;
import java.awt.*;
import java.applet.*;

public class Tekenen4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        // Tabel lijn x en y
        g.drawLine(50, 50, 50, 250);
        g.drawLine(50, 250, 190, 250);

        // Staafdiagram naam
        // Pijltje voor staafdiagram naam (Gewicht in kg.)
        g.drawLine(40, 30, 40, 20);
        g.drawLine(40, 20, 42, 27);
        g.drawLine(40, 20, 38, 27);
        g.drawString("Gewicht in kg.", 50, 30);

        // Aantal gewicht
        g.drawString("100", 20, 50);
        // Grijze x lijn van 100
        g.setColor(Color.gray);
        g.drawLine(50, 50, 190, 50);

        g.setColor(Color.black);
        g.drawString("80", 27, 90);
        // Grijze x lijn van 80
        g.setColor(Color.gray);
        g.drawLine(50, 90, 190, 90);

        g.setColor(Color.black);
        g.drawString("60", 27, 130);
        // Grijze x lijn van 60
        g.setColor(Color.gray);
        g.drawLine(50, 130, 190, 130);

        g.setColor(Color.black);
        g.drawString("40", 27, 170);
        // Grijze x lijn van 40
        g.setColor(Color.gray);
        g.drawLine(50, 170, 190, 170);

        g.setColor(Color.black);
        g.drawString("20", 27, 210);
        // Grijze x lijn van 20
        g.setColor(Color.gray);
        g.drawLine(50, 210, 190, 210);

        g.setColor(Color.black);
        g.drawString("0", 30, 250);
        g.setColor(Color.gray);

        // Namen
        // Staaf
        g.setColor(Color.red);
        g.fillRect(70, 170, 20, 80);
        g.setColor(Color.black);
        g.drawString("Valerie", 50, 270);

        // Staaf
        g.setColor(Color.blue);
        g.fillRect(110, 50, 20, 200);
        g.setColor(Color.black);
        g.drawString("Jeroen", 100, 270);

        // Staaf
        g.setColor(Color.green);
        g.fillRect(150, 90, 20, 160);
        g.setColor(Color.black);
        g.drawString("Hans", 150, 270);
    }
}