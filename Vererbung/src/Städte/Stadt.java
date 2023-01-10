package Städte;

import java.util.ArrayList;

public class Stadt {
    public static ArrayList<Stadt> städte = new ArrayList<>();
    private int einwohnerzahl;
    private final String name;

    public Stadt(int einwohnerzahl, String name){
        this.einwohnerzahl = einwohnerzahl;
        this.name = name;
        städte.add(this);
    }

    public int getEinwohnerzahl() {
        return einwohnerzahl;
    }

    public void setEinwohnerzahl(int einwohnerzahl) {
        this.einwohnerzahl = einwohnerzahl;
    }

    public String getName() {
        return name;
    }
    public String istGroßstadt(){
        return einwohnerzahl >= 100000 ? "Stimmt!" : "Nein!";
    }
    public static void getStädteInfo(){
        for(var x : Stadt.städte) {
            System.out.println("Name: " + x.getName() + "\nEinwohnerzahl: " + x.getEinwohnerzahl() + "\nIst Großstadt: " + x.istGroßstadt());
            if(x instanceof Landeshauptstadt l) System.out.println("Adresse Landeshauptstadt: "+ l.getAdresse());
            System.out.println();
        }
    }
}
