
public class Strings {
    // public static void printchar(String str){
    //     //(.length()  && .charAt()) in String.

    //     for(int i=0; i<str.length(); i++){
    //         System.out.print(str.charAt(i) + " ");
    //     }
    // }
    // //check if a String is palindrome...means (whoes original and reverse form are same).

    // public static boolean ispalindrome(String palindrome){
    //     int n = palindrome.length();
    //     for(int i = 0; i<palindrome.length()/2; i++){
    //         if(palindrome.charAt(i)==palindrome.charAt(n-1-i)){
    //             System.out.print("It is a palindrome");
    //             return true;
    //         }
    //     }
    //     System.out.print("It is not a palindrome");
    //     return false;
    // }

    // //Q2- find tha shortest path to reach destination.
    // public static double getshortestpath(String path){
    //     int x=0,y=0;
    //     for(int i = 0; i<path.length(); i++){
    //         char direction = path.charAt(i);
    //         //south
    //         if(direction == 'S'){
    //             y--;
    //         }//north
    //         else if(direction == 'N'){
    //             y++;
    //         }//west
    //         else if(direction == 'W'){
    //             x--;
    //         }
    //         else{
    //             x++;
    //         }
    //     }
    //     //Distance formula

    //     int x2= x*x;
    //     int y2 = y*y;
    //     //type caste (int) into (double)
    //     return (double)Math.sqrt(x2 + y2);
    // }
    // public static String Substring(String str, int  si,int ei){
    //     String substr = "";
    //     for(int i=si; i<ei; i++){
    //         substr += str.charAt(i);
    //     }
    //     return substr;

    // }
   
    
    // public static void main(String args[]){
    //     concatenation

    //     String firstname = "Ansh";
    //     String lastname = "Singh";
    //     String fullname = firstname  + " " + lastname;
    //     System.out.println(fullname);
    //     printchar(fullname);
    //     Scanner sc = new Scanner(System.in);
    //     String palindrome = sc.nextLine();
    //     ispalindrome(palindrome);
    //     String path = "NS";
    //     System.out.println(getshortestpath(path));

    //          String Compare.
    //     String s1 = "Ansh";
    //     String s2 = "Ansh";
    //     String s3 = new String("Ansh");
    //     if(s2.equals(s3)){
    //         System.out.println("Strings are equal");
    //     }
    //     else{
    //         System.out.println("Strings are not equal");
    //     }
    //         String str = "HelloWorld";
    //         System.out.println(str.substring(1,5));
    //         String fruits[]={"Apple","mango","banana"};
    //         String largest = fruits[0];
    //         for(int i = 1; i<fruits.length; i++){
    //             if(largest.compareTo(fruits[i]) < 0){
    //                 largest = fruits[i];
    //             }
    //         }
    //         System.out.println(largest);

    //                 StringBuilder form.
    //        StringBuilder sb = new StringBuilder("");
    //         for(char ch ='a'; ch<='z'; ch++){
    //             sb.append(ch);
    //         }
    //     System.out.println(sb);
    //     System.out.println(sb.length());
    // }
     
}
