import java.util.ArrayList;
import java.util.HashMap;

public class Artikel {
    public static ArrayList<Artikel> artikelListe = new ArrayList<>();
    private int id;
    private String bezeichnung;
    private double einkaufspreis;
    private double gewinnsatz;
    private double verkaufspreis;
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

    public double getEinkaufspreis() {
        return einkaufspreis;
    }

    public double getGewinnsatz() {
        return gewinnsatz;
    }

    public double getVerkaufspreis() {
        return verkaufspreis;
    }
}
