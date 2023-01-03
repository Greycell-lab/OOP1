import java.util.ArrayList;

public class Tierart {
    public static ArrayList<Tierart> tierartList = new ArrayList<>();
    private String bezeichnung;
    private double futtermenge;
    public Tierart(String bezeichnung, double futtermenge){
        this.bezeichnung = bezeichnung;
        this.futtermenge = futtermenge;
        tierartList.add(this);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getFuttermenge() {
        return futtermenge;
    }

    public void setFuttermenge(double futtermenge) {
        this.futtermenge = futtermenge;
    }
}
