package Häuser;

import java.util.ArrayList;

public class Villa extends Gebäude {
    private int preis;
    private static ArrayList<Villa> villen = new ArrayList<>();
    public Villa(){
        villen.add(this);
    }
    public Villa(String adresse){
        super(adresse);
        villen.add(this);
    }
    public Villa(String adresse, int preis){
        super(adresse);
        this.preis = preis;
        villen.add(this);
    }
    public static void zeigeVillaListe(){
        System.out.println("Liste aller Villen");
        for(var x : villen) System.out.println("Adresse: " + x.getAdresse() + "\nPreis: " + x.preis + "\n");
    }
}
