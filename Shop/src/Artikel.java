import java.util.ArrayList;
import java.util.HashMap;

public class Artikel {
    public static ArrayList<Artikel> artikelListe = new ArrayList<>();
    private static int id = 1;
    private final int artikelId;
    private final String bezeichnung;
    private final double einkaufspreis;
    private final double gewinnsatz;
    private final double verkaufspreis;
    public Artikel(String bezeichnung, double einkaufspreis, double gewinnsatz){
        this.artikelId = id;
        id++;
        this.bezeichnung = bezeichnung;
        this.einkaufspreis = einkaufspreis;
        this.gewinnsatz = gewinnsatz;
        this.verkaufspreis = einkaufspreis + einkaufspreis /100 * gewinnsatz;
        artikelListe.add(this);
    }
    public static void fillArtikelList(){
        new Artikel("Pizza", 1.50, 35);
        new Artikel("Bohnen", 0.50, 25);
        new Artikel( "Bananen", 0.80, 30);
        new Artikel("Chips", 0.35, 75);
        new Artikel("Shampoo", 1.15, 60);
        new Artikel("Fisch", 0.50, 50);
        new Artikel("Bürste", 1.20, 45);
        new Artikel("Bonbons", 0.90, 25);
        new Artikel("Schoki", 0.35, 35);
        new Artikel("Brot", 0.20, 40);
    }

    public int getId() {
        return artikelId;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getVerkaufspreis() {
        return verkaufspreis;
    }
}
