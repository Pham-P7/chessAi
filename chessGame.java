import java.io.BufferedReader; //import my input functions
import java.io.IOException;
import java.io.InputStreamReader;
public class chessGame {
    String Board[][];
    String playerColor, aiColor;
    public static void main(String... args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What piece color do you want? White or Black, White goes first");
        chessGame game = new chessGame(input.readLine()); //creates a game object of the chessGame class
        // System.out.println(game.whatColor("11"));
        game.printBoard();
        

    }
    public int whatColor(String index){ //return 1 if white, 2 if black, -1 if not valid index
        if(index.length() > 2){
            return -1;
        }
        int firstIndex = Integer.valueOf(index.charAt(0));
        int secondIndex = Integer.valueOf(index.charAt(1));
        if(this.Board[firstIndex][secondIndex].contains("\u001B[30m"))
            return 1;
        else if(this.Board[firstIndex][secondIndex].contains("\u001B[37m]"))
            return 2;
        return -1;
    }
    public void printBoard(){
        for(int i = 0;i < 8; i++){
            System.out.println("-------------------------");
            System.out.println("|" + String.join("|",this.Board[i]) + "|");
        }
        System.out.println("-------------------------");
    }
    public chessGame(String color){ //creates the board and assigns the colors
        Board = this.startGame();
        if(color.equalsIgnoreCase("white") || color.equalsIgnoreCase("black")){
            playerColor = color;
            aiColor = color.equalsIgnoreCase("white") ? "black" : "white";
        }
    }

    public String[][] startGame(){ //makes an empty game board
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

            }
        }
            return Board;
    }
}
