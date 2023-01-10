package AufgabeEins;

import java.util.Random;

public class Raum {
    private static Random rnd = new Random();
    private static Raum[] raeume = new Raum[45];
    private int belegungszahl;
    public Raum(int belegungszahl){
        this.belegungszahl = belegungszahl;

    }
    public static void fillArray(){
        for(int i=0;i<45;i++) raeume[i] = new Raum(rnd.nextInt(10, 20));
    }
    public static Raum[] getArray(){
        return raeume;
    }
    public int getBelegung(){
        return belegungszahl;
    }
    public static void getBelegung(Raum[] raueme){
        Raum temp;
        for(int n=raueme.length;n>0;n--){
            for(int i=0;i<n-1;++i){
                if(raueme[i].belegungszahl > raueme[i+1].belegungszahl) {
                    System.out.println(objektVergleich(raueme[i], raueme[i+1]));
                    temp = raeume[i];
                    raueme[i] = raueme[i+1];
                    raueme[i+1] = temp;

                }
            }
        }
    }
    public static int objektVergleich(Raum a, Raum b){
        return Integer.compare(a.belegungszahl, b.belegungszahl);
    }
}
