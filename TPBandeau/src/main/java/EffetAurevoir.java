package exemple;
import bandeau.Bandeau;
public class EffetAurevoir  implements exemple.Effect{
    public void jouer(Bandeau b) {
        String message = "Au revoir !";
        b.setMessage(message);
        b.sleep(2000);

        while (message.length() > 0){
            message = message.substring(0, message.length() - 1);
            b.setMessage(message);
            b.sleep(500);
        }


    }



}
