import java.util.ArrayList;

public class Auto {
    private final int id;
    private final String marke;
    private Person besitzer;
    private static final ArrayList<Auto> autoListe = new ArrayList<>();
    public Auto(int id, String marke){
        this.id = id;
        this.marke = marke;
        autoListe.add(this);
    }
    public Auto(int id, String marke, Person person){
        this(id, marke);
        this.besitzer = person;
    }
    public int getId() {
        return id;
    }
    public String getMarke() {
        return marke;
    }
    public Person getBesitzer() {
        return besitzer;
    }
    public static void printList(){
        for(var x : autoListe) System.out.println(x.id + ": " + x.marke + " Besitzer: " + x.besitzer.getNachname());
    }
}
