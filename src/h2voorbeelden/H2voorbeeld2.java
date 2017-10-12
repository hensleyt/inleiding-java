package h2voorbeelden;
import java.awt.*;
import java.applet.*;

public class H2voorbeeld2 extends Applet {

    public void init() {
        setBackground(Color.magenta);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}