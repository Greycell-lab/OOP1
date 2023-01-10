import java.util.HashMap;
import java.util.Scanner;

public class Warenkorb {
    private static final String LINES = "------------------------------";
    private HashMap<Artikel, Integer> warenkorb = new HashMap<>();
    private static boolean passed;
    private static int auswahl, menge;
    public double getSumme(){
        double summe = 0;
        for(var x : this.warenkorb.keySet()) summe += x.getVerkaufspreis() * warenkorb.get(x);
        return summe;
    }
    public void showWarenkorb(){
        if(warenkorb.size()==0) System.out.println("Warenkorb ist leer");
        else {
            System.out.println("ID\t\tArtikel\t\tMenge");
            for (var x : this.warenkorb.keySet())
                System.out.println(x.getId() + "\t\t" + x.getBezeichnung() + "\t\t" + warenkorb.get(x) + "\t\t" + String.format("%.2f", (x.getVerkaufspreis() * warenkorb.get(x))) + "€");
            System.out.println("Gesamt:\t\t\t\t\t\t" + String.format("%.2f", getSumme()) + "€");
        }
    }
    public void showMenu(){
        System.out.println(LINES);
        System.out.println("1: Artikel anzeigen");
        System.out.println("2: Artikel in den Warenkorb");
        System.out.println("3: Artikel löschen");
        System.out.println("4: Warenkorb anzeigen");
        System.out.println("5: Zur Kasse");
        System.out.println("6: Shop verlassen");
        System.out.println(LINES);
        do {
            try {
                System.out.print("Auswahl: ");
                auswahl = Integer.parseInt(new Scanner(System.in).nextLine());
                passed = true;
            } catch (NumberFormatException e) {
                System.out.println("Etwas ist schief gelaufen. Bitte versuche es erneut");
                passed = false;
            }
            if(auswahl < 1 || auswahl > 6){
                System.out.println("Diese Zahl steht nicht zur Wahl");
                passed = false;
            }
        }while(!passed);
        switch(auswahl){
            case 1 -> ausgabeArtikel();
            case 2 -> kaufenArtikel();
            case 3 -> entferneArtikel();
            case 4 -> showWarenkorb();
            case 5 -> bestellungAbschicken();
            case 6 -> leaveShop();
        }
    }
    public void ausgabeArtikel(){
        System.out.println(LINES);
        System.out.println("ID\t\tArtikel\t\tPreis");
        for(var x : Artikel.artikelListe) System.out.println(x.getId() + "\t\t" + x.getBezeichnung() + "\t\t" + String.format("%.2f",x.getVerkaufspreis()) + "€");
        System.out.println(LINES);
    }
    public void kaufenArtikel(){
        System.out.println(LINES);
        ausgabeArtikel();
        abfrage();
        if(!this.warenkorb.containsKey(Artikel.artikelListe.get(auswahl-1))) this.warenkorb.put(Artikel.artikelListe.get(auswahl-1), menge);
        else this.warenkorb.replace(Artikel.artikelListe.get(auswahl-1), this.warenkorb.get(Artikel.artikelListe.get(auswahl-1))+menge);
        System.out.println(LINES);
    }
    public void entferneArtikel(){
        System.out.println(LINES);
        showWarenkorb();
        abfrage();
        if(!this.warenkorb.containsKey(Artikel.artikelListe.get(auswahl-1))) System.out.println("Es befindet sich kein Artikel mit dieser ID im Warenkorb");
        else if(this.warenkorb.get(Artikel.artikelListe.get(auswahl-1)) - menge <= 0) this.warenkorb.remove(Artikel.artikelListe.get(auswahl-1));
        else this.warenkorb.replace(Artikel.artikelListe.get(auswahl-1), this.warenkorb.get(Artikel.artikelListe.get(auswahl-1))-menge);
        System.out.println(LINES);
    }
    public void abfrage(){
        do {
            try {
                System.out.println(LINES);
                System.out.print("Welcher Artikel: ");
                auswahl = Integer.parseInt(new Scanner(System.in).nextLine());
                System.out.print("Menge: ");
                menge = Integer.parseInt(new Scanner(System.in).nextLine());
                passed = true;
            } catch (NumberFormatException e) {
                System.out.println("Etwas ist schief gelaufen. Versuche es erneut.");
                passed = false;
            }
            if(auswahl > Artikel.artikelListe.size() || auswahl < 0){
                System.out.println("Ungültige ID");
                passed = false;
            }
        }while(!passed);
        System.out.println(LINES);
    }
    public static void leaveShop(){
        System.out.println("Vielen dank fürs vorbei schauen.");
        System.exit(0);
    }
    public void bestellungAbschicken(){
        showWarenkorb();
        double bezahlen = 0;
        double rest = this.getSumme();
        do {
            try {
                System.out.print("Bitte tragen sie den geforderten Betrag ein: ");
                bezahlen = Double.parseDouble(new Scanner(System.in).nextLine());
                passed = true;
            } catch (NumberFormatException e) {
                System.out.println("Etwas ist schief gelaufen. Versuche es erneut");
                passed = false;
            }
            rest -= bezahlen;
            if(rest > 0) {
                System.out.println("Sie haben zu wenig geld gegeben.");
                System.out.println("Bitte zahlen sie die restlichen " + String.format("%.2f", rest) + "€");
            }
        }while(!passed || rest > 0);
        if(-rest > 0) System.out.println("Sie erhalten " + String.format("%.2f", -rest) + "€ zurück.");
        System.out.println("Vielen Dank für Ihren Einkauf.");
        this.warenkorb.clear();

    }

}
