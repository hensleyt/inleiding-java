package h14;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MultimediaPraktijk extends Applet {

    int aantalSmiley = 23;
    Label invoerGetalLabel = new Label("Hoeveel smileys neem je (één, twee of drie)?");
    TextField invoerGetal = new TextField("", 5);
    Button knop = new Button("Speel");
    String aantalSmileyString = "Aantal smileys: " + aantalSmiley + ". Jouw beurt.",
            invoerCheckString = "",
            aantalWeggehaaldComputerString = "",
            aantalWeggehaaldSpelerString = "";
    public void init() {

        add(invoerGetalLabel);
        add(invoerGetal);
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    public void paint (Graphics g) {

        //Ha!!! Je hebt verloren.
        //Hmmm... je hebt gewonnen
        g.drawString(aantalWeggehaaldComputerString, 10, 40);
        g.drawString(aantalWeggehaaldSpelerString, 10, 60);
        g.drawString(aantalSmileyString, 10, 80);
        g.setColor(Color.RED);
        g.drawString(invoerCheckString, 10, 100);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed (ActionEvent e){

            int beurtSpeler = Integer.parseInt(invoerGetal.getText()), beurtComputer = 0;
            if (beurtSpeler > 0 && beurtSpeler < 4) {

                invoerCheckString = "";
                aantalSmiley = (aantalSmiley - beurtSpeler);
                aantalSmiley = (aantalSmiley - beurtComputer);
                aantalSmileyString =  "Aantal smileys: " + aantalSmiley + ". Jouw beurt.";
                aantalWeggehaaldComputerString = "De computer heeft " + beurtComputer + " smileys weggehaald.";
                aantalWeggehaaldSpelerString = "Je had daarvoor " + beurtSpeler + " smileys weggehaald.";

                if (aantalSmiley < 0){
                    invoerGetal.setEnabled(false);
                    knop.setEnabled(false);
                    aantalWeggehaaldComputerString = "";
                    aantalWeggehaaldSpelerString = "";
                    if (aantalSmiley - beurtSpeler < 0){
                        aantalSmileyString =  "Ha!!! Je hebt verloren.";
                    }
                    if (aantalSmiley - beurtComputer < 0){
                        aantalSmileyString =  "Hmmm... je hebt gewonnen";
                    }
                    remove(invoerGetal);
                    remove(knop);
                    Button nieuwSpelKnop = new Button("Nieuw spel");
                    nieuwSpelKnop.addActionListener(new KnopListener());
                    add(nieuwSpelKnop);
                }
            }
            else {

                invoerCheckString = "Onjuiste invoer";
            }
            repaint();
        }
    }
}