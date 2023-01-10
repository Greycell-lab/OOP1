package Häuser;

public class Main {
    public static void main(String[] args){
        new Gebäude();
        new Gebäude("Am Scheideweg 5, 23558 Wurzhausen");
        new Villa();
        new Villa("Bergstraße 78, 50483 Schleimholzen");
        new Villa("Hauptstraße 11, 42395 Heimlichtuerei", 1500000);
        Gebäude.zeigeGebäudeListe();
        Villa.zeigeVillaListe();
    }
}
