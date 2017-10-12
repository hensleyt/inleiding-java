package oefening;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Sorteren extends Applet {

    TextField[] textFields;
    int[] getallen;
    Button knop;

    @Override
    public void init() {
        textFields = new TextField[5];
        getallen = new int[5];
        knop = new Button("Klik");

//        textFields[1] = new TextField("",7);
//        add(textFields[1]);
//        textFields[2] = new TextField("",7);
//        add(textFields[2]);
//        textFields[3] = new TextField("",7);
//        add(textFields[3]);
//        textFields[4] = new TextField("",7);
//        add(textFields[4]);


        for (int i = 0; i < textFields.length; i++) {
            textFields[i] = new TextField("",7);
            add(textFields[i]);
        }
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//            String s = textFields[0].getText();
//            int i = Integer.parseInt(s);
//            getallen[0] = i;
//
//            String s1 = textFields[1].getText();
//            int i2 = Integer.parseInt(s);
//            getallen[1] = i2;

            for (int j = 0; j < getallen.length; j++) {
                getallen[j] = Integer.parseInt(textFields[j].getText());
            }

            Arrays.sort(getallen);

            for (int i = 0; i < textFields.length; i++) {
                textFields[i].setText("" + (getallen[i]));
            }
        }
    }
}
