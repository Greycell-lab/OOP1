public class Main {
    public static void main(String[] args) {
        System.out.println();
        Spieler.constructTeam();
        while(!Spieler.team1.isEmpty()&&!Spieler.team2.isEmpty()) {
            Spieler.choosePlayers();
            System.out.println(Spieler.currentPlayerT1.name + " VS " + Spieler.currentPlayerT2.name);
            Spieler.gameStart();
        }
        Spieler.getWinner();
    }
}