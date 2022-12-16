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
    Besucher(int alter) {

        this.alter = alter;
        if (alter <= 7) {
            this.bezeichnung = "Kleinkind";
            this.eintrittspreis = 5.0f;
            kleinkind++;
            if(rnd.nextInt(0, 2) == 0) {
                liste.add(new Besucher(rnd.nextInt(67, 90)));
                for(int i=0; i<rnd.nextInt(2, 5); i++) Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
                for(int i=0; i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));
            }
            else {
                liste.add(new Besucher(rnd.nextInt(18, 67)));
                for(int i=0;i<rnd.nextInt(2, 5);i++) Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
                for(int i=0; i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));
            }
        }
        else if (alter >= 8 && alter <= 13) {
            this.bezeichnung = "Kind";
            this.eintrittspreis = 7.0f;
            kind++;
        }
        else if(alter >= 67){
            this.bezeichnung = "Rentner";
            this.eintrittspreis = 10.0f;
            rentner++;
        }
        else if(alter >= 18) {
            this.bezeichnung = "Erwachsener";
            this.eintrittspreis = 9.0f;
            erwachsener++;
        }
        else{
            this. bezeichnung = "Student";
            this.eintrittspreis = 15.0f;
            student++;
        }
        for(int i=0;i<rnd.nextInt(2, 5);i++) Verpflegung.liste.add(new Verpflegung(rnd.nextInt(0, 8)));
        for(int i=0; i<3;i++) Attraktion.liste.add(new Attraktion(rnd.nextInt(0, 5)));

    }
    static void erstelleBesucherliste() {
        do{
            liste.add(new Besucher(rnd.nextInt(0,90)));
        }while(liste.size() < rnd.nextInt(150, 251));
    }
    static void ausgabeGesamt() {
        for(var x : liste){
            gesamtPreis += x.eintrittspreis;
            if(x.bezeichnung.equals("Kleinkind")) kleinkindPreis += x.eintrittspreis;
            if(x.bezeichnung.equals("Kind")) kindPreis += x.eintrittspreis;
            if(x.bezeichnung.equals("Student")) studentPreis += x.eintrittspreis;
            if(x.bezeichnung.equals("Erwachsener")) erwachsenerPreis += x.eintrittspreis;
            if(x.bezeichnung.equals("Rentner")) rentnerPreis += x.eintrittspreis;
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
    static void einnahmenGesamt()
    {
        System.out.println("Geamteinnahmen: " + (Besucher.gesamtPreis+Attraktion.gesamtPreis+Verpflegung.gesamtPreis) + "€");
    }

}
