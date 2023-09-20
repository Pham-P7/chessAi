public class Pieces {
final String redCode = "\u001B[31m"; //all required variables
final String whiteCode = "\u001B[37m";
final String resetCode = "\u001B[0m";
String color;
String type;
public Pieces(String piece){
    if(piece.contains(redCode))
        this.color = "red";
    else if(piece.contains(whiteCode))
        this.color = "white";
    else
        this.color = null;
    
}
}
