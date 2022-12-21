import java.sql.SQLOutput;
import java.util.Scanner;

public class Aufgabe3 {
    static Scanner sc = new Scanner(System.in);
    static int kyuGrad;
    static String guertelFarbe;
    static boolean finished = false;

    static
            /*
             *  Erstellen Sie ein Java-Programm, in dem Sie
             *  - den enum Kyu fortlaufend nummeriert { Braun = 1, Blau, Grün, OrangeGrün, Orange, GelbOrange, Gelb, WeißGelb, Weiß } einführen
             *  - dem Benutzer in einer Schleife eine Auswahl präsentieren
             *      - Kyu-Grad (1)
             *      - Gürtel-Farbe (2)
             *      - Nächste Prüfung (3)
             *  - Bei der ersten Auswahl gibt der Benutzer seinen Kyu-Grad (zwischen 1 und 9) ein und bekommt die Gürtelfarbe ausgegeben
             *  - Bei der zweiten Auswahl sollen dem Benutzer die möglichen Gürtelfarben ausgegeben werden.
             *      - anschließend gibt der Benutzer eine Farbe ein und bekommt den Kyu-Grad als Ausgabe.
             *  - Bei der dritten Auswahl sollen dem Benutzer wieder die möglichen Gürtelfarben ausgegeben werden.
             *      - Der Benutzer gibt seine aktuelle Gürtelfarbe ein und bekommt als Ausgabe die Farbe des nächsten Gürtels.
             *
             *  Hinweis: Kyu sind die Ränge in japanischen Kampfkünsten, hier speziell die Ränge des deutschen Judo-Bundes.
             *  Der höchste Rang ist der braune Gürtel (also der 1. Kyu) der niedrigste der weiße (der 9. Kyu).
             */
    enum Kyu {
        BRAUN(1),
        BLAU(2),
        GRUEN(3),
        ORANGEGRÜN(4),
        ORANGE(5),
        GELBORANGE(6),
        GELB(7),
        WEISSGELB(8),
        WEISS(9);
        final int id;

        Kyu(int id) {
            this.id = id;
        }
    }

    public static void abfrage() {
        for(var x : Kyu.values()) System.out.println("ID: " + x.id + " Bezeichnung: " + x);
        kyuGrad();
        guertelFarbe();
        naechsterGuertel();
    }
    public static void kyuGrad() {
        do {
            try {
                System.out.print("Kyu Grad: ");
                kyuGrad = Integer.parseInt(sc.nextLine());
                for (var x : Kyu.values()) {
                    if (x.id == kyuGrad) {
                        System.out.println(x);
                        break;
                    }
                }
                finished = true;
            } catch (Exception e) {
                System.out.println("Etwas ist schief gelaufen versuche es erneut.");
            }
        } while (!finished);
        finished = false;
    }
    public static void guertelFarbe(){
        do {
            try {
                System.out.print("Gürtelfarbe: ");
                guertelFarbe = sc.nextLine();
                Kyu a = Kyu.valueOf(guertelFarbe.toUpperCase());
                System.out.println("ID: " + a.id);
                finished = true;
            } catch (Exception e) {
                System.out.println("Etwas ist schief gelaufen versuche es erneut.");
            }
        }while(!finished);
        finished = false;
    }
    public static void naechsterGuertel(){
        do {
            try {
                System.out.println("Gürtelfarbe eingeben: ");
                guertelFarbe = sc.nextLine();
                Kyu b = Kyu.valueOf(guertelFarbe.toUpperCase());
                for (var x : Kyu.values()) {
                    if (x.id == b.id + 1) {
                        System.out.println("Nächste Gürtelfarbe: " + x);
                        break;
                    }
                    finished = true;
                }
            } catch (Exception e) {
                System.out.println("Etwas ist schief gelaufen versuche es erneut.");
            }
        }while(!finished);
        finished = false;
    }
}
