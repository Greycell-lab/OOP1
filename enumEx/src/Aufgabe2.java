public class Aufgabe2 {
    enum IHK{
        SEHRGUT(92),
        GUT(81),
        BEFRIEDIGEND(67),
        AUSREICHEND(50),
        MANGELHAFT(30),
        UNGENUEGEND(0);
        final int punktzahl;
        IHK(int punktzahl){
            this.punktzahl = punktzahl;
        }
    }
    public static void zeigeNote(int punktzahl){
        System.out.println("Notenschlüssel");
        for(IHK x : IHK.values()) System.out.println(x + " Punkte: " + x.punktzahl);
        for(IHK x : IHK.values()){
            if(punktzahl >= x.punktzahl) {
                System.out.println();
                System.out.println("Erreichte Note: " + x + " mit " + punktzahl + " Punkten.");
                break;
            }

        }
    }

}
