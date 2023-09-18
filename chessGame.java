public class chessGame {
    public static void main(String... args){
        String Board[][] = startGame();
        for(int i = 0; i < 8;i++){
            for(int x = 0; x < 8; x++){
                System.out.println("|" + Board[i][x] + "|");
            }
        }

    }
    public chessGame(String color){
        String playerColor;
        String aiColor
        if(color.equalsIgnoreCase("white") || color.equalsIgnoreCase("black"){
            playerColor = color;
            aiColor = color.equalsIgnoreCase("white") ? "black" : "white";
        }
    }
    public String[][] startGame(){
        String[] Pieces = {"Rk","Kt","Bp","Qn","Kg","Bp","Kt","Rk","Pn"};
        String[][] Board = new String[8][8];
        for(int row = 0;row < 8;row++){
            for(int col = 0; col < 8; col++){
                if(row == 0 || row == 7){
                        if(row == 0)
                            Board[row][col] = "\u001B[30m" + Pieces[col] + "\u001B[0m";
                        else if(row == 7)
                            Board[row][col] = "\u001B[37m" + Pieces[col] + "\u001B[0m";
                }
                else if(row == 1 || row == 6){
                    if(row == 1)
                        Board[row][col] = "\u001B[30 " + "P" + Pieces[8] + "\u001B[0m";
                    else if(row == 6)
                        Board[row][col] = "\u001B[37 " + "P" + Pieces[8] + "\u001B[0m";
                }
                else
                    Board[row][col] = "  ";
            }
        }
            return Board;
    }
}
