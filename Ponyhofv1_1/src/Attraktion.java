import java.util.ArrayList;
import java.util.List;

public class Attraktion {
    static List<Attraktion> liste = new ArrayList<>();
    String bezeichnung;
    float preis;
    static float gesamtPreis = 0;
    static int planwagenFahrt = 0;
    static int ponyReiten = 0;
    static int huehnerFuettern = 0;
    static int brotBacken = 0;
    static int streichelZoo = 0;
    static float planwagenFahrtPreis = 0;
    static float ponyReitenPreis = 0;
    static float huehnerFuetternPreis = 0;
    static float brotBackenPreis = 0;
    static float streichelZooPreis = 0;

    Attraktion(int random) {
        switch (random) {
            case 0 -> {
                this.bezeichnung = "Planwagenfahrt";
                this.preis = 7.0f;
                planwagenFahrt++;
            }
            case 1 -> {
                this.bezeichnung = "Ponyreiten";
                this.preis = 5.0f;
                ponyReiten++;
            }
            case 2 -> {
                this.bezeichnung = "Hühner füttern";
                this.preis = 2.0f;
                huehnerFuettern++;
            }
            case 3 -> {
                this.bezeichnung = "Brot backen";
                this.preis = 5.0f;
                brotBacken++;
            }
            case 4 -> {
                this.bezeichnung = "Streichelzoo";
                this.preis = 3.0f;
                streichelZoo++;
            }
        }

    }

    static void ausgabeGesamt() {
        for (var x : liste) {
            gesamtPreis += x.preis;
            if (x.bezeichnung.equals("Planwagenfahrt")) planwagenFahrtPreis += x.preis;
            if (x.bezeichnung.equals("Ponyreiten")) ponyReitenPreis += x.preis;
            if (x.bezeichnung.equals("Hühner füttern")) huehnerFuetternPreis += x.preis;
            if (x.bezeichnung.equals("Brot backen")) brotBackenPreis += x.preis;
            if (x.bezeichnung.equals("Streichelzoo")) streichelZooPreis += x.preis;
        }
        System.out.println();
        System.out.println("\t\t\t\t*****ATTRAKTIONEN*****");
        System.out.println("Bezeichnung\t\tMenge\tEinzelpreis\tGesamtpreis");
        System.out.println("Planwagenfahrt\t" + planwagenFahrt + "\t\t7 Euro\t\t" + String.format("%.02f", planwagenFahrtPreis));
        System.out.println("Ponyreiten\t\t" + ponyReiten + "\t\t5 Euro\t\t" + String.format("%.02f", ponyReitenPreis));
        System.out.println("Hühner füttern\t" + huehnerFuettern + "\t\t2 Euro\t\t" + String.format("%.02f", huehnerFuetternPreis));
        System.out.println("Brot backen\t\t" + brotBacken + "\t\t5 Euro\t\t" + String.format("%.02f", brotBackenPreis));
        System.out.println("Streichelzoo\t" + streichelZoo + "\t\t3 Euro\t\t" + String.format("%.02f", streichelZooPreis));
        System.out.println("-----------------------------------------------");
        System.out.println("Gesamt:\t\t\t\t\t\t\t\t" + String.format("%.02f", gesamtPreis));
    }
}
