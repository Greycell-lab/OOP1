import java.util.Random;

public class Automat {
    static Random rnd = new Random();
    private int kontostand;
    public Automat(){
        kontostand = 1000;
    }
    public void abheben(int ab){
        if(kontostand-ab<0) System.out.println("Konto ist nicht gedeckt");
        else {
            kontostand += ab;
            System.out.println(-ab + " wurde abgehoben");
        }
        System.out.println("Aktueller Kontostand: " + kontostand);
    }
    public void einzahlen(int ein){
        kontostand += ein;
        System.out.println(ein + " wurde eingezahlt");
        System.out.println("Aktueller Kontostand: " + kontostand);
    }
    public void einzahlAbhebeVorgang(){
        int counter = 0;
        int betrag;
        do {
            betrag = rnd.nextInt(-100, 101);
            if(betrag > 0) einzahlen(betrag);
            else abheben(betrag);
            counter++;
        }while(counter < 100);
    }
}
