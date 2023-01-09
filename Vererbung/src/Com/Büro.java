package Com;

import java.util.ArrayList;

public class Büro {
    public static ArrayList<Büro> büroListe = new ArrayList<Büro>();
    private final int nummer;
    private ArrayList<Computer> computerListe = new ArrayList<Computer>();
    public Büro(int nummer){
        this.nummer = nummer;
        büroListe.add(this);
    }

    public static ArrayList<Büro> getBüroListe() {
        return büroListe;
    }

    public ArrayList<Computer> getComputerListe() {
        return computerListe;
    }

    public int getNummer() {
        return nummer;
    }
}
