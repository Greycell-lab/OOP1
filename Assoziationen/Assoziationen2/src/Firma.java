import java.util.ArrayList;

public class Firma {
    public static ArrayList<Firma> firmaListe = new ArrayList<>();
    private ArrayList<Land> landListe = new ArrayList<>();
    private ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    private String name;
    public Firma(String name){
        this.name = name;
        firmaListe.add(this);
    }
    public void zeigeAlleLaender(){
        System.out.println();
        System.out.println("Alle Länder in denen die Firma " + this.name + " vertreten ist:");
        for(var x : this.landListe) System.out.println(x.getName());

    }
    public void zeigeAlleMitarbeiter(){
        System.out.println();
        System.out.println("Alle Mitarbeiter die in der Firma " + this.name + " arbeiten:");
        for(var x : this.mitarbeiterListe) System.out.println(x.getName());
    }
    public String getName(){
        return name;
    }

    public ArrayList<Land> getLandListe() {
        return landListe;
    }

    public ArrayList<Mitarbeiter> getMitarbeiterListe() {
        return mitarbeiterListe;
    }
}
