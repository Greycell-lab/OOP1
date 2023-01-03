import java.util.HashMap;

public class Artikel {

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
        this.verkaufspreis = verkaufspreis + verkaufspreis * gewinnsatz;
    }
}
