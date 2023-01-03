import java.util.ArrayList;

public class Futter {
    private static ArrayList<Futter> futterListe = new ArrayList<>();
    private String bezeichnung;
    private double kalorien;
    private ArrayList<Tier> tierListe = new ArrayList<>();
    public Futter(String bezeichnung, double kalorien){
        this.bezeichnung = bezeichnung;
        this.kalorien = kalorien;
        futterListe.add(this);
    }
    public void addTier(Tier tier){
        if(!this.tierListe.contains(tier)) this.tierListe.add(tier);
    }

    public static ArrayList<Futter> getFutterListe() {
        return futterListe;
    }

    public ArrayList<Tier> getTierListe() {
        return tierListe;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getKalorien() {
        return kalorien;
    }
}
