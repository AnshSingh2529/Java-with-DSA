

public class twoD{
//     public static boolean Search(int matrix[][] , int key){
//         for(int i = 0; i<matrix.length; i++){
//             for(int j = 0; j<matrix[0].length; j++){
//                if(matrix[i][j]==key){
//                 System.out.println( "key is found at coordinates : "+"(" + i + "," + j + ")");
//                 return true;
//                }
//             }  
//         }
//         System.out.println("key is not found");
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][]=new int[4][3];
//         int n=matrix.length;
//         int m=matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<m; j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<m; j++){
//                 System.out.print(matrix[i][j] + " ");
                
//             }
//             System.out.println();
//         }
//         Search(matrix,5);
//     }
        
    public static void Spiralmatrix(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j = startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for(int i = startrow + 1; i<=endrow; i++){
                System.out.print(matrix[i][endcol] + " ");
            }
            //bottom
            for(int j = endcol-1; j>=startcol; j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }
            //left
            for(int i = endrow-1; i>=startrow+1; i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();

}
public static int DaigonalSum(int matrix[][]){
    int sum = 0;
    //approach O(n^2)
    // for(int i = 0; i<matrix.length; i++){
    //     for(int j = 0; j<matrix.length; j++){
    //         if(i==j){
    //             sum+=matrix[i][j];
    //         }
    //         else if(i+j==matrix.length-1){
    //             sum+=matrix[i][j];
    //         }
    //     }
    // }

    //linear approach O(n)
    for(int i=0; i<matrix.length; i++){
        //ps
        sum+=matrix[i][i];
        //ss
        if(i!=matrix.length-1-i){
        sum+=matrix[i][matrix.length-1-i];
    }
}
    return sum;
}
    public static boolean Staircasesearch(int matrix[][],int key){
        int row = 0,col=matrix[0].length -1;
        while(row < matrix.length && col >=0){
            if(matrix[row][col] == key){
                System.out.print("key is found at : " + "("+ row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key is not found !");
        return false;
    }

    public static void main(String args[]){
       // int matrix[][]={{1,2,3,4},
                        // {5,6,7,8},
                        // {9,10,11,12},
                        // {13,14,15,16}};
        // Spiralmatrix(matrix);
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        Staircasesearch(matrix, 50);
        
        //System.out.println(DaigonalSum(matrix));
}

}
