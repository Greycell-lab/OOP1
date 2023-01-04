import java.util.ArrayList;

public class Autor {
    private static final ArrayList<Autor> autorListe = new ArrayList<>();
    private final String name;
    private final ArrayList<Buch> buchListe = new ArrayList<>();
    public Autor(String name){
        this.name = name;
        autorListe.add(this);

    }
    public Autor(String name, Buch b){
        this(name);
        this.buchListe.add(b);
        b.getAutorListe().add(this);
        autorListe.add(this);
    }

    public String getName() {
        return name;
    }
    public void addBuch(Buch b){
        this.buchListe.add(b);
        b.getAutorListe().add(this);
    }

    public ArrayList<Buch> getBuchListe() {
        return buchListe;
    }

    public static ArrayList<Autor> getAutorListe() {
        return autorListe;
    }
}
