package h11;
import java.applet.*;
import java.awt.*;
public class Herhaling9 extends Applet {
    int marge, breedteVeld, hoogteVeld;
    Color wit, zwart, achtergrond;
    public void init() {
        wit = Color.WHITE;
        zwart = Color.BLACK;
        achtergrond = Color.LIGHT_GRAY;
        marge = 60;
        breedteVeld = 40;
        hoogteVeld = breedteVeld;

        int breedteScherm = 2 * marge + 8 * breedteVeld;
        int hoogteScherm = 2 * marge + 8 * hoogteVeld;
        setSize(breedteScherm, hoogteScherm);
        setBackground(achtergrond);
    }

    public void paint(Graphics g) {
        int y = marge;
        for (int rij = 0; rij < 8; rij++) {
            int x = marge;
            for (int kolom = 0; kolom < 8; kolom++) {
                if ((rij + kolom) % 2 == 0) {
                    g.setColor(zwart);
                } else {
                    g.setColor(wit);
                }
                g.fillRect(x,y,breedteVeld,hoogteVeld);
                x += breedteVeld;
            }
            y += hoogteVeld;

        }
    }
}