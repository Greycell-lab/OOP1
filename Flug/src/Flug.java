import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flug {
    String flugId;
    LocalDateTime abflugZeit;
    LocalDateTime ankunftZeit;
    float preis;
    int platzFrei;
    static List<Flug> fluege = new ArrayList<>();
    static List<Flug> gewaehlteFluege = new ArrayList<>();
    public Flug(String flugId, LocalDateTime abflugZeit, LocalDateTime ankunftZeit, float preis, int platzFrei){
        this.flugId = flugId;
        this.abflugZeit = abflugZeit;
        this.ankunftZeit = ankunftZeit;
        this.preis = preis;
        this.platzFrei = platzFrei;
    }
    static public void sucheFlug(LocalDateTime flugWunsch, int plaetze) {
        for(var x : fluege){
            if(x.abflugZeit.equals(flugWunsch) && x.platzFrei >= plaetze){
                x.platzFrei -= plaetze;
                gewaehlteFluege.add(x);
            }
        }
    }
    static public void ausgabeFlug(){
        System.out.println("Folgende flüge gefunden:");
        for(var x : gewaehlteFluege){
                System.out.println("ID: " + x.flugId);
                System.out.println("Abflugzeit: " + x.abflugZeit);
                System.out.println("Ankunftszeit: " + x.ankunftZeit);
                System.out.println("Preis: " + String.format("%.02f", x.preis));
                System.out.println("Plätze frei nach der Buchung: " + x.platzFrei);
        }
    }
}
