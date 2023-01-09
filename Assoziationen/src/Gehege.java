import java.util.ArrayList;

public class Gehege {
    private ArrayList<Tierart> artListe = new ArrayList<>();
    private ArrayList<Tier> tierListe = new ArrayList<>();
    private int maxAnzahlDerTiere;
    public Gehege(int maxAnzahlDerTiere){
        this.maxAnzahlDerTiere = maxAnzahlDerTiere;
    }
    public boolean addTier(Tier t){
        if(artListe.contains(t.getArt()) && tierListe.size()<maxAnzahlDerTiere){
            tierListe.add(t);
            return true;
        }
        return false;
    }

    public void zeigeTierListe(){
        System.out.println("Tierliste");
        System.out.println("Name\tArt");
        for(var x : tierListe) System.out.println(x.getName() + "\t" + x.getArt());
    }
    public double futtermengeGesamt(){
        double gesamtMenge = 0;
        for(var x : tierListe) {
            gesamtMenge += x.getArt().getFuttermenge();
        }
        return gesamtMenge;
    }
    public void getTierListe() {
        System.out.println("Name\t");
        for(var x : tierListe) System.out.println(x.getName() + "\t" + x.getArt().getBezeichnung());
    }
    public void setArtListe(Tierart t){
        this.artListe.add(t);
    }
}
