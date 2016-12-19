package h13;
import java.applet.*;
import java.awt.*;
public class Methodes2 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        int a1 = 10,b1 = 200;
        int a2 = 105,b2 = 100;
        int a3 = 210,b3 = 200;
        tekenDriehoek(g,a1,b1,a2,b2,a3,b3);
    }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1,y1,x3,y3);

        x2 = x3 / 2;
        y2 = y3 / 2;
        g.drawLine(x1,y1,x2,y2);

        g.drawLine(x3,y3,x2,y2);
    }
}