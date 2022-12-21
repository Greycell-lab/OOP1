import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Handwerker{
    static Random rnd = new Random();
    List<Werkzeuge> werkzeugListe;
    public Handwerker(){

        for(int i=0;i<rnd.nextInt(3, 6);i++) {
            new Werkzeuge();
        }
        werkzeugListe = new ArrayList<>(Werkzeuge.liste);
        Werkzeuge.liste.clear();
    }

}
