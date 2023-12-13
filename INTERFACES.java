public class INTERFACES {
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        King k = new King();
        k.moves();
        Rook r = new Rook();
        r.moves();
        Pawn p = new Pawn();
        p.moves();
    }
    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
   public void moves(){
        System.out.println("QUEEN ->   up,right,left,down,daigonally..(in all five directions)");
    }
}
class King implements ChessPlayer{
   public void moves(){
        System.out.println("KING ->    up,right,left,down,daigonally..(by 1 step)");
    }
}
class Rook implements ChessPlayer{
   public void moves(){
        System.out.println("ROOK ->    up,rigt,left,down,");
    }
}
class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("PAWN ->    up..(by 1 or 2 steps)");
    }
}