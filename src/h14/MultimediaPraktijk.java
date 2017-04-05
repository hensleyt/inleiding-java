
package h14;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class MultimediaPraktijk extends Applet {

    private Image aantal_Plaatjes,
            einde_Plaatje;

    private boolean errorBoolean, spelGestart;
    private int aantal_Stenen = 23,
            aantal_Computer_Zet = 0;
    private Label tekstvakLabel = new Label("Hoeveel smileys neem je (één, twee of drie)?");
    private TextField tekstvak = new TextField("", 5);
    private Button startKnop = new Button("Start spel"),
            speelKnop = new Button("Speel"),
            nieuwSpelKnop = new Button("Nieuw spel");
    private String aantal_Plaatjes_Pad = "Stone.png",
            einde_Plaatje_Pad = "",
            regel1 = "",
            regel2 = "",
            regel3 = "";

    public void init() {

        URL pad;
        pad = MultimediaPraktijk.class.getResource("/resources/");
        aantal_Plaatjes = getImage(pad, aantal_Plaatjes_Pad);
        einde_Plaatje = getImage(pad, einde_Plaatje_Pad);
        // Om het spel te starten
        startKnop.addActionListener(new StartKnopListener());
        add(startKnop);

        // Nieuwe Spel Knop wordt pas gebruikt wanneer het spel is geeïndigd.
        nieuwSpelKnop.addActionListener(new MultimediaPraktijk.NieuwSpelKnopListener());
    }

    public void paint(Graphics g) {

        // Als invoer fout is errorBoolean = true
        if (errorBoolean){
            g.setColor(Color.RED);
        }
        g.drawString(regel1, 10, 40);
        g.drawString(regel2, 10, 60);
        g.drawString(regel3, 10, 80);
        g.drawImage(einde_Plaatje, 95, 60, 200, 200, this);

        // Als spel is gestart, spelGestart = true
        if (spelGestart) {
            int x = 10, y = 100;
            for (int i = 0; i < aantal_Stenen; i++) {
                if (i == 7 || i == 14 || i == 21) {
                    x = 10;
                    y += 35;
                }
                g.drawImage(aantal_Plaatjes, x, y, 30, 30, this);
                x += 35;
            }
        }
    }

    // Toegevoegde knoppen worden zichtbaar
    private void repaintButtons(){
        setSize(401, 300);
        setSize(400, 300);
    }

    // Spel wordt gestart \\
    class StartKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            spelGestart = true;
            remove(startKnop);

            add(tekstvakLabel);
            add(tekstvak);

            // Speel Knop wordt pas gebruikt wanneer er op de Start Knop is gedrukt.
            speelKnop.addActionListener(new SpeelKnopListener());
            add(speelKnop);

            repaintButtons();
        }
    }

    // Spel Berekeningen \\
    private void computerZet() {
        double RandomGetal = Math.random();
        int random = (int) (RandomGetal * 3 + 1);

        if (aantal_Stenen > 20) {
            aantal_Computer_Zet = random;
        } else if (aantal_Stenen % 4 == 0){
            aantal_Computer_Zet = 3;
            aantal_Plaatjes_Pad = "Magma.png";
        } else if (aantal_Stenen % 4 == 2){
            aantal_Computer_Zet = 1;
            aantal_Plaatjes_Pad = "Magma.png";
        } else if (aantal_Stenen % 4 == 3){
            aantal_Computer_Zet = 2;
            aantal_Plaatjes_Pad = "Magma.png";
        } else if (aantal_Stenen % 4 == 1){
            aantal_Computer_Zet = random;
        }
        aantal_Stenen = aantal_Stenen - aantal_Computer_Zet;
    }

    class SpeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            int aantal_Speler_Zet;
            aantal_Speler_Zet = Integer.parseInt(tekstvak.getText());

            if (aantal_Speler_Zet > 0 && aantal_Speler_Zet < 4){

                if(errorBoolean) {
                    errorBoolean = false;
                }
                aantal_Stenen = aantal_Stenen - aantal_Speler_Zet;

                // Als de computer gewonnen heeft
                if (aantal_Stenen < 1) {

                    spelGestart = false;

                    regel1 = "Ha!!! Je hebt verloren.";
                    regel2 = "";
                    regel3 = "";

                    remove(tekstvakLabel);
                    remove(tekstvak);
                    remove(speelKnop);

                    add(nieuwSpelKnop);

                    repaintButtons();

                    einde_Plaatje_Pad = "haha_face.png";
                // Als de speler gewonnen heeft
                } else if (aantal_Stenen == 1) {

                    spelGestart = false;

                    regel1 = "Hmmm... je hebt gewonnen";
                    regel2 = "";
                    regel3 = "";

                    remove(tekstvakLabel);
                    remove(tekstvak);
                    remove(speelKnop);

                    add(nieuwSpelKnop);

                    repaintButtons();

                    einde_Plaatje_Pad = "winner-trophy.png";
                } else {
                    computerZet();
                    regel1 = "De computer heeft " + aantal_Computer_Zet + " stenen weggehaald.";
                    regel2 = "Aantal stenen: " + aantal_Stenen + ". Jouw beurt.";
                    regel3 = "Je had hiervoor " + aantal_Speler_Zet + " stenen weggehaald.";
                }
            }
            // Als invoer fout is
            else {
                errorBoolean = true;
                regel1 = "Onjuiste invoer";
                regel2 = "";
                regel3 = "";
                // if TextField is empty
                // regel1 = "Voer een geheel getal in";
           }
            repaint();
        }
    }

    // Nieuwe Spel \\
    class NieuwSpelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            spelGestart = true;

            regel1 = "";
            regel2 = "";
            regel3 = "";

            aantal_Stenen = 23;

            add(tekstvakLabel);
            add(tekstvak);
            add(speelKnop);
            remove(nieuwSpelKnop);

            repaintButtons();
            repaint();
        }
    }
}