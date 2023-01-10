package Gehalt;

public class Main {
    public static void main(String[] args) {
        for(int i=0;i<20;i++) new Mitarbeiter();
        for(int i=0;i<5;i++) new Vorgesetzter();
        for(int i=0;i<2;i++) new Vorstandsvorsitzender();
        Personal.getAbrechnung();
    }
}
