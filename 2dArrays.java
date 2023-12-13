public class 2dArrays {
    public static void Matrix(int matrix[][]){
        int matrix[][]=new int[4][3];
        int n = 4 , m = 3;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println(matrix[i][j] + " ");
            }
        }
        System.out.println();


    }
    
}
