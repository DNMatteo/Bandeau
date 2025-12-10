package exemple;
import bandeau.Bandeau;
import java.util.ArrayList;
import java.util.List;


public class Scenario {
    private class Etape{
        exemple.Effect effet;
        int repetition;

        public Etape(exemple.Effect effet, int repetition) {
            this.effet = effet;
            this.repetition = repetition;
    }
    }
    private List<Etape> mesetapes = new ArrayList<>();

    public void ajouterEtape(exemple.Effect effet, int repetition) {
        mesetapes.add(new Etape(effet, repetition));
    }

    public void jouer(Bandeau b) {
        for (Etape etape : mesetapes) {
            for (int i = 0; i < etape.repetition; i++) {
                etape.effet.jouer(b);
            }
        }
            }

}
