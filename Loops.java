
public class Loops {
    
    

    // public static void main(String args[]){
        // int counter =1;
        // while(counter<=10){
            // System.out.println("Ansh singh");
            // counter++;
        
            //  System.out.println(counter);
            //  counter++;


            // }

    // try(Scanner sc = new Scanner(System.in);){
    //     System.out.print("Enter n :");
    //     int n = sc.nextInt();
    //     int counter = 1;
    //     while(counter <= n){
    //         System.out.println( + counter);
    //         counter++;

    //         }
    //     }

    // try(Scanner sc = new Scanner(System.in)){
    //     System.out.print("Enter Range :");
    //         int i = 1;
    //         int sum = 0;
    //         int Range = sc.nextInt();
             
    //         while(i <= Range){
    //              sum +=i;
    //              i++;
    //         }
    //         System.out.println("Sum is : " + sum);

    //     }

    // for(int i = 0; i<=10; i++){
    //     System.out.println("Ansh singh");
    //}
      
    // for(int i = 1; i<=4; i++){
    //     System.out.println( "* * * *");
    // }

    // int n = 10899;
    // while(n > 0){
    //     int lastdigit = n % 10;  //for starting from lastdigit 
    //     System.out.print(lastdigit + " " );
    //          n = n/10;                //for remove the lastdigit   

    // }

    // int n = 10899;
    // int rev = 0;
    
    // while(n > 0){
    //     int lastdigit = n % 10;
    //         rev = (rev * 10) + lastdigit;
    //         n = n/10;
    //     }
    //     System.out.print(rev + " ");
    // }

    // int counter = 0;
    // do{
    //     System.out.println("Ansh singh");
    //     counter++;
    //     }while(counter <=10);


    // try(Scanner sc = new Scanner(System.in)){
    //     do{
    //         System.out.print("Enter the number :");
    //         int n = sc.nextInt();
    //             if(n % 10==0){
    //                 break;
    //             }
    //             System.out.println(n);
    //     }while(true);
    //     System.out.println("I am out of the Loop");
    // }

    // for(int i = 3; i<=5; i++){
    //     if(i==3){
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    // try(Scanner sc = new Scanner(System.in)){
    //     do{
    //         System.out.print("Enter the number :");
    //         int n = sc.nextInt();
    //             if(n % 10==0){
    //                 System.out.println("this will not print");
    //                 continue;
    //             }
    //             System.out.println(n);
    //         }while(true);
        
    //     }

    
    // try (Scanner sc = new Scanner(System.in)) {
    //     System.out.print(" Enter number :");
    //     int n = sc.nextInt();
    //     boolean isPrime = true;
    //     for(int i = 2; i <=Math.sqrt(n); i++){
    //         if(n % i ==0){
    //             isPrime = false;
    //         }
    //     }
    //         if(isPrime==true){
    //             System.out.println(n + " is Prime");

    //         }else{
    //             System.out.println( n + " is not Prime");
    //             }
    //         }

        // for(int i = 0; i<5; i++){
        //     System.out.println(" i is :" + i);
        // } 

        // Scanner sc = new Scanner(System.in);
        //    int choice;
        //     int evenSum = 0;
        //     int oddSum = 0;
        //     do{
        //         System.out.print("Enter the number :");
        //        int number = sc.nextInt();
        //         if(number % 2 ==0){
        //             evenSum+=number;
        //         }else{
        //             oddSum+=number;
        //         }
            
        //         System.out.println("want to continue press 1 for Yes or 0 for No");
        //         choice = sc.nextInt();
        //     }while(choice==1);

        // System.out.println("Sum of even " + evenSum);
       // System.out.println("Sum of odd " + oddSum);
            
        //  Scanner sc = new Scanner(System.in);
        //  System.out.print("Enter the number :");
        //  int n = sc.nextInt();
        //  int factorial = 1;
        //  for(int i= 1; i<=n; i++){
        //      factorial *= i;
           
        //  } System.out.println(factorial);
         

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number :");
        // int n = sc.nextInt();
        // int printTable;
        // for(int i = 1; i<=10; i++){
        //     printTable = n*i;
        //     System.out.println(n + " * " + i + " = " + printTable);
          

    //Hollow_rectangle

//public static void Hollow_rectangle(int trows ,int tcols){
//     for(int i = 1; i<=trows; i++){
//         for(int j = 1; j<=tcols; j++){
//             if(i==1 || i==trows || j==1 || j==tcols){
//                 System.out.print(" ~ ");
//             }else{
//                 System.out.print("   ");
//             }
//         }
//         System.out.println();
//     }
// }

    //Inverted pyramid.
    // public static void Invert_pyramid(int n){
    //     for(int i = 1; i<=n; i++){
    //         //outer Loop for spaces
    //         for(int j = 1; j<=n-i; j++){
    //             System.out.print(" ");
    //         }
    //         //inner Loop for star
    //         for(int j = 1; j<=i; j++){
    //             System.out.print("~");
    //         }
    //         System.out.println();
    //     }
        
    // }

    // public static void Inverted_py(int n){
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=n-i+1; j++){
    //             System.out.print(j);
    //         }
    //          System.out.println();

    //     }
       
    // }

    // public static void FLoydstriangle(int n ){
    //     int counter = 1;
    //     //outer Loop
    //     for(int i=1; i<=n; i++){
    //         //inner Loop
    //         for(int j=1; j<=i; j++){
    //             System.out.print(counter + " ");
    //             counter++;

    //         }
    //         System.out.println();
    //     }
    // }

    //0-1 trinagle

    // public static void o1triangle(int n){
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             if((i+j)%2==0){
    //                 System.out.print("1 ");
    //             }else{
    //                 System.out.print("0 ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void Butterfly_patt(int n){
    //     for(int i = 1; i<=n; i++){
    //         //Star
    //             for(int j = 1; j<=i; j++){
    //             System.out.print(" @ ");
    //         }
    //             //spaces
    //             for(int j = 1; j<=2*(n-i); j++){
    //                 System.out.print("   ");
    //             }
    //             //Star
    //             for(int j = 1; j<=i; j++){
    //                 System.out.print(" @ ");
    //             }   
    //             System.out.println();  
    //         }

    //     for(int i = n; i>=1; i--){
    //          //Star
    //             for(int j = 1; j<=i; j++){
    //             System.out.print(" @ ");
    //         }
    //             //spaces
    //             for(int j = 1; j<=2*(n-i); j++){
    //                 System.out.print("   ");
    //             }
    //             //Star
    //             for(int j = 1; j<=i; j++){
    //                 System.out.print(" @ ");
    //             }     
    //             System.out.println();
            
    //         }    
    //     }

    //Solid rhombus
    // public static void solid_rhombus(int n){
    //     for(int i= 1; i<=n; i++){
    //         //spaces
    //         for(int j = 1; j<=n-i; j++){
    //             System.out.print("  ");
    //         }
    //         //Star
    //         for(int j = 1; j<=n; j++){
    //             System.out.print(" @ ");
    //         }
    //         System.out.println();
    //     }
    // }

    // hollow rhombus
    // public static void hallow_rhombus(int n){
    //     for(int i = 1; i<=n; i++){
    //         //Spaces
    //         for(int j = 1; j<=n-i; j++){
    //             System.out.print("   ");
    //         }
    //         for(int j = 1; j<=n; j++){
    //             if(i==1||i==n||j==1||j==n){
    //                 System.out.print(" @ ");
    //             }else{
    //                 System.out.print("   ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //Daimond pattern

    // public static void Daimond_patt(int n){
    //     for(int i = 1; i<=n; i++){
    //         //spaces
    //         for(int j = 1; j<=n-i; j++){
    //             System.out.print("       ");
    //         }
    //         //Stars
    //         for(int j = 1; j<=(2*i)-1; j++){
    //             System.out.print("@@@@");
    //         }
    //         System.out.println();
    //     }
    //     for(int i = n; i>=1; i--){
    //         //Spaces
    //         for(int j = 1; j<=n-i; j++){
    //             System.out.print("        ");
    //         }
    //         //Stars
    //         for(int j = 1; j<=(2*i)-1; j++){
    //             System.out.print("@@@@");
    //         }
    //         System.out.println();

    //     }
    // }


        public static void main(String [] args){
           // Hollow_rectangle(5, 5);
            //Invert_pyramid(4);
            //Inverted_py(5);
            //FLoydstriangle(5);
            //o1triangle(5);
            //Butterfly_patt(20);
            //solid_rhombus(5);
            //hallow_rhombus(5);
            //Daimond_patt(10);
        }

    }
       
            
           
        
        
    
    





   



