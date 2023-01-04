import java.util.ArrayList;
import java.util.HashMap;

public class Artikel {
    public static ArrayList<Artikel> artikelListe = new ArrayList<>();
    private final int id;
    private final String bezeichnung;
    private final double einkaufspreis;
    private final double gewinnsatz;
    private final double verkaufspreis;
    public Artikel(int id, String bezeichnung, double einkaufspreis, double gewinnsatz){
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.einkaufspreis = einkaufspreis;
        this.gewinnsatz = gewinnsatz;
        this.verkaufspreis = einkaufspreis + einkaufspreis /100 * gewinnsatz;
        artikelListe.add(this);
    }

    public int getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getVerkaufspreis() {
        return verkaufspreis;
    }
}
