import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Haus {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    public static ArrayList<Haus> hausListe = new ArrayList<>();
    public static ArrayList<Haus> gefundenListe = new ArrayList<>();
    static boolean finished;
    static int ID = 1;
    static int choose;
    static int z, zRange;
    static float q, qRange;
    static double p, pRange;
    int id;
    String bezeichnung;
    double preis;
    float qm;
    int zimmer;
    String getBezeichnung(){
        return this.bezeichnung;
    }
    int getID(){
        return this.id;
    }
    double getPreis(){
        return this.preis;
    }
    float getQm(){
        return this.qm;
    }
    int getZimmer(){
        return this.zimmer;
    }
    public static void hausListeAusgabe(){
        System.out.println();
        System.out.println("Gefundene Immobilien: ");
        System.out.println("ID\tBezeichnung\t\t\tPreis\t\tqm\t\tZimmer");
        for(var x : gefundenListe) {
            if(x.bezeichnung.length() < 16) System.out.println(x.id + ":\t" + x.getBezeichnung() + "\t\t" + String.format("%.02f", x.getPreis()) + "\t" + String.format("%.02f", x.getQm()) + "\t" + x.getZimmer());
            else System.out.println(x.id + ":\t" + x.getBezeichnung() + "\t" + String.format("%.02f", x.getPreis()) + "\t" + String.format("%.02f", x.getQm()) + "\t" + x.getZimmer());
        }
    }
    public static void fillList(){
        int x;
        for(int i=0; i<50; i++){
            x = rnd.nextInt(0, 5);
            switch(x){
                case 0 -> hausListe.add(new Appartement(rnd.nextFloat(40000, 80000), rnd.nextFloat(25, 80), 1, ID));
                case 1 -> hausListe.add(new Doppelhaushaelfte(rnd.nextFloat(400000, 600000), rnd.nextFloat(150, 300), rnd.nextInt(1, 11), ID));
                case 2 -> hausListe.add(new Einfamilienhaus(rnd.nextFloat(500000, 800000), rnd.nextFloat(150, 300), rnd.nextInt(1, 11), ID));
                case 3 -> hausListe.add(new Reiheneckhaus(rnd.nextFloat(400000, 800000), rnd.nextFloat(150, 300), rnd.nextInt(1, 11), ID));
                case 4 -> hausListe.add(new Reihenmittelhaus(rnd.nextFloat(400000, 600000), rnd.nextFloat(150, 300), rnd.nextInt(1, 11), ID));
            }
            ID++;
        }
    }
    public static void hausMenu(){
        System.out.println("Willkommen bei Imoogle");
        System.out.println("1: Suche über Preis, qm und Zimmer");
        System.out.println("2: Suche nur über Preis");
        System.out.println("3: Suche nur über Quadratmeter");
        System.out.println("4: Suche nur über Zimmeranzahl");
        do {
            try {
                System.out.print("Wähle: ");
                choose = Integer.parseInt(sc.nextLine());
                finished = true;
            }catch(NumberFormatException e){
                System.out.println("Etwas ist schief gelaufen. Versuche es erneut.");
                finished = false;
            }
        }while(!finished);
        switch(choose){
            case 1 -> fullSearch();
            case 2 -> preisSearch();
            case 3 -> qmSearch();
            case 4 -> zSearch();
            default -> System.out.println("Dies war keine Auswahlmöglichkeit. Versuche es erneut.");
        }
    }
    public static void preisEingabe(){
        do {
            try {
                System.out.print("Preis: ");
                p = Integer.parseInt(sc.nextLine());
                System.out.print("Preis Range: ");
                pRange = Integer.parseInt(sc.nextLine());
                finished = true;
            } catch (NumberFormatException e) {
                System.out.println("Etwas ist schief gelaufen. Versuche es erneut.");
                finished = false;
            }
        }while(!finished);
    }
    public static void qmEingabe(){
        do {
            try {
                System.out.print("Quadratmeter: ");
                q = Integer.parseInt(sc.nextLine());
                System.out.print("Quadratmeter Range: ");
                qRange = Integer.parseInt(sc.nextLine());
                finished = true;
            } catch (NumberFormatException e) {
                System.out.println("Etwas ist schief gelaufen. Versuche es erneut.");
                finished = false;
            }
        }while(!finished);
    }
    public static void zimmerEingabe(){
        do {
            try {
                System.out.print("Zimmer: ");
                z = Integer.parseInt(sc.nextLine());
                System.out.print("Zimmer Range: ");
                zRange = Integer.parseInt(sc.nextLine());
                finished = true;
            } catch (NumberFormatException e) {
                System.out.println("Etwas ist schief gelaufen. Versuche es erneut.");
                finished = false;
            }
        }while(!finished);
    }
    public static void fullSearch(){
        preisEingabe();
        qmEingabe();
        zimmerEingabe();
        for(var x : hausListe) if((p >= x.preis - pRange && p <= x.preis + pRange) && (q >= x.qm - qRange && q <= x.qm + qRange) && (z >= x.zimmer - zRange && z <= x.zimmer + zRange)) gefundenListe.add(x);
        hausListeAusgabe();
    }
    public static void preisSearch(){
        preisEingabe();
        for(var x : hausListe) if(p >= x.preis - pRange && p <= x.preis + pRange) gefundenListe.add(x);
        hausListeAusgabe();
    }
    public static void qmSearch(){
        qmEingabe();
        for(var x : hausListe) if(q >= x.qm - qRange && q <= x.qm + qRange) gefundenListe.add(x);
        hausListeAusgabe();
    }
    public static void zSearch(){
        zimmerEingabe();
        for(var x : hausListe) if(z >= x.zimmer - zRange && z <= x.zimmer + zRange) gefundenListe.add(x);
        hausListeAusgabe();
    }
}
