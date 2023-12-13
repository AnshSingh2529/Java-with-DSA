

public class Gridways {
    public static int Countways(int i ,int j , int n , int m){
        if(i==n-1 && j==m-1){ //condition for last cell
            return 1;
        }else{
            if(i==n || j==m){ //condition for bundary cell
                return 0;
            }
        }
        //count waya

        int W1 = Countways(i+1 , j , n  ,m);
        int W2 = Countways(i , j+1 , n , m);
        
        return W1+ W2;
       
    }
    //Sudoko

    public static boolean Sudoko(int sudoko[][] , int row , int col){
        if(row == 9 ){  // base case
            return true;
        }

        int nextrow = row , nextcol = col+1;
        if(col+1 == 9){
            nextrow = row+1;
            nextcol = 0;
        }
        
        if(sudoko[row][col] != 0){     //any digit placed
            return Sudoko(sudoko, nextrow, nextcol);
        }

        for(int digit = 1; digit<=9; digit++){
            if(isSafe(sudoko,row,col,digit)){
               sudoko[row][col] = digit;
                if(Sudoko(sudoko, nextrow, nextcol)){
                    return true;
                }
            }
            sudoko[row][col] = 0;

        }
        return false;

    }
    public static boolean isSafe(int sudoko[][], int row, int col,int digit){
         //col
        for(int i = 0; i<=8; i++){
            if(sudoko[i][col] == digit){
                return false;
            }
        }
        //row
        for(int j = 0; j<=8; j++){
            if(sudoko[row][j] == digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoko[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printarr(int sudoko[][]){
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                System.out.print(sudoko[i][j] + "    ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        // int n=3,m=3;
        // System.out.println(Countways(0,0,n,m));
        int sudoko[][] = {{0,0,8,0,0,0,0,0,0},
           {4, 9, 0, 1, 5, 7, 0, 0, 2},
           {0, 0, 3, 0, 0, 4, 1, 9, 0},
           {1, 8, 5, 0, 6, 0, 0, 2, 0},
           {0, 0, 0, 0, 2, 0, 0, 6, 0},
           {9, 6, 0, 4, 0, 5, 3, 0, 0},
           {0, 3, 0, 0, 7, 2, 0, 0, 4},
           {0, 4, 9, 0, 3, 0, 0, 5, 7},
           {8, 2, 7, 0, 0, 9, 0, 1, 3}};

            if(Sudoko(sudoko, 0, 0)){
                System.out.println("Solution exists");
                printarr(sudoko);
            }
            else{
                System.out.println("Solution does not exists");
            }

    }
    
}
