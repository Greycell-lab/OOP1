import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Besucher {
    static Random rnd = new Random();
    int alter;
    String bezeichnung;
    float eintrittspreis;
    static float gesamtPreis = 0;
    static int kleinkind = 0;
    static int kind = 0;
    static int student = 0;
    static int erwachsener = 0;
    static int rentner = 0;
    static float kleinkindPreis = 0;
    static float kindPreis = 0;
    static float studentPreis = 0;
    static float erwachsenerPreis = 0;
    static float rentnerPreis = 0;
    static List<Besucher> liste = new ArrayList<>();
    static void erstelleBesucherliste() {
        do {
            int x = rnd.nextInt(0, 5);
            if(x == 0) liste.add(new Kleinkind());
            if(x == 1) liste.add(new Kind());
            if(x == 2) liste.add(new Student());
            if(x == 3) liste.add(new Rentner());
            if(x == 4) liste.add(new Erwachsener());
        } while (liste.size() < rnd.nextInt(150, 251));
    }
    static void ausgabeGesamt() {
        for (var x : liste) {
            gesamtPreis += x.eintrittspreis;
            if (x.getClass() == Kleinkind.class) kleinkindPreis += x.eintrittspreis;
            if (x.getClass()== Kind.class) kindPreis += x.eintrittspreis;
            if (x.getClass()== Student.class) studentPreis += x.eintrittspreis;
            if (x.getClass()== Erwachsener.class) erwachsenerPreis += x.eintrittspreis;
            if (x.getClass()== Rentner.class) rentnerPreis += x.eintrittspreis;
        }
        System.out.println();
        System.out.println("Bezeichnung\t\tMenge\tEinzelpreis\tGesamtpreis");
        System.out.println("Kleinkind\t\t" + kleinkind + "\t\t5 Euro\t\t" + String.format("%.02f", kleinkindPreis));
        System.out.println("Kind\t\t\t" + kind + "\t\t7 Euro\t\t" + String.format("%.02f", kindPreis));
        System.out.println("Student\t\t\t" + student + "\t\t9 Euro\t\t" + String.format("%.02f", studentPreis));
        System.out.println("Erwachsener\t\t" + erwachsener + "\t\t15 Euro\t\t" + String.format("%.02f", erwachsenerPreis));
        System.out.println("Rentner\t\t\t" + rentner + "\t\t5 Euro\t\t" + String.format("%.02f", rentnerPreis));
        System.out.println("-----------------------------------------------");
        System.out.println("Gesamt:\t\t\t" + liste.size() + "\t\t\t\t\t" + String.format("%.02f", gesamtPreis));
        System.out.println();
    }
    static void einnahmenGesamt() {
        System.out.println("Geamteinnahmen: " + String.format("%.02f", (Besucher.gesamtPreis + Attraktion.gesamtPreis + Verpflegung.gesamtPreis)) + "€");
    }

}
