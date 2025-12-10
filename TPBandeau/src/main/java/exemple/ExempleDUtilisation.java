package exemple;

import bandeau.Bandeau;
import exemple.Effect;
import exemple.Scenario;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {

    public static void main(String[] args) {
        new ExempleDUtilisation().exemple();
    }
    public void exemple() {
        Bandeau monBandeau1 = new Bandeau();
        monBandeau1.setMessage("Bienvenue Sur le WEB");
        monBandeau1.sleep(1000);

        exemple.EffetRotation maRotation = new exemple.EffetRotation();

        maRotation.jouer(monBandeau1);
        monBandeau1.sleep(1000);
        monBandeau1.close();


        Bandeau monBandeau2 = new Bandeau();
        exemple.EffetPolice monPolice = new exemple.EffetPolice();
        monPolice.jouer(monBandeau2);

        monBandeau2.sleep(1000);
        monBandeau2.close();

        Bandeau monBandeau3 = new Bandeau();
        exemple.EffetAurevoir monAurevoir = new exemple.EffetAurevoir();
        monAurevoir.jouer(monBandeau3);

        monBandeau3.sleep(1000);
        monBandeau3.close();


        Bandeau monBandeau4 = new Bandeau();
        monBandeau4.setMessage("Test du scénario");
        monBandeau4.sleep(1000);

        Scenario s = new Scenario();
        s.ajouterEtape(new exemple.EffetRotation(), 2);
        s.ajouterEtape(new exemple.EffetPolice(),1);
        s.ajouterEtape(new exemple.EffetAurevoir(),1);
        s.jouer(monBandeau4);
        monBandeau4.sleep(1000);
        monBandeau4.close();


    }

}
