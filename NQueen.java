public class NQueen {
    public static boolean isSafe(char chessboard[][],int row, int col){
        //vertically upward

        for(int i = row-1; i>=0; i--){
            if(chessboard[i][col] == 'Q'){
                return false;
            }
        }
        // diagonally left

        for(int i = row-1,j = col-1; i>=0 && j >=0; i--,j--){
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        //diagonally right

        for(int i = row-1, j = col+1; i>=0 && j<chessboard.length; i--,j++){
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean NQueens( char chessboard[][] , int row){
        if(row == chessboard.length){
            //printboard(chessboard);
            count++;
            return true;
        }
        for(int j = 0; j<chessboard.length;j++){
            if(isSafe(chessboard,row,j)){
                chessboard[row][j] = 'Q';
            if(NQueens(chessboard,row+1)){      // for print only one solution
                return true;
            }
            chessboard[row][j] = 'X';
        
        }
            
    }
    return false;
        
}
    public static void printboard(char chessboard[][]){
        System.out.println("-------chessboard-------");
        for(int i = 0; i<chessboard.length; i++){
            for(int j = 0; j<chessboard.length; j++){
                System.out.print(chessboard[i][j]  +   "    ");
        }
        System.out.println();
    }
} 
static int count = 0;

        public static void main(String args[]){
            int n = 4;
            char chessboard[][] =  new char[n][n];
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n;j++){
                    chessboard[i][j] ='X';
                    
            }
        }
        ///check if solution is possible or not 

        if(NQueens(chessboard,0)){
            System.out.println("Solution is possible");
            printboard(chessboard);
        }else{
            System.out.println("Solution is not possible");
        }
        
        //System.out.println("Total number of ways to solve N queens problem = " + count);
        
    }
}


