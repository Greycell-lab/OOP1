import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baustelle {
    static Random rnd = new Random();
    static List<Baustelle> liste = new ArrayList<>();
    List<Handwerker> handwerkerListe = new ArrayList<>();
    public Baustelle(){
        for(int i=0;i<rnd.nextInt(5, 11);i++)handwerkerListe.add(new Handwerker());
        liste.add(this);
    }
    public static void baustelleAusgabe(){
        int baustelle = 1;
        for(var x : Baustelle.liste) {
            System.out.println("Baustelle " + baustelle + ":");
            baustelle++;
            int handwerker = 1;
            for(var y : x.handwerkerListe){
                System.out.print("Handwerker " + handwerker + ": ");
                for(var z : y.werkzeugListe){
                    System.out.print(z.bezeichnung + " ");

                }
                handwerker++;
                System.out.println();
            }
            System.out.println();
        }
    }
}
