import java.util.ArrayList;

public class Buch {
    private static final ArrayList<Buch> buchListe = new ArrayList<>();
    private final String title;
    private final ArrayList<Autor> autorListe = new ArrayList<>();
    public Buch(String title){
        this.title = title;
        buchListe.add(this);

    }
    public Buch(String title, Autor a){
        this(title);
        autorListe.add(a);
        a.getBuchListe().add(this);
        buchListe.add(this);
    }

    public ArrayList<Autor> getAutorListe() {
        return autorListe;
    }
    public String getTitle(){
        return title;
    }
    public void addAutor(Autor a){
        this.autorListe.add(a);
        a.getBuchListe().add(this);
    }

    public static ArrayList<Buch> getBuchListe() {
        return buchListe;
    }
}
