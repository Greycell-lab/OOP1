import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Werkzeuge {
    static Random rnd = new Random();
    String bezeichnung;
    static List<Werkzeuge> liste = new ArrayList<>();
    public Werkzeuge(){
        int x = rnd.nextInt(0, 10);
        switch (x) {
            case 0 -> bezeichnung = "Hammer";
            case 1 -> bezeichnung = "Bohrmaschine";
            case 2 -> bezeichnung = "Axt";
            case 3 -> bezeichnung = "Säge";
            case 4 -> bezeichnung = "Schraubenschlüssel";
            case 5 -> bezeichnung = "Kombizange";
            case 6 -> bezeichnung = "Meissel";
            case 7 -> bezeichnung = "Schraubenzieher";
            case 8 -> bezeichnung = "Engländer";
            case 9 -> bezeichnung = "Kneifzange";
        }
        if(liste.size()==0) liste.add(this);
        else {
            for (var y : liste) {
                if (!y.bezeichnung.equals(this.bezeichnung)) liste.add(this);
                else new Werkzeuge();
            }
        }
    }
}
