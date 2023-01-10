package Gehalt;

import java.util.ArrayList;
import java.util.Random;

public class Personal {
    private static final double umsatz = 500000;
    protected static double löhne;
    public static ArrayList<Personal> personal = new ArrayList<>();
    protected static Random rnd = new Random();
    protected double gehalt;
    public Personal(){
        personal.add(this);
    }
    @Override
    public String toString(){
        return "Gehalt: " + String.format("%.2f", this.gehalt) + "€";
    }
    public static void getAbrechnung(){
        for(var x : Personal.personal) {
            if(x instanceof Mitarbeiter m) System.out.println("Mitarbeiter Gehalt: " + x);
            if(x instanceof Vorgesetzter v) System.out.println("Vorgesetzter Gehalt: " + x);
            if(x instanceof Vorstandsvorsitzender vv) System.out.println("Vorstandsvorsitzender Gehalt: " + x);
        }
        System.out.println("Lohkosten: " + String.format("%.2f", Personal.löhne));
        System.out.println(getUmsatz());
        System.out.println(getGewinn());
    }
    public static String getUmsatz(){
        return "Umsatz: " + String.format("%.2f",umsatz) + "€";
    }
    public static String getGewinn(){
        return "Gewinn: " + String.format("%.2f",(umsatz - löhne)) + "€";
    }
}
