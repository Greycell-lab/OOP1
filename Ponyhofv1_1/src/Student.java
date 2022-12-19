import java.util.Random;

public class Student extends Besucher{
    /**
     * Erstellt ein Student-Objekt.
     * Zusätzlich wird der Attraktionsliste der Klasse Attraktion jeweils
     * 3 zufällig ausgewählte Attraktion-Objekte hinzugefügt und der
     * Verpflegungsliste der Klasse Verpflegung 2 bis 4 zufällig ausgewählte
     * Verpflegung-Objekte hinzugefügt.
     */
    Student(){
        this.alter = rnd.nextInt(18, 40);
        this.eintrittspreis = 9.0f;
        for(int i=0;i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));
        for(int i=0;i<rnd.nextInt(2, 5);i++)Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
        student++;
    }
}
