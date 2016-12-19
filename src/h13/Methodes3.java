package h13;
import java.applet.*;
import java.awt.*;
public class Methodes3 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {

        int a = 100, b = 100;
        int w = 200, h = 100;
        tekenMuur(g,a,b,w,h);
    }

    void tekenMuur(Graphics g, int x, int y, int width, int height) {

        int lengteMuur, hoogteMuur;
        int baksteenWidth = 20, baksteenHeight = 10;

        lengteMuur = width / baksteenWidth;
        hoogteMuur = height / baksteenHeight;

        int newX = x;
        int newY = y;

        for (int i = 0; i < hoogteMuur; i++) {
            for (int r = 0; r < lengteMuur; r++) {

                g.setColor(Color.GRAY);
                g.drawRect(newX,newY,baksteenWidth,baksteenHeight);

                g.setColor(Color.RED);
                g.fillRect(newX,newY,baksteenWidth,baksteenHeight);

                newX = newX  + 1 + baksteenWidth;
            }

            newX = x;
            newY= newY + 1 + baksteenHeight;
        }
    }
}