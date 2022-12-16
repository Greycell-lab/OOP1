import java.util.ArrayList;
import java.util.List;

public class Verpflegung {
    String bezeichnung;
    float preis;
    static List<Verpflegung> liste = new ArrayList<>();
    static float gesamtPreis = 0;
    static int wasser = 0;
    static float wasserPreis = 0;
    static int limo = 0;
    static float limoPreis = 0;
    static int waffeln = 0;
    static float waffelnPreis = 0;
    static int bratwurst = 0;
    static float bratwurstPreis = 0;
    static int salat = 0;
    static float salatPreis = 0;
    static int currywurst = 0;
    static float currywurstPreis = 0;
    static int pommes = 0;
    static float pommesPreis = 0;
    static int veganerWrap = 0;
    static float veganerWrapPreis = 0;

    Verpflegung(int random) {
        switch (random) {
            case 0 -> {
                this.bezeichnung = "Wasser";
                this.preis = 2.0f;
                wasser++;
            }
            case 1 -> {
                this.bezeichnung = "Limo";
                this.preis = 3.0f;
                limo++;
            }
            case 2 -> {
                this.bezeichnung = "Waffeln";
                this.preis = 3.0f;
                waffeln++;
            }
            case 3 -> {
                this.bezeichnung = "Bratwurst";
                this.preis = 2.0f;
                bratwurst++;
            }
            case 4 -> {
                this.bezeichnung = "Salat";
                this.preis = 6.0f;
                salat++;
            }
            case 5 -> {
                this.bezeichnung = "Currywurst";
                this.preis = 4.0f;
                currywurst++;
            }
            case 6 -> {
                this.bezeichnung = "Pommes";
                this.preis = 2.0f;
                pommes++;
            }
            case 7 -> {
                this.bezeichnung = "Veganer Wrap";
                this.preis = 5.0f;
                veganerWrap++;
            }
        }

    }

    static void ausgabeGesamt() {
        for (var x : liste) {
            gesamtPreis += x.preis;
            if (x.bezeichnung.equals("Wasser")) wasserPreis += x.preis;
            if (x.bezeichnung.equals("Limo")) limoPreis += x.preis;
            if (x.bezeichnung.equals("Waffeln")) waffelnPreis += x.preis;
            if (x.bezeichnung.equals("Bratwurst")) bratwurstPreis += x.preis;
            if (x.bezeichnung.equals("Salat")) salatPreis += x.preis;
            if (x.bezeichnung.equals("Currywurst")) currywurstPreis += x.preis;
            if (x.bezeichnung.equals("Pommes")) pommesPreis += x.preis;
            if (x.bezeichnung.equals("Veganer Wrap")) veganerWrapPreis += x.preis;
        }

        System.out.println();
        System.out.println("\t\t\t\t*****VERPFLEGUNG*****");
        System.out.println("Bezeichnung\t\tMenge\tEinzelpreis\tGesamtpreis");
        System.out.println("Wasser\t\t\t" + wasser + "\t\t2 Euro\t\t" + String.format("%.02f", wasserPreis));
        System.out.println("Limo\t\t\t" + limo + "\t\t3 Euro\t\t" + String.format("%.02f", limoPreis));
        System.out.println("Waffeln\t\t\t" + waffeln + "\t\t3 Euro\t\t" + String.format("%.02f", waffelnPreis));
        System.out.println("Bratwurst\t\t" + bratwurst + "\t\t2 Euro\t\t" + String.format("%.02f", bratwurstPreis));
        System.out.println("Salat\t\t\t" + salat + "\t\t6 Euro\t\t" + String.format("%.02f", salatPreis));
        System.out.println("Currywurst\t\t" + currywurst + "\t\t4 Euro\t\t" + String.format("%.02f", currywurstPreis));
        System.out.println("Pommes\t\t\t" + pommes + "\t\t2 Euro\t\t" + String.format("%.02f", pommesPreis));
        System.out.println("Veganer Wrap\t" + veganerWrap + "\t\t5 Euro\t\t" + String.format("%.02f", veganerWrapPreis));
        System.out.println("-----------------------------------------------");
        System.out.println("Gesamt:\t\t\t\t\t\t\t\t" + String.format("%.02f", gesamtPreis));
    }
}
