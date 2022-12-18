import java.util.Random;

public class Kleinkind extends Besucher{
        //Zufallszahlengenerator
    static Random rnd = new Random();
    /**
     * Erstellt ein Kleinkind-Objekt und zusätzlich ein Objekt der
     * Erwachsenen oder Rentner-Klasse (zufallsbedingt).
     * Zusätzlich wird der Attraktionsliste der Klasse Attraktion jeweils
     * 3 zufällig ausgewählte Attraktion-Objekte hinzugefügt und der
     * Verpflegungsliste der Klasse Verpflegung 2 bis 4 zufällig ausgewählte
     * Verpflegung-Objekte hinzugefügt.
     */
    Kleinkind(){
        this.alter = rnd.nextInt(0, 8);
        this.eintrittspreis = 5.0f;
        kleinkind++;
        for(int i=0;i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));
        for(int i=0;i<rnd.nextInt(2, 5);i++)Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
        if(rnd.nextInt(0, 2) == 0) Besucher.liste.add(new Erwachsener());
        else Besucher.liste.add(new Rentner());
    }
}
