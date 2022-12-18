import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Besucher {
        //Liste die alle Besucher-Objekte enthält
    static List<Besucher> liste = new ArrayList<>();
        //Zufallszahlengenerator
    static Random rnd = new Random();
        //Objekt-Attribute
    int alter;
    float eintrittspreis;
        //Klassen-Attribute
    static float gesamtPreis = 0;
    static int kleinkind = 0;
    static int kleinkindDurchschnitt = 0;
    static float prozentKleinkinder = 0;
    static int kind = 0;
    static int kindDurchschnitt = 0;
    static float prozentKinder = 0;
    static int student = 0;
    static int studentDurchschnitt = 0;
    static float prozentStudenten = 0;
    static int erwachsener = 0;
    static int erwachseneDurchschnitt = 0;
    static float prozentErwachsene = 0;
    static int rentner = 0;
    static int rentnerDurchschnitt = 0;
    static float prozentRentner = 0;
    static float kleinkindPreis = 0;
    static float kindPreis = 0;
    static float studentPreis = 0;
    static float erwachsenerPreis = 0;
    static float rentnerPreis = 0;

    /**
     * Füllt die Besucherliste mit zufällig ausgewählten Besuchern der
     * Unterklassen (Kleinkind, Kind, Student, Rentner, Erwachsener) solange
     * die Listengröße zwischen 150 und 250 liegt (Listengröße wird zufällig
     * festgelegt)
     */
    static void sieKommen() {
        do {
            int x = rnd.nextInt(0, 5);
            if(x == 0) liste.add(new Kleinkind());
            if(x == 1) liste.add(new Kind());
            if(x == 2) liste.add(new Student());
            if(x == 3) liste.add(new Rentner());
            if(x == 4) liste.add(new Erwachsener());
        } while (liste.size() < rnd.nextInt(150, 251));
    }

    /**
     * Gibt die Liste der Besucher Unterteilt in ihre Unterklassen aus inklusive
     * Besucheranzahl der einzelnen Klassen und die Gesamteinnahmen.
     */
    static void ausgabeGesamt() {
        for (var x : liste) {
            gesamtPreis += x.eintrittspreis;
            if (x.getClass() == Kleinkind.class)
            {
                kleinkindPreis += x.eintrittspreis;
                kleinkindDurchschnitt += x.alter;
            }
            if (x.getClass()== Kind.class)
            {
                kindPreis += x.eintrittspreis;
                kindDurchschnitt += x.alter;
            }
            if (x.getClass()== Student.class)
            {
                studentPreis += x.eintrittspreis;
                studentDurchschnitt += x.alter;
            }
            if (x.getClass()== Erwachsener.class)
            {
                erwachsenerPreis += x.eintrittspreis;
                erwachseneDurchschnitt += x.alter;
            }
            if (x.getClass()== Rentner.class)
            {
                rentnerPreis += x.eintrittspreis;
                rentnerDurchschnitt += x.alter;
            }
        }
        kleinkindDurchschnitt /= kleinkind;
        kindDurchschnitt /= kind;
        studentDurchschnitt /= student;
        erwachseneDurchschnitt /= erwachsener;
        rentnerDurchschnitt /= rentner;
        prozentKleinkinder = 100f / liste.size() * kleinkind;
        prozentErwachsene = 100f / liste.size() * erwachsener;
        prozentStudenten = 100f / liste.size() * student;
        prozentRentner = 100f / liste.size() * rentner;
        prozentKinder = 100f / liste.size() * kind;
        System.out.println();
        System.out.println("\t\t\t\t*****BESUCHER*****");
        System.out.println("Bezeichnung\t\tMenge\tEinzelpreis\tGesamtpreis");
        System.out.println("Kleinkind\t\t" + kleinkind + "\t\t5 Euro\t\t" + String.format("%.02f", kleinkindPreis));
        System.out.println("Kind\t\t\t" + kind + "\t\t7 Euro\t\t" + String.format("%.02f", kindPreis));
        System.out.println("Student\t\t\t" + student + "\t\t9 Euro\t\t" + String.format("%.02f", studentPreis));
        System.out.println("Erwachsener\t\t" + erwachsener + "\t\t15 Euro\t\t" + String.format("%.02f", erwachsenerPreis));
        System.out.println("Rentner\t\t\t" + rentner + "\t\t10 Euro\t\t" + String.format("%.02f", rentnerPreis));
        System.out.println("-----------------------------------------------");
        System.out.println("Gesamt:\t\t\t" + liste.size() + "\t\t\t\t\t" + String.format("%.02f", gesamtPreis));
    }
    static void einnahmenGesamt() {
        System.out.println();
        System.out.println("Altersdurchschnitt Kleinkinder: " + kleinkindDurchschnitt + " Jahre");
        System.out.println("Altersdurchschnitt Kinder: " + kindDurchschnitt + " Jahre");
        System.out.println("Altersdurchschnitt Studenten: " + studentDurchschnitt + " Jahre");
        System.out.println("Altersdurchschnitt Erwachsene: " + erwachseneDurchschnitt + " Jahre");
        System.out.println("Altersdurchschnitt Rentner: " + rentnerDurchschnitt + " Jahre");
        System.out.println();
        System.out.println("Anteil Kleinkinder in Prozent: " + String.format("%.02f", prozentKleinkinder));
        System.out.println("Anteil Kinder in Prozent: " + String.format("%.02f", prozentKinder));
        System.out.println("Anteil Studenten in Prozent: " + String.format("%.02f", prozentStudenten));
        System.out.println("Anteil Erwachsene in Prozent: " + String.format("%.02f", prozentErwachsene));
        System.out.println("Anteil Rentner in Prozent: " + String.format("%.02f", prozentRentner));
        System.out.println();
        System.out.println("Geamteinnahmen: " + String.format("%.02f", (Besucher.gesamtPreis + Attraktion.gesamtPreis + Verpflegung.gesamtPreis)) + "€");
    }

}
