package h4;
import java.awt.*;
import java.applet.*;

public class Tekenenpraktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(10, 20, 230, 20);
        g.drawString("Lijn", 110, 35);

        g.drawRect(10, 40, 220, 90);
        g.drawString("Rechthoek", 90, 145);

        g.drawRoundRect(10, 150, 220, 90, 30, 30);
        g.drawString("Afgeronde rechthoek", 65, 255);

        g.setColor(Color.magenta);
        g.fillRect(240, 40, 220, 90);
        g.setColor(Color.black);
        g.drawOval(240, 40, 220, 90);
        g.drawString("Gevulde rechthoek met ovaal", 270, 145);

        g.setColor(Color.magenta);
        g.fillOval(240, 150, 220, 90);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 310, 255);

        g.drawOval(470, 30, 220, 90);
        g.setColor(Color.magenta);
        g.fillArc(470, 30, 220, 90, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 500, 145);

        g.drawOval(540, 150, 90, 90);
        g.drawString("Cirkel", 570, 255);
    }
}