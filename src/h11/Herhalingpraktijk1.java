package h11;
        import java.applet.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Herhalingpraktijk1 extends Applet {
    TextField invoerGetal;
    Button knop;
    int teller, ingevoerdTafel, berekeningAntwoord;
    public void init() {
        invoerGetal = new TextField("",5);
        invoerGetal.addActionListener(new KnopListener());
        add(invoerGetal);
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    public void paint(Graphics g) {

        int y = 50;
        int x = 50;
        for(teller = 0; teller <= 10; teller++) {
            y += 20;
            berekeningAntwoord = teller * ingevoerdTafel;
            g.drawString("" + teller + " x " + ingevoerdTafel + " = " + berekeningAntwoord, x, y);

        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ingevoerdTafel = Integer.parseInt(invoerGetal.getText());
            repaint();
        }
    }
}
