import java.util.*;

public class Kartenspiel {
    enum Kartentypen {
        ASS(11),
        KOENIG(10),
        DAME(10),
        BUBE(10),
        ZEHN(10),
        NEUN(9),
        ACHT(8),
        SIEBEN(7),
        SECHS(6),
        FUENF(5),
        VIER(4),
        DREI(3),
        ZWEI(2);
        final int wert;
        Kartentypen(int wert){
            this.wert = wert;
        }
    }
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static List<Kartentypen> kartenstapel = new ArrayList<>();
    static List<Spieler> mitspieler = new ArrayList<>();
    static String antwort;
    static boolean nochEine, question, bankFertig;
    int punktzahl;
    List<Kartentypen> hand = new ArrayList<>();

    public static void spielStart(){
        kartenstapelErstellen();
        mitspieler.add(new Spieler("Spieler"));
        mitspieler.add(new Spieler("Bank"));
        for(var x : mitspieler){
            System.out.println();
            System.out.println(x.name + " ist dran.");
            do {
                x.karteZiehen();
            }while(x.hand.size() < 2);
            do {
                System.out.println("Punkte: " + x.getPunktzahl());
                if(x.name.equals("Spieler")) x.nocheineKarte();
                else x.nocheineKarteBank();
                if(nochEine) x.karteZiehen();
                if(x.punktzahl > 21){
                    System.out.println("Das war wohl zu viel... "+ x.name + " hat verloren mit " + x.punktzahl + " Punkten.");
                    System.exit(0);
                }
            }while(nochEine);
        }
        if(mitspieler.get(0).punktzahl > mitspieler.get(1).punktzahl) System.out.println("Spieler hat gewonnen.");
        else System.out.println("Bank hat gewonnen.");
    }
    public static void kartenstapelErstellen(){
        for(int i=0;i<4;i++) kartenstapel.addAll(Arrays.asList(Kartentypen.values()));
        Collections.shuffle(kartenstapel);
    }
    public void karteZiehen(){
        this.hand.add(kartenstapel.get(0));
        System.out.println(kartenstapel.get(0) + " gezogen.");
        this.punktzahl += kartenstapel.get(0).wert;
        kartenstapel.remove(0);

    }
    public int getPunktzahl(){
        return this.punktzahl;
    }
    public void nocheineKarte(){
        do{
            try{
                System.out.println();
                System.out.print("Noch eine Karte? (j/n) ");
                antwort = sc.nextLine();
                if(antwort.equalsIgnoreCase("J")){
                    nochEine = true;
                    question = true;
                }
                else if(antwort.equalsIgnoreCase("N")){
                    nochEine = false;
                    question = true;
                }
            }
            catch(Exception e){
                System.out.println("Etwas ist schief gelaufen. Versuchs nochmal.");
                question = false;
            }
        }while(!question);
    }
    public void nocheineKarteBank(){
        if(this.punktzahl > mitspieler.get(0).punktzahl) nochEine = false;
        else {
            if (this.punktzahl < 10) nochEine = true;
            else if (this.punktzahl > 10 && this.punktzahl < 15) {
                nochEine = rnd.nextInt(0, 2) == 0;
            }
        }
    }
}
