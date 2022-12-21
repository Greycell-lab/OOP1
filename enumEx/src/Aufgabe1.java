import java.util.Scanner;

public class Aufgabe1 {
    enum AUSWAHL{
        JA, NEIN, VIELLEICHT
    }
    public static void abfrage() {
        AUSWAHL[] auswahl = AUSWAHL.values();
        System.out.println("Magst du Pizza?");
        for (var x : auswahl) System.out.println(x);
        String question = new Scanner(System.in).nextLine();
        try{
            AUSWAHL a = AUSWAHL.valueOf(question.toUpperCase());
            switch(a){
                case JA -> System.out.println("Gut ich auch!");
                case NEIN -> System.out.println("Das ist aber schade...");
                case VIELLEICHT -> System.out.println("Vielleicht irgendwann!");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Dies war keine Auswahlmöglichkeit");
        }
    }
}
