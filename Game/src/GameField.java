public class GameField {
    int x, y;
    int[][] field;
    GameField(int x, int y){
        this.x = x;
        this.y = y;
        this.field = new int[y][x];
    }
    void fillGameField()
    {
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                field[i][j] = 0;
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
