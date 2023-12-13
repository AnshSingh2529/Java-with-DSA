import java.util.ServiceConfigurationError;

public class bitmanipulation {
    //Question 1
    public static void oddoreven(int n){
        int bitmask = 1;
        if((n  & bitmask)==0){
            System.out.print( n + " : Even number");
        }
        else{
            System.out.println(n +" : odd number");
        }
    }
    //Getbit.
    public static int GetithBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    //Setbit.
    public static int Setithbit(int n , int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }
    //clearbit.
    public static int Clearbit(int n , int i){
        int bitmask = ~(1<<i);
       return n & bitmask;
    }
    
    //Update bit.
    public static int Updateithbit(int n ,int i ,int newbit){
        // if(newbit==0){
        //     return Clearbit(n,i);
        // } else{
        //     return Setithbit(n,i);
        // }

        n=Clearbit(n,i);
        int bitmask = newbit<<i;
        return n|bitmask;
    }
    //Clear i bits
    public static int clearibits(int n , int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int ClearbitsinRange(int n ,int i ,int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;  // 2^b = 1<<i-1
        int bitmask = a|b;
        return n & bitmask;
    }
    //check if number id power of two
    public static boolean ispowertwo(int n ){
        return (n & (n-1))==0;
    }
    //count det bit in a number
    public static int Countsetbit(int n ){
        int count = 0;
       while(n>0){
        if((n & 1) !=0){
            count++;
        }
        n = n>>1;
       }
        return count;
    }
    //Fast exponentiation
    public static int Fastexponentiation(int a , int n ){
        int ans = 1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        // oddoreven(3);
        // oddoreven(4);
       //System.out.println(GetithBit(10,3)); 
       // System.out.println(Setithbit(10,2));
       //System.out.println(Clearbit(10,1));
       //System.out.println(Updateithbit(10,2,1));
      // System.out.println(clearibits(15,2));
      //System.out.println(ClearbitsinRange(31,2,4));
      //System.out.println(ispowertwo(7));
      //System.out.println(Countsetbit(10));
     // System.out.println(Fastexponentiation(5,2));
    }
    
}
