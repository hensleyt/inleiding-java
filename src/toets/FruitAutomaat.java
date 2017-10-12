package toets;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
/**
 * Created by Hensley on 16-12-2016.
 */
public class FruitAutomaat extends Applet {

    private Image slot1, slot2, slot3;
//    private Image fruitImage1, fruitImage2, fruitImage3, fruitImage4, fruitImage5, fruitImage6, fruitImage7, fruitImage8, fruitImage9, fruitImage10;
//    private Image fruitImage11, fruitImage12, fruitImage13, fruitImage14, fruitImage15, fruitImage16, fruitImage17, fruitImage18, fruitImage19, fruitImage20;
//    boolean koopKredietBoolean = false, speelKnopBoolean = true;
    int aantalKrediet = 10, aantalGewonnen = 0;
    int aantalGewonnen2Gelijk = 4;
    int aantalGewonnen3Gelijk = 20;
    double randomDouble1 = Math.random();
    double randomDouble2 = Math.random();
    double randomDouble3 = Math.random();
    int randomDoubleToInt1 = (int)(randomDouble1 * 20 + 1);
    int randomDoubleToInt2 = (int)(randomDouble2 * 20 + 1);
    int randomDoubleToInt3 = (int)(randomDouble3 * 20 + 1);
    Button speelKnop, koopKredietKnop;
//    String fruitjpg = "fruit_1.jpg";
    String fruitRandomJpg1 = "fruit_" + randomDoubleToInt1 + ".jpg" ;
    String fruitRandomJpg2 = "fruit_" + randomDoubleToInt2 + ".jpg" ;
    String fruitRandomJpg3 = "fruit_" + randomDoubleToInt3 + ".jpg" ;
    String gewonnenString = "";
    private AudioClip winSound;
    public void init() {

        speelKnop = new Button("Speel");
        speelKnop.addActionListener( new SpeelKnopListener());
        add(speelKnop);

        koopKredietKnop = new Button("Koop 10 kredietpunten");
        koopKredietKnop.addActionListener( new KoopKredietKnopListener());
        add(koopKredietKnop);

        speelKnop.setEnabled(true);
        koopKredietKnop.setEnabled(false);

        URL pad = FruitAutomaat.class.getResource("/resources/");

//        fruitImage1 = getImage(pad, "fruit_1.jpg");
//        fruitImage2 = getImage(pad, "fruit_2.jpg");

        slot1 = getImage(pad, fruitRandomJpg1);
        slot2 = getImage(pad, fruitRandomJpg2);
        slot3 = getImage(pad, fruitRandomJpg3);
    }

    public void paint(Graphics g) {
//        g.drawString(pad.toString(), 20, 10 );

        g.drawImage(slot1, 20, 60, 71, 165, this);
        g.drawImage(slot2, 91, 60, 71, 165, this);
        g.drawImage(slot3, 162, 60, 71, 165, this);
        g.drawString("Krediet: " + aantalKrediet, 20, 245);
        g.drawString(gewonnenString, 20, 265);
    }

    class SpeelKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gewonnenString = "";
            double randomSpinDouble1 = Math.random();
            double randomSpinDouble2 = Math.random();
            double randomSpinDouble3 = Math.random();
//            int randomSpinDoubleToInt1 = (int)(randomSpinDouble1 * 20 + 1);
//            int randomSpinDoubleToInt2 = (int)(randomSpinDouble2 * 20 + 1);
//            int randomSpinDoubleToInt3 = (int)(randomSpinDouble3 * 20 + 1);
            int randomSpinDoubleToInt1 = 5;
            int randomSpinDoubleToInt2 = 5;
            int randomSpinDoubleToInt3 = 5;
            fruitRandomJpg1 = "fruit_" + randomSpinDoubleToInt1 + ".jpg" ;
            fruitRandomJpg2 = "fruit_" + randomSpinDoubleToInt2 + ".jpg" ;
            fruitRandomJpg3 = "fruit_" + randomSpinDoubleToInt3 + ".jpg" ;
            URL pad = FruitAutomaat.class.getResource("/resources/");
            slot1 = getImage(pad, fruitRandomJpg1);
            slot2 = getImage(pad, fruitRandomJpg2);
            slot3 = getImage(pad, fruitRandomJpg3);
            if (aantalKrediet > 0){
                aantalKrediet--;

                if (randomSpinDoubleToInt1 == randomSpinDoubleToInt2 || randomSpinDoubleToInt2 == randomSpinDoubleToInt3){
                    aantalKrediet = aantalKrediet + aantalGewonnen2Gelijk;
                    aantalGewonnen = aantalGewonnen2Gelijk;
                    gewonnenString = "Gewonnen: " + aantalGewonnen + " punten!";
                    URL padSound = FruitAutomaat.class.getResource("/resources/");
                    winSound = getAudioClip(padSound, "win.wav");
                    winSound.play();
                }
                if (randomSpinDoubleToInt1 == randomSpinDoubleToInt2 && randomSpinDoubleToInt2 == randomSpinDoubleToInt3){
                    aantalKrediet = aantalKrediet + aantalGewonnen3Gelijk;
                    aantalGewonnen = aantalGewonnen3Gelijk;
                    gewonnenString = "Gewonnen: " + aantalGewonnen + " punten!";
                    URL padSound = FruitAutomaat.class.getResource("/resources/");
                    winSound = getAudioClip(padSound, "win.wav");
                    winSound.play();
                }
            }
            if (aantalKrediet == 0){
                koopKredietKnop.setEnabled(true);
                speelKnop.setEnabled(false);

            }

            repaint();
        }
    }

    class KoopKredietKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (aantalKrediet == 0){
                aantalKrediet += 10;
                speelKnop.setEnabled(true);
                koopKredietKnop.setEnabled(false);
            }
            repaint();
        }
    }
}
