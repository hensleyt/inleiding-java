 package h5;
 import java.awt.*;
 import java.applet.*;

public class Variabelen1tekenenpraktijk extends Applet {
    Color lichtBlauw;
    int tussenBreedte;
    int tussenHoogte;

    @Override
    public void init() {
        super.init();
        lichtBlauw = new Color(51, 153, 255);
        tussenBreedte = 220;
        tussenHoogte = 80;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Lijn
        g.drawLine(10, 20, tussenBreedte, 20);
        g.drawString("Lijn", 110, 35);

        // Rechthoek
        g.drawRect(10, 40, tussenBreedte, tussenHoogte);
        g.drawString("Rechthoek", 90, 145);

        //Afgeronde rechthoek
        g.drawRoundRect(10, 150, tussenBreedte, tussenHoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 65, 255);

        //Gevulde rechthoek met ovaal
        g.setColor(lichtBlauw);
        g.fillRect(240, 40, tussenBreedte, tussenHoogte);
        g.setColor(Color.black);
        g.drawOval(240, 40, tussenBreedte, tussenHoogte);
        g.drawString("Gevulde rechthoek met ovaal", 270, 145);

        // Gevulde Ovaal
        g.setColor(lichtBlauw);
        g.fillOval(240, 150, tussenBreedte, tussenHoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 310, 255);

        // Taartpunt met ovaal eromheen
        g.drawOval(470, 30, tussenBreedte, tussenHoogte);
        g.setColor(lichtBlauw);
        g.fillArc(470, 30, tussenBreedte, tussenHoogte, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 500, 145);

        // Cirkel
        g.drawOval(540, 150, 90, 90);
        g.drawString("Cirkel", 570, 255);
    }
}