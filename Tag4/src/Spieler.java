import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Spieler {
    static Random rnd = new Random();
    private static int currentplayerIndexT1;
    private static int currentplayerIndexT2;
    private static Spieler currentPlayerT1;
    private static Spieler currentPlayerT2;
    private static final String[] T1 = {"Hugo Meier", "Susi Sorglos", "Fred Feuerstein", "Marie Müller"};
    private static final String[] T2 = {"Fritz Schaffner", "Walter Peters", "Sigrid Friendly", "Annemarie Hostein"};
    private String name;
    private int score = 0;
    private int wins = 0;
    private static int match = 1;
    private static char star = '*';
    private static int starlength;
    private static int starAfterNames;
    private static List<Spieler> team1 = new ArrayList<>();
    private static List<Spieler> team2 = new ArrayList<>();
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
                System.out.print("* " + currentPlayerT1.name + " Wins!");
                for(int i=0;i<starlength - starAfterNames-3; i++) System.out.print(" ");
                System.out.println("*");
                starAfterNames = currentPlayerT2.name.length() + 2;
                System.out.print("* " + currentPlayerT2.name + " Is out!");
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
                System.out.print("* " + currentPlayerT2.name + " Wins!");
                for(int i=0;i<starlength - starAfterNames-3; i++) System.out.print(" ");
                System.out.println("*");
                starAfterNames = currentPlayerT1.name.length() + 2;
                System.out.print("* " + currentPlayerT1.name + " Is Out!");
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
        System.out.println(currentPlayerT1.name + " VS " + currentPlayerT2.name);
        starlength = currentPlayerT1.name.length() + currentPlayerT2.name.length();
    }
    public static void matchStart() {
        do {
            initialiseGame();
        }while(currentPlayerT1.wins != 3 && currentPlayerT2.wins != 3);
    }
    public static void gameEngine()
    {
        while(!team1.isEmpty()&&!team2.isEmpty()) {
            Spieler.choosePlayers();
            Spieler.matchStart();
        }
    }
    public static void getWinner()
    {
        System.out.println();
        System.out.println("\t*************************");
        System.out.println(team1.isEmpty() ? "\t***Team 2 Wins***" : "\t***Team 1 Wins***");
        System.out.println("\t*************************");
    }
    public static void letsGo()
    {
        constructTeam();
        gameEngine();
        getWinner();
    }
}
