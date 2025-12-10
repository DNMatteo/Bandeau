package exemple;

import bandeau.Bandeau;

public class EffetRotation implements exemple.Effect {
    private double angle;

    public EffetRotation() {
        this.angle = angle;
    }

    @Override
    public void jouer(Bandeau b) {
        for (double i = 0; i <= 2 * Math.PI; i += 0.1) {
        b.setRotation(i);
        b.sleep(50);
    }
        b.setRotation(0);
    }
}


