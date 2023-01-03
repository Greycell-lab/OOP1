import java.util.ArrayList;
import java.util.HashMap;

public class Warenkorb {
    private HashMap<Artikel, Integer> warenkorb = new HashMap<>();
    public void inDenWarenkorb(Artikel artikel, int anzahl){
        warenkorb.put(artikel, anzahl);
    }

    public HashMap<Artikel, Integer> getWarenkorb() {
        return warenkorb;
    }
    public double getSumme(){
        double summe = 0;
        for(var x : this.warenkorb.keySet()) summe += x.getVerkaufspreis() * warenkorb.get(x);
        return summe;
    }
}
