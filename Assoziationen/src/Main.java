import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int x;
    public static void main(String[] args) {
        /*Person p1 = new Person(1, "Reiser");
        Person p2 = new Person(2, "Mister");
        Auto car1 = new Auto(1, "Volvo", p1);
        Auto car2 = new Auto(2, "Mercedes", p1);
        Auto car3 = new Auto(3, "Porsche", p2);
        Auto car = new Auto(4, "VW", p2);
        Auto.printList();*/

        //Aufgabe 1
        /*Interpret dJm = new Interpret("DJ M.");
        Song happyNewYear = new Song("Happy New Year", dJm);
        Song whatsUpMan = new Song("Whats Up Man", dJm);
        for(var x : dJm.songs) {
            System.out.println(x.interpret.name + " " + x.titel);
        }*/

        //Aufgabe 2
        /*Fach a = new Fach(1, "Java-Grundlagen");
        Fach b = new Fach(2, "Datenbankmodellierung und SQL");
        Klausur k1 = new Klausur(1, 3, a);
        Klausur k2 = new Klausur(2, 2, a);
        Klausur k3 = new Klausur(3, 1, b);
        boolean passed;
        do{
            try {
                System.out.println("1: Von Klausur zum Fach navigieren");
                System.out.println("2: von Fach zur Klausur navigieren");
                System.out.print("Wähle: ");
                x = Integer.parseInt(sc.nextLine());
                passed = true;
            }catch(NumberFormatException e){
                System.out.println("Fehlerhafte eingabe...");
                passed = false;
            }
        }while(!passed || x < 0 || x > 2);
        if(x == 1){
            do {
                try {
                    Klausur.printKlausur();
                    System.out.print("Klausur ID: ");
                    x = Integer.parseInt(sc.nextLine());
                    System.out.println("Fach: " + Klausur.list.get(x - 1).getFach().getBezeichnung());
                    passed = true;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Klausur nicht gefunden...");
                    passed = false;
                }
            }while(!passed);
            x = 1;
        }
        if(x == 2){
            do{
                try{
                    Fach.printFachList();
                    System.out.print("Fach ID: ");
                    x = Integer.parseInt(sc.nextLine());
                    Fach.getFachList().get(x-1).getList();
                    passed = true;
                }catch(IndexOutOfBoundsException e){
                    System.out.println("Fach nicht gefunden...");
                    passed = false;
                }
            }while(!passed);
        }*/

        //Aufgabe 3
        /*Tierart jaguar = new Tierart("Jaguar", 3.75);
        Tierart leopard = new Tierart("Leopard", 3.10);
        Tierart schaf = new Tierart("Schaf", 4.50);
        Tier j1 = new Tier(1, "Shira", jaguar);
        Tier j2 = new Tier(2, "Shari", jaguar);
        Tier l1 = new Tier(3, "Lopa", leopard);
        Tier s1 = new Tier(4, "Shaun", schaf);
        Gehege k = new Gehege(2);
        k.setArtListe(jaguar);
        k.setArtListe(leopard);
        k.addTier(j1);
        k.addTier(s1);
        k.addTier(l1);
        k.addTier(j2);
        k.getTierListe();
        System.out.println("Futtermenge gesamt für dieses Gehege: " + k.futtermengeGesamt());
*/
        //Aufgabe 4
        /*Buch freeze = new Buch("Freeze");
        Buch frooze = new Buch("The Frooze");
        Buch fraaze = new Buch("La Fraaze");
        Buch frllze = new Buch("Noi Frllze");
        Autor mcDonalds = new Autor("MC Donalds");
        Autor mcDinalds = new Autor("MC Selfidiot");
        Autor mcDenalds = new Autor("MC Morgan");
        mcDenalds.addBuch(freeze);
        mcDenalds.addBuch(frooze);
        mcDinalds.addBuch(frooze);
        mcDonalds.addBuch(fraaze);
        frllze.addAutor(mcDonalds);
        frooze.addAutor(mcDonalds);
        for(var x : Buch.getBuchListe()) {
            System.out.println();
            System.out.println("Buch: " + x.getTitle());
            System.out.println();
            System.out.println("Autor:");
            for(var y : x.getAutorListe()) System.out.println(y.getName());
        }
        System.out.println("--------------------------");
        for(var x : Autor.getAutorListe()){
            System.out.println();
            System.out.println("Autor: " + x.getName());
            System.out.println();
            System.out.println("Buch:");
            for(var y : x.getBuchListe()) System.out.println(y.getTitle());
        }*/

        //Aufgabe 5
        Ritter lanzelot = new Ritter();
        lanzelot.setName("Graf von Holzhausen");
        lanzelot.getPferd().setName("Lucy");
        Ritter graf = new Ritter("Prinz von Doppelkeks", "Schoko");
        for(var x : Ritter.getRitter()) System.out.println("Ritter: " + x.getName() + "\nPferd: " + x.getPferd().getName() + "\n");
        System.out.println();
        for(var x : Pferd.getPferde()) System.out.println("Pferd: " + x.getName() + "\nRitter: " + x.getBesitzer().getName() + "\n");
    }
}