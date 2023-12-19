
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;


public class Functions {
    // public static int  printSum(int a , int b){
    //     int sum = a+b;
    //     return sum;
       
    // }
    // public static void swap(int a,int b){
    //     int temp = a;
    //     a=b;
    //     b=temp;
        
    //  System.out.println("a is " + a);
    //     System.out.println ("b is " + b);
        // }
        // public static int sum(int a ,int b ){
        //         return a+b;
        // }
        // public static float sum(float a,float b){
        //     return a+b;
        // }
        // public static boolean isPrime(int n){
          
        //     for(int i = 2; i<=n-1; i++){
        //         if(n % i==0){
        //            return false;
        //         }
        //     }
        //     return true;
        // } 

        // optimized function

//         if(n==2){
//             return true;
//         }
//         for(int i = 2; i<=Math.sqrt(n); i++){
//             if(n % i==0){
//                 return false;
               
//             }
                
//         }
//         return true;
            
//     }
//     public static void primesinRange(int n){
//         for(int i = 2; i<=n; i++){
//             if(isPrime(i)){
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
//     }
    
               
    
        
//     public static void main(String args[]){
//     //  int a = 5;
//     //  int b = 10;
//     //  swap(a,b);
//     //    System.out.println(sum(3,5)); 
//     //    System.out.println(sum(3,5));
//     //    System.out.println(sum(3.2f,4.8f));
//   primesinRange(17);
       
//    
        //binary to decimal

    // public static void bintodec(int binNum){
    //     int myNum = binNum;
    //     int pow = 0;
    //     int dec = 0;
    //     while(binNum > 0){
    //         int lastdigit = binNum % 10;
    //         dec = dec + (lastdigit*(int)Math.pow(2, pow));
    //         pow++;
    //         binNum= binNum/10;
    //     }
    //     System.out.println(" decimal of " + myNum + " is = " + dec);
    // }
    // public static void main(String [] args){
    //     bintodec(101);

    //     }

        //decimal to binary
    // public static void dectobin(int n){
    //     int  mynum = n;
    //     int pow = 0;
    //     int bin = 0;
    //     while(n > 0){
    //         int remainder = n % 2;
    //         bin = bin + (remainder * (int)Math.pow(10, pow));
    //         pow++;
    //         n = n/2;
    //     }
    //     System.out.println(" binary of "+ mynum + " = " + bin );
    // }

    // public static void main(String [] args){
    //     dectobin(7);
    // }

// Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to test your method

// public static void isEven(int sum){
//      Scanner sc = new Scanner(System.in);
//      System.out.print("Enter a : ");
//     int a = sc.nextInt();
//     System.out.print("Enter b : ");
//     int b = sc.nextInt();
//     sum  = a+b;    
//     if(sum % 2 ==0){ 
//          System.out.print("Sum is : " + sum + " = Even ");
        
//     }else{
//         sum  = a+b;
//         System.out.print("Sum is : " + sum + " = Odd ");
        
        
//         }
        
//     }

 //Number is a Pelindrome.
 
// public static void main(String [] args){
//    isEven(0);
    
//     }

// public static boolean isPelidrome(int number){
//     int pelindrome = number;
//     int rev = 0;
//     while(pelindrome > 0){
//         int lastdigit = pelindrome % 10;
//         rev = (rev*10)+ lastdigit;
//         pelindrome= pelindrome/10;
//         }
//         if(number == rev){
//             return true;
//         }
//         return false;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" Enter  number : ");
//         int pelindrome = sc.nextInt();
//         if(isPelidrome(pelindrome)){
//             System.out.println(" Number  " + pelindrome + "  is Pelindrome ");
//         }else{
//              System.out.println(" Number  " + pelindrome + "  is not Pelindrome ");
//         }
//     }


// public static int sumDigits(int n){
//     int sumofdigits = 0;
//     while(n > 0){
//         int lastdigit = n%10;
//         sumofdigits +=lastdigit;
//         n /= 10;
//     }
//     return sumofdigits;
// }
// public static void main(String [] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print(" Enter the integer : ");
//     int digit = sc.nextInt();
//     System.out.println("The sum is :  " + sumDigits(digit));
    

public static void main(String args[]){
    

    }
}


