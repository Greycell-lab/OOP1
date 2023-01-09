package Com;

import java.util.ArrayList;

public abstract sealed class Computer permits Desktop, Notebook, Server {
    private final static ArrayList<Computer> computerListe = new ArrayList<>();
    private boolean zustand;
    private final String hersteller;

    Computer(boolean zustand, String hersteller) {
        this.zustand = zustand;
        this.hersteller = hersteller;
        computerListe.add(this);
    }

    public void setZustand() {
        zustand = !zustand;
    }

    public String getHersteller() {
        return hersteller;
    }

    public boolean getZustand() {
        return zustand;
    }

    public static ArrayList<Computer> getComputerListe() {
        return computerListe;
    }
}
