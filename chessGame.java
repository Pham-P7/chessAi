import java.io.BufferedReader; //import my input functions
import java.io.IOException;
import java.io.InputStreamReader;
public class chessGame {
    final String redCode = "\u001B[31m";
    final String whiteCode = "\u001B[37m";
    final String resetCode = "\u001B[0m";
    final String[] Pieces = {"Rk","Kt","Bp","Qn","Kg","Bp","Kt","Rk","Pn"};
    String Board[][];
    String playerColor, aiColor;
    public static void main(String... args) throws IOException{ //main function for starting the game
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What piece color do you want? White or Red, White goes first");
        chessGame game = new chessGame(input.readLine()); //creates a game object of the chessGame class
        System.out.println(game.whatColor(1,1));
        game.printBoard();
        

    }
    public int whatColor(int... index){ //return 1 if white, 2 if red, -1 if not valid index or blank space
        if(index.length > 2){
            return -1;
        }
        if(this.Board[index[0]][index[1]].contains(redCode)) //contains red color code
            return 2;
        else if(this.Board[index[0]][index[1]].contains(whiteCode)) //contains white color code
            return 1;
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
        if(color.equalsIgnoreCase("white") || color.equalsIgnoreCase("red")){
            playerColor = color.toLowerCase();
            aiColor = color.equalsIgnoreCase("white") ? "red" : "white";
        }
    }

    public String[][] startGame(){ //makes an empty game board
        String[][] Board = new String[8][8];
        for(int row = 0;row < 8;row++){
            for(int col = 0; col < 8; col++){
                if(row == 0 || row == 7){
                    if(row == 0)
                        Board[row][col] = redCode + Pieces[col] + resetCode;
                    else if(row == 7)
                        Board[row][col] = whiteCode + Pieces[col] + resetCode;
                }
                else if(row == 1 || row == 6){
                    if(row == 1)
                        Board[row][col] = redCode + Pieces[8] + resetCode;
                    else if(row == 6)
                        Board[row][col] = whiteCode + Pieces[8] + resetCode;
                }
                else
                    Board[row][col] = "  ";
            }
        }
        return Board; // returns a fresh board
    }
}

