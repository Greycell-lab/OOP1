import java.util.ArrayList;

public class Kuchen {
    private static final ArrayList<Kuchen> kuchenListe = new ArrayList<>();
    private final ArrayList<Kuchenstueck> kuchenstueckeListe = new ArrayList<>();
    public Kuchen(ArrayList<Integer> stuecke){
        if(stuecke.size()>0){
            kuchenListe.add(this);
            for(var x : stuecke) kuchenstueckeListe.add(new Kuchenstueck(x));
        }
        else System.out.println("Etwas ist schief gelaufen. Versuche es erneut.");
    }
    private int gesamtGewicht(){
        int gesamt = 0;
        for(var x : kuchenstueckeListe) gesamt += x.getGewicht();
        return gesamt;
    }
    public static void zeigeAlleKuchen(){
        for(var x : kuchenListe){
            System.out.println("Gesamtgewicht dieser Kuchen: " + x.gesamtGewicht());
            for(var y : x.kuchenstueckeListe) System.out.println("Stückgewicht: " + y.getGewicht());
            System.out.println();
        }
    }
}
