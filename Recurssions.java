import java.util.*;
import java.util.function.DoubleToIntFunction;

import javax.print.attribute.standard.PrinterName;

public class Recurssions {

                         //print number in decreasing order.

    public static void Printdec(int n){
        if(n==1){
        System.out.print(n  +  " ");
            return ;
        }
        System.out.print(n+" ");
        Printdec(n-1);
        }

                         //print numbers in increasing order.

    public static void Printinc(int n){
        if(n==1){
        System.out.print(1 + " ");
            return;
        }
        Printinc(n-1);
        System.out.print(n+" ");
       
        }

                         // Print factorial of number n.
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
         int fac = factorial(n-1);
         int facn = n*factorial(n-1);
        return facn;
    }           
    
                         // Print the sum of first n natural number.

    public static int Sumfirstnatural(int n){
        if(n==1){
            return 1;
        }
        int fnat = Sumfirstnatural(n-1);
        int sfnat = n + Sumfirstnatural(n-1);
        return sfnat;
    }
     
                         // print Fibonacci series.

    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        
        int fibnm1 = Fibonacci(n-1);
        int fibnm2 = Fibonacci(n-2);
        int  fibn = fibnm1 + fibnm2;
        return fibn;
    }

                             // check if array is sorted or not.

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            System.out.println("Array is sorted : ");
            return true ;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        
         return isSorted(arr,i+1);
         

    }            
    
                                 //First Occurance check.

    public static int Firstoccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return Firstoccurance(arr, key, i+1);
    }

                             //Last Occurance.
                            
    public static int Lastoccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound = Lastoccur(arr, key, i+1);
        if(isfound == -1 && arr[i]==key){
            return i;
        }
        return isfound;
    }

                             //print x to the power n.
                             
    public static int XpowerN(int X,int N){
        if(N==0){
            return 1;
        }
        // int power = XpowerN(X, N-1);
        // int xpower = X;
        // return power*xpower;  //x*x^n-1==x^n thats why
        return X*XpowerN(X, N-1);
        
    }

                             //print x to the power n.OPTIMIZED.

    public static int Optimizedpower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpower = Optimizedpower(a, n/2);
        int halfpowersq  =  halfpower*halfpower;

        if(n % 2 != 0){
            halfpowersq = a*halfpowersq;
        }
        return halfpowersq;
    }

                             // tiling problem.

    public static int Tilingprob(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ver = Tilingprob(n-1);
        int hor = Tilingprob(n-2);
        int totalways = ver+hor;

        return totalways;
    }
    public static void Removedup(String str,int idx,StringBuilder newstr ,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){
            Removedup(str, idx+1, newstr, map);
        }else{
            map[currchar-'a'] = true;
            Removedup(str, idx+1, newstr.append(currchar), map);
        }
        
    }
    public static int Friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int single = Friendspairing(n-1);
        int pair =  n-1 * Friendspairing(n-2);
         
        return single + pair;
    }
    public static void PrintbinString(int n , String str,int lastplace){
        if(n==0){
            System.out.println(str);
            return;
        }
        PrintbinString(n-1, str+"0", 0);
        if(lastplace==0){
            PrintbinString(n-1, str+"1", 1);
        }
    }
                        
    public static void main(String args[]){
    
        //Printdec(n);
        //Printinc(n);
        //System.out.println( "Factorial of number " + n + " is : " + factorial(n));
        //System.out.println("Sum of first " + n + " natural number is  : " + Sumfirstnatural(n));
        //System.out.println("fibonacci series of " + n + " is : " + Fibonacci(n));
        //System.out.println(isSorted(arr,0));
        //System.out.println(Firstoccurance(arr,5, 0));
        //System.out.println(Lastoccur(arr, 5, 0));  
       // System.out.println(XpowerN(2, 31));
    // Scanner sc = new Scanner(System.in);
    //    System.out.print("a :");
    //     int a = sc.nextInt();
    //    System.out.print("n :");
    //     int n = sc.nextInt();
    //    System.out.println( a + " to the power " + n + " is : " + Optimizedpower(a,n));
    // System.out.println(Tilingprob(5));
    // String str = "aaannnsshhssiinngh";
    // Removedup(str, 0, new StringBuilder(""),  new boolean[26]);
     //System.out.println(Friendspairing(2));
     //PrintbinString(3,"",0);

    }

}
