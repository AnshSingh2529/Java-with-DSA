public class Backtracking {
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }
    public static void backonarr(int arr[], int i , int val){
        //base case

        if(i == arr.length){
            printarr(arr);
            return;
        }
        //recurssion

        arr[i] = val;
        backonarr(arr,i+1,val+2); // function call step
        arr[i] = arr[i] - 2; // backtracking step
    }
    public static void Findsubsets(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        Findsubsets(str, ans+str.charAt(i), i+1);
        Findsubsets(str, ans, i+1);
    }
    public static void Findpermu(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            Findpermu(newstr, ans+curr);
        }
    }
    public static void main(String args[]){
        // int arr[] = new int[5];
        // backonarr(arr,0,2);
        // printarr(arr);
        String str = "abc";
        // Findsubsets(str,"", 0);
       // Findpermu(str, "");
    }
}
