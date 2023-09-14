public class chessGame {
    public static void main(String... args){
        String Board[][] = startGame();
        for(int i = 0;i < 8;i++){
            System.out.println(Board[i][1]);
        }

    }
    public static String[][] startGame(){
        String[] backRow = {"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"};
        String[][] Board = new String[8][8];
        for(int row = 0;row < 8;row++){
            for(int col = 0; col < 8; col++){
                if(row == 0 || row == 7){
                    Board[row][col] = backRow[col];
                }
                else if(row == 1 || row == 6){
                    Board[row][col] = "Pawn";
                }
                else{
                    Board[row][col] = "  ";
                }
            }
        }
        return Board;
    }
}
