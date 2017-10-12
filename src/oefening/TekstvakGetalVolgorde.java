package oefening;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
public class TekstvakGetalVolgorde extends Applet {
    TextField[] tekstvelden;
    int[] getallen;
    Button knop;

    public void init() {
        tekstvelden = new TextField[5];
        getallen = new int[5];

        for (int i = 0; i < tekstvelden.length; i++) {
            tekstvelden[i] = new TextField("tekstveld " + i, 12);
            //tekstvelden[i] = ;
            add(tekstvelden[i]);
        }

        knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new KnopListener());

    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvelden.length; i++) {
                String invoer = tekstvelden[i].getText();
                getallen[i] = Integer.parseInt(invoer);
            }

            Arrays.sort(getallen);

            for ( int i = 0; i < getallen.length; i++) {
                tekstvelden[i].setText("" + (getallen[i]));
            }
        }
    }
}

