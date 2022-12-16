import java.util.Random;

public class Kleinkind extends Besucher{
    static Random rnd = new Random();
    Kleinkind(){
        this.alter = rnd.nextInt(0, 8);
        this.bezeichnung = "Kleinkind";
        this.eintrittspreis = 5.0f;
        kleinkind++;
        for(int i=0;i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));
        for(int i=0;i<rnd.nextInt(2, 5);i++)Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
        if(rnd.nextInt(0, 2) == 0)
        {
            Besucher.liste.add(new Erwachsener());
        }
        else
        {
            Besucher.liste.add(new Rentner());
        }
    }
}
