import java.util.ArrayList;

public class Fuetterung {
    private static ArrayList<Fuetterung> fuetterungListe = new ArrayList<>();
    private double mengeInKg;
    private Tier tier;
    private Futter futter;
    public Fuetterung(double mengeInKg, Tier tier, Futter futter){
        this.mengeInKg = mengeInKg;
        this.tier = tier;
        this.futter = futter;
        fuetterungListe.add(this);
    }
}
