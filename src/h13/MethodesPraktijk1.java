package h13;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MethodesPraktijk1 extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {

        int a = 230;
        int b = 10;
        int w = 35;
        int h = 50;
//        g.setColor(Color.ORANGE);
//        g.fillRect(20, 49, 10, 50);
//        g.setColor(Color.GREEN);
//        g.fillOval(0,0,50,50);


        tekenBoom(g,a,b,w,h);
    }

    void tekenBoom (Graphics g, int x, int y, int width, int height){

        int boomstamBeginX;
        int boomstamBeginY;
        int boomstamDikte = 10;

        int testBoomstamX = width;

        boomstamBeginX = x + width;
        testBoomstamX = testBoomstamX / 2;
        boomstamBeginX = boomstamBeginX - testBoomstamX;
        boomstamBeginX = boomstamBeginX - 5;

        int testBoomstamY = height;

        boomstamBeginY = y + height;
        testBoomstamY = testBoomstamY / 2;
        boomstamBeginY = boomstamBeginY - testBoomstamY;
        boomstamBeginY = boomstamBeginY - 1;

        g.setColor(Color.ORANGE);
        g.fillRect(boomstamBeginX, boomstamBeginY, boomstamDikte, height);
        g.setColor(Color.GREEN);
        g.fillOval(x,y,width,height);

    }
}
