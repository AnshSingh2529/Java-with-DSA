

public class Patterns {
    public static void main(String args[]){
        // for(int i = 1; i<=10; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(" ~ ");
        //     }
        //     System.out.println();
        // }
    // int n = 5;
    //     for(int i=1; i<=5; i++){
    //             System.out.print(" ~ ");
    //         }
    //         System.out.println();
    //     }

    
    // for(int i = 1; i<=5; i++){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    //     }

    int n = 4;
    char ch = 'A';
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(" "+ ch + " " );
            ch++;
        }System.out.println();
    }
    }
}
