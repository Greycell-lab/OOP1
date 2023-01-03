import java.util.ArrayList;

public class Tier {
    private static ArrayList<Tier> tierListe = new ArrayList<>();
    private String art;
    private String name;
    private ArrayList<Futter> futterListe = new ArrayList<>();
    public Tier(String name, String art){
        this.name = name;
        this.art = art;
        tierListe.add(this);
    }
    public void addFutter(Futter futter){
        if(!this.futterListe.contains(futter)) this.futterListe.add(futter);
    }

    public static ArrayList<Tier> getTierListe() {
        return tierListe;
    }

    public ArrayList<Futter> getFutterListe() {
        return futterListe;
    }

    public String getArt() {
        return art;
    }

    public String getName() {
        return name;
    }
}
