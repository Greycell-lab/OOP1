public class Main {
    public static void main(String[] args) {
        System.out.println();
        Spieler.constructTeam();
        while(!Spieler.team1.isEmpty()&&!Spieler.team2.isEmpty()) {
            Spieler.choosePlayers();
            Spieler.gameStart();
        }
        Spieler.getWinner();
    }
}