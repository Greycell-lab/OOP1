import java.util.ArrayList;

public class Mitarbeiter {
    public static ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    private String name;
    private Firma firma;
    public Mitarbeiter(String name, Firma firma){
        this.name = name;
        this.firma = firma;
        mitarbeiterListe.add(this);
        firma.getMitarbeiterListe().add(this);

    }
    public void zeigeNameUndFirma(){
        System.out.println("Name: " + this.name + " Firma: " + this.firma.getName());
    }
    public String getName() {
        return name;
    }
}
