import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Spieler {
    static Random rnd = new Random();
    public static int currentplayerIndexT1;
    public static int currentplayerIndexT2;
    public static Spieler currentPlayerT1;
    public static Spieler currentPlayerT2;
    public static String[] T1 = {"Hugo Meier", "Susi Sorglos", "Fred Feuerstein", "Marie Müller"};
    public static String[] T2 = {"Fritz Schaffner", "Walter Peters", "Sigrid Friendly", "Annemarie Hostein"};
    public String name;
    public int score = 0;
    public int wins = 0;
    static int match = 1;
    static char star = '*';
    static int starlength;
    static int starAfterNames;
    static List<Spieler> team1 = new ArrayList<>();
    static List<Spieler> team2 = new ArrayList<>();
    public Spieler(String name){

        this.name = name;
    }
    public static void initialiseGame()
    {
        if(currentPlayerT1.wins == 3)
        {
            currentPlayerT1.wins = 0;
            match = 1;
        }
        if(currentPlayerT2.wins == 3)
        {
            currentPlayerT2.wins = 0;
            match = 1;
        }
        if(rnd.nextInt(0,2) == 1) currentPlayerT1.score++;
        else currentPlayerT2.score++;
        if (currentPlayerT1.score == 6)
        {
            System.out.println("Match " + match + ":\t" + currentPlayerT1.score + " \t\t:\t\t " + currentPlayerT2.score);
            match++;
            currentPlayerT1.wins++;
            currentPlayerT1.score=0;
            if(currentPlayerT1.wins==3)
            {
                System.out.println();
                for(int i=0;i<starlength+4;i++) System.out.print(star);
                starAfterNames = currentPlayerT1.name.length() + 2;
                System.out.println();
                System.out.print("* " + currentPlayerT1.name + " WINS!");
                for(int i=0;i<starlength - starAfterNames-3; i++) System.out.print(" ");
                System.out.println("*");
                starAfterNames = currentPlayerT2.name.length() + 2;
                System.out.print("* " + currentPlayerT2.name + " IS OUT!");
                for(int i=0;i<starlength - starAfterNames-5; i++) System.out.print(" ");
                System.out.println("*");
                for(int i=0;i<starlength+4;i++) System.out.print(star);
                System.out.println();
                team2.remove(currentplayerIndexT2);
                System.out.println();
            }
        }
        if (currentPlayerT2.score == 6)
        {
            System.out.println("Match " + match + ":\t" + currentPlayerT1.score + " \t\t:\t\t " + currentPlayerT2.score);
            match++;
            currentPlayerT2.wins++;
            currentPlayerT2.score=0;
            if(currentPlayerT2.wins==3)
            {
                System.out.println();
                for(int i=0;i<starlength+4;i++) System.out.print(star);
                starAfterNames = currentPlayerT2.name.length() + 2;
                System.out.println();
                System.out.print("* " + currentPlayerT2.name + " WINS!");
                for(int i=0;i<starlength - starAfterNames-3; i++) System.out.print(" ");
                System.out.println("*");
                starAfterNames = currentPlayerT1.name.length() + 2;
                System.out.print("* " + currentPlayerT1.name + " IS OUT!");
                for(int i=0;i<starlength - starAfterNames-5; i++) System.out.print(" ");
                System.out.println("*");
                for(int i=0;i<starlength+4;i++) System.out.print(star);
                System.out.println();
                team1.remove(currentplayerIndexT1);
                System.out.println();
            }
        }
    }
    public static void constructTeam()
    {
        for(var x : T1) team1.add(new Spieler(x));
        for(var x : T2) team2.add(new Spieler(x));
    }
    public static void choosePlayers()
    {
        currentplayerIndexT1 = rnd.nextInt(0, team1.size());
        currentplayerIndexT2 = rnd.nextInt(0, team2.size());
        currentPlayerT1 = team1.get(currentplayerIndexT1);
        currentPlayerT2 = team2.get(currentplayerIndexT2);
        starlength = currentPlayerT1.name.length() + currentPlayerT2.name.length();
    }
    public static void gameStart() {
        do {
            initialiseGame();
        }while(currentPlayerT1.wins != 3 && currentPlayerT2.wins != 3);
    }
    public static void getWinner()
    {
        System.out.println();
        System.out.println("\t*************************");
        System.out.println(team1.isEmpty() ? "\t***Team 2 hat gewonnen***" : "\t***Team 1 hat gewonnen***");
        System.out.println("\t*************************");
    }
}
