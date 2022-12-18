import java.util.Random;

public class Kind extends Besucher{
        //Zufallszahlengenerator
    static Random rnd = new Random();
    /**
     * Erstellt ein Kind-Objekt. Zusätzlich wird der Attraktionsliste der Klasse Attraktion jeweils
     * 3 zufällig ausgewählte Attraktion-Objekte hinzugefügt und der
     * Verpflegungsliste der Klasse Verpflegung 2 bis 4 zufällig ausgewählte
     * Verpflegung-Objekte hinzugefügt.
     */
    Kind(){
        this.alter = rnd.nextInt(8, 14);
        this.eintrittspreis = 7.0f;
        for(int i=0;i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));
        for(int i=0;i<rnd.nextInt(2, 5);i++)Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
        kind++;
    }
}
