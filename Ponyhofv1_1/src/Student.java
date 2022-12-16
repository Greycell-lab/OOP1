import java.util.Random;

public class Student extends Besucher{
    static Random rnd = new Random();
    Student(){
        this.alter = rnd.nextInt(18, 40);
        this.bezeichnung = "Student";
        this.eintrittspreis = 9.0f;
        for(int i=0;i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));
        for(int i=0;i<rnd.nextInt(2, 5);i++)Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
        student++;
    }
}
