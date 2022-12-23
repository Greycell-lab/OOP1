import java.util.*;

public class Spieler {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    static boolean frage;
    static int aktieId = 1;
    List<Aktie> aktien = new ArrayList<>();
    HashMap<Aktie, Integer> aktienHashMap = new HashMap<>();
    float geld = 10000.00f;
    public void eineRunde(){
        for(var x : Aktie.values()){
            if(rnd.nextInt(0, 2) == 0) x.setWert(x.getWert()+(x.getWert()/100*x.getSchwankung()));
            else x.setWert(x.getWert()-(x.getWert()/100*x.getSchwankung()));
        }
    }
    public void aktieKaufenVerkaufen(){
        do {
            try{
                System.out.println("Dein Geld: " + String.format("%.02f", geld));
                System.out.println();
                System.out.println("1: Aktien kaufen\n2: Aktien verkaufen\n3: Abwarten");
                int x = Integer.parseInt(sc.nextLine());
                switch(x){
                    case 1 -> {
                        kaufeAktie();
                        frage = true;
                    }
                    case 2 -> {
                        verkaufeAktie();
                        frage = true;
                    }
                    case 3 -> frage = true;
                    default -> frage = false;
                }
            }catch(Exception e){
                System.out.println("Falsche Eingabe");
            }
        }while(!frage);
    }
    public void spielAblauf(){
        Ausgabe.aktienAusgabe();
        aktieKaufenVerkaufen();
        eigeneAktien();
        eineRunde();
    }
    public void eigeneAktien(){
        aktieId = 1;
        System.out.println();
        System.out.println("Eigene Aktien");
        for(var x : aktienHashMap.keySet()) {
            System.out.println(aktieId + "\t" + x + " " + x.getName() + "\t" + aktienHashMap.get(x));
            aktieId++;
        }
        System.out.println();
    }
    public void kaufeAktie(){
        do {
            try {
                System.out.print("Welche Aktie möchtest du kaufen: ");
                int aktienId = Integer.parseInt(sc.nextLine());
                System.out.print("Wieviele: ");
                int anzahl = Integer.parseInt(sc.nextLine());
                for (var x : Aktie.values()) {
                    if (aktienId == x.getId()) {
                        aktienHashMap.put(x, anzahl);
                        if(geld - x.getWert() * anzahl < 0) System.out.println("Nicht genug geld...");
                        else {
                            geld -= x.getWert() * anzahl;
                            System.out.println(anzahl + " " + x.getName() + " Aktien gekauft ");
                        }
                        frage = true;
                    }
                }
            } catch (Exception e) {
                System.out.println("Etwas ist schief gelaufen.");
                frage = false;
            }
        }while(!frage);
    }
    public void verkaufeAktie(){
        if(aktienHashMap.size()==0) System.out.println("Du hast keine Aktien zu verkaufen");
        else{
            try{
                int count = 0;
                eigeneAktien();
                System.out.println("Welche Aktie möchtest du verkaufen: ");
                int aktienId = Integer.parseInt(sc.nextLine());
                System.out.print("Wieviele: ");
                int anzahl = Integer.parseInt(sc.nextLine());
                for(var x : Aktie.values()){
                    for(var y : aktienHashMap.keySet()) {
                        count++;
                        if (count == aktienId && x.name().equals(y.name()) && aktienHashMap.get(y) > anzahl){
                            geld += x.getWert() * anzahl;
                            aktienHashMap.put(y, aktienHashMap.get(y)-anzahl);
                            System.out.println("Verkauft");
                            break;
                        }
                        else {
                            System.out.println("Nicht genug Aktien");
                        }
                    }
                }
            }catch(Exception e){
                System.out.println("Etwas ist schief gelaufen");
            }
        }
    }
}
