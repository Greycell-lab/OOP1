package Häuser;

import java.util.ArrayList;

public class Gebäude {
    private String adresse;
    private static ArrayList<Gebäude> gebäude = new ArrayList<>();
    public Gebäude(){
        gebäude.add(this);
    }
    public Gebäude(String adresse){
        gebäude.add(this);
        this.adresse = adresse;
    }
    public static void zeigeGebäudeListe(){
        System.out.println("Liste aller Gebäude");
        for(var x : gebäude) System.out.println("Adresse: " + x.adresse + "\n");
    }

    public String getAdresse() {
        return adresse;
    }
}
