import java.util.*;

public class Kartenspiel {
    static final String RED = "\u001b[31m";
    static final String RESET = "\u001b[0m";
    static final String BLUE = "\u001b[34m";
    static final String YELLOW = "\u001b[33m";
    enum Kartentypen {
        ASS(11),
        KÖNIG(10),
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
    static boolean nochEine, question, spielende;
    int punktzahl;
    List<Kartentypen> hand = new ArrayList<>();

    public static void spielStart(){
        kartenstapelErstellen();
        mitspieler.add(new Spieler("Spieler"));
        mitspieler.add(new Spieler("Bank"));
        for(var x : mitspieler){
            System.out.println();
            System.out.println(BLUE + x.name + " ist dran." + RESET);
            do {
                x.karteZiehen();
            }while(x.hand.size() < 2);
            do {
                if(x.punktzahl == 21) {
                    nochEine = false;
                    spielende = true;
                }
                if(x.name.equals("Spieler")) x.nocheineKarte();
                else x.nocheineKarteBank();
                if(nochEine) x.karteZiehen();
                if(x.punktzahl > 21){
                    System.out.println(RED + "Das war wohl zu viel...\n"+ x.name + " hat verloren mit " + x.punktzahl + " Punkten.");
                    nochEine = false;
                    spielende = true;
                }
            }while(nochEine);
            if(spielende) break;
        }
        if(mitspieler.get(0).punktzahl > mitspieler.get(1).punktzahl && mitspieler.get(0).punktzahl <=21) System.out.println("Spieler hat gewonnen mit "+ mitspieler.get(0).punktzahl + " Punkten");
        else if(mitspieler.get(1).punktzahl > mitspieler.get(0).punktzahl && mitspieler.get(1).punktzahl <=21)System.out.println("Bank hat gewonnen mit " + mitspieler.get(1).punktzahl + " Punkten.");
    }
    public static void kartenstapelErstellen(){
        for(int i=0;i<4;i++) kartenstapel.addAll(Arrays.asList(Kartentypen.values()));
        Collections.shuffle(kartenstapel);
    }
    public void karteZiehen(){
        this.hand.add(kartenstapel.get(0));
        System.out.println(YELLOW);
        System.out.println(" --------- ");
        if(kartenstapel.get(0).wert < 10) System.out.println("| " + kartenstapel.get(0).wert + "       |");
        else{
            if(kartenstapel.get(0) == Kartentypen.ZEHN) System.out.println("| " + kartenstapel.get(0).wert + "      |");
            else if(kartenstapel.get(0) == Kartentypen.BUBE || kartenstapel.get(0) == Kartentypen.DAME) System.out.println("| " + kartenstapel.get(0) + "    |");
            else if(kartenstapel.get(0) == Kartentypen.KÖNIG)System.out.println("| " + kartenstapel.get(0) + "   |");
            else System.out.println("| " + kartenstapel.get(0) + "     |");
        }
        System.out.println("|         |");
        System.out.println("|         |");
        if(kartenstapel.get(0).wert < 10) System.out.println("|       " + kartenstapel.get(0).wert + " |");
        else{
            if(kartenstapel.get(0) == Kartentypen.ZEHN) System.out.println("|      " + kartenstapel.get(0).wert + " |");
            else if(kartenstapel.get(0) == Kartentypen.BUBE || kartenstapel.get(0) == Kartentypen.DAME) System.out.println("|    " + kartenstapel.get(0) + " |");
            else if(kartenstapel.get(0) == Kartentypen.KÖNIG)System.out.println("|   " + kartenstapel.get(0) + " |");
            else System.out.println("|     " + kartenstapel.get(0) + " |");
        }
        System.out.println(" --------- " + RESET);
        if(kartenstapel.get(0) == Kartentypen.ASS && this.punktzahl > 10) this.punktzahl += 1;
        else this.punktzahl += kartenstapel.get(0).wert;
        kartenstapel.remove(0);

    }
    public int getPunktzahl(){
        return this.punktzahl;
    }
    public void nocheineKarte(){
        do{
            try{
                System.out.println();
                System.out.print(BLUE + "Noch eine Karte? (j/n) " + RESET);
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
            if (this.punktzahl <= 10) nochEine = true;
            else if (this.punktzahl < 20) {
                if(mitspieler.get(0).punktzahl >= this.punktzahl) nochEine = true;
                else nochEine = rnd.nextInt(0, 2) == 0;
            }
        }
    }
}
