package oefening;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetallenZoeken extends Applet {

    int[] getallen = {55, 44, 58, 102, 23, 37, 31, 52, 17};


    TextField textField;
    Button button;
    String schermtekst;

    @Override
    public void init() {

        textField = new TextField("", 8);
        add(textField);
        button = new Button("Kies");
        add(button);
        button.addActionListener(new KnopListener());
        schermtekst = "";
    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 80;

        g.drawString(schermtekst,x,y);
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(textField.getText());
            boolean isgevonden = false;
            int index = 0;
            for (int i = 0; i < getallen.length; i++){
                if (getallen[i] == invoer) {
                    isgevonden = true;
                    index = i;
                }

                if (isgevonden) {
                    schermtekst = "Is gevonden. Index is " + index;
                }
                else {
                    schermtekst = "Is niet gevonden";
                }
                repaint();
            }
        }
    }
}
