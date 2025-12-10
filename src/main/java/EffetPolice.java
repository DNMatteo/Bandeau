package exemple;

import bandeau.Bandeau;
import java.awt.Color;

public class EffetPolice implements exemple.Effect {
    public void jouer(Bandeau b) {
        // On sauvegarde la couleur d'origine pour ne pas casser le bandeau
        Color ancienneCouleur = b.getForeground();

        b.setMessage("ALERTE GENERALE !");

        // On fait clignoter 10 fois
        for (int i = 0; i < 10; i++) {
            // ROUGE
            b.setForeground(Color.RED);
            b.sleep(100); // Très rapide

            // BLEU
            b.setForeground(Color.BLUE);
            b.sleep(100);
        }

        // On remet la couleur normale à la fin (bonnes manières)
        b.setForeground(ancienneCouleur);
        String message = b.getMessage();
        for (int i = 0; i < 60; i++) {
            message = "  " + message;

            b.setMessage(message);
            b.sleep(10);
        }
        b.setMessage("");
    }
}
