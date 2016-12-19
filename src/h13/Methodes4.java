package h13;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Methodes4 extends Applet {

    Button baksteenKnop, betonKnop;
    public void init() {
        baksteenKnop = new Button("Bakstenen Muur");
        baksteenKnop.addActionListener(new BaksteenListener());
        add(baksteenKnop);

        betonKnop = new Button("Betonnen Muur");
        betonKnop.addActionListener(new BetonListener());
        add(betonKnop);
    }

    public void paint(Graphics g) {


    }

    void tekenBakstenenMuur(Graphics g, int x, int y, int width, int height) {

        int lengteBakstenenMuur, hoogteBakstenenMuur;
        int baksteenWidth = 20, baksteenHeight = 10;

        lengteBakstenenMuur = width / baksteenWidth;
        hoogteBakstenenMuur = height / baksteenHeight;

        int newX = x;
        int newY = y;

        for (int i = 0; i < hoogteBakstenenMuur; i++) {
            for (int r = 0; r < lengteBakstenenMuur; r++) {

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

    void tekenBetonnenMuur(Graphics g, int x, int y, int width, int height) {

        int lengteBetonnenMuur, hoogteBetonnenMuur;
        int betonWidth = 30, betonHeight = 20;

        lengteBetonnenMuur = width / betonWidth;
        hoogteBetonnenMuur = height / betonHeight;

        int newX = x;
        int newY = y;

        for (int i = 0; i < hoogteBetonnenMuur; i++) {
            for (int r = 0; r < lengteBetonnenMuur; r++) {

                g.setColor(Color.GRAY);
                g.drawRect(newX,newY,betonWidth,betonHeight);

                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(newX,newY,betonWidth,betonHeight);

                newX = newX  + 1 + betonWidth;
            }

            newX = x;
            newY= newY + 1 + betonHeight;
        }
    }

    class BaksteenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = 20, b = 50;
            int w = 100, h = 100;
            tekenBakstenenMuur(getGraphics(),a,b,w,h);
        }
    }

    class BetonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = 150, b = 50;
            int w = 150, h = 150;
            tekenBetonnenMuur(getGraphics(),a,b,w,h);
        }
    }
}