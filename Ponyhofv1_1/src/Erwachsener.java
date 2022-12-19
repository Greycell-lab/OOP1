import java.util.Random;

public class Erwachsener extends Besucher{
    /**
     * Erstelt ein Erwachsener-Objekt.
     * Zusätzlich wird der Attraktionsliste der Klasse Attraktion jeweils
     * 3 zufällig ausgewählte Attraktion-Objekte hinzugefügt und der
     * Verpflegungsliste der Klasse Verpflegung 2 bis 4 zufällig ausgewählte
     * Verpflegung-Objekte hinzugefügt.
     */
    Erwachsener(){
        this.alter = rnd.nextInt(14, 67);
        this.eintrittspreis = 15.0f;
        for(int i=0;i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));
        for(int i=0;i<rnd.nextInt(2, 5);i++)Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
        erwachsener++;
    }
}
