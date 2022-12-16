import java.util.Random;

public class Kind extends Besucher{
    static Random rnd = new Random();
    Kind(){
        this.alter = rnd.nextInt(8, 14);
        this.bezeichnung = "Kind";
        this.eintrittspreis = 7.0f;
        for(int i=0;i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));
        for(int i=0;i<rnd.nextInt(2, 5);i++)Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
        kind++;
    }
}
