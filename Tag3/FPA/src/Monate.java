import java.util.Scanner;

public class Monate
{
    static String[] monate = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
    public static int getDays(int jahr)
    {
        int auswahl;
        Scanner sc = new Scanner(System.in);
        int i = 1;
        for(var x : monate)
        {
            System.out.println(i + ":" + x);
            i++;
        }
        System.out.print("Choose: ");
        auswahl = Integer.parseInt(sc.nextLine());
        if(auswahl == 2)
        {
            if(Schaltjahr.istSchaltjahr(jahr)) return 29;
            else return 28;
        }
        else if(auswahl < 6)
        {
            if(auswahl % 2 == 1) return 31;
            else return 30;
        }
        else if(auswahl>12)
        {
            System.out.println("Diesen Monat gibt es nicht!");
            return -1;
        }
        else {
            if(auswahl % 2 == 1) return 30;
            else return 31;
        }
    }
}