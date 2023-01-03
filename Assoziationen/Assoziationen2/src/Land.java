import java.util.ArrayList;

public class Land {
    public static ArrayList<Land> landListe = new ArrayList<>();
    private ArrayList<Firma> firmaListe = new ArrayList<>();
    private String name;
    public Land(String name){
        this.name = name;
        landListe.add(this);
    }
    public void zeigeAlleFirmen(){
        System.out.println("Alle Firmen in " + this.name + ":");
        for(var x : this.firmaListe) {
            System.out.println(x.getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Firma> getFirmaListe() {
        return firmaListe;
    }
}
