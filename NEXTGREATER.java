import java.util.Stack;
public class NEXTGREATER {
    public static boolean isValid(String str){
        Stack<Character> s = new  Stack<>();
        
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if( ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='(' && ch==')') || (s.peek()=='[' && ch==']') 
                || (s.peek()=='{' && ch=='}') ){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isDublicate(String str ){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if((ch==')')){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true ;
                }
                else{
                   s.pop();
                }
            }
            else{
                s.push(ch);
            }
        }
        return false;
       
    }
    public static void MaxArea(int height[]){
        int maxarea = 0;
        int nsl[] = new int[height.length];
        int nrl[] = new int[height.length];

        //next small right
        Stack<Integer> s = new Stack<>();

        for(int i=height.length-1; i>=0; i--){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            } 
            if(s.isEmpty()){
                nrl[i] = height.length;
            }
            else{
                nrl[i] = s.peek();
            }
            s.push(i);
        }
        

        //next small left
        s= new Stack<>();
        
        for(int i=0; i<height.length; i++){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            } 
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        
        // current Area
        for(int i = 0; i<height.length; i++){
            int hight = height[i];
            int width = nrl[i]-nsl[i]-1;
            int area = hight * width;
            maxarea = Math.max(area, maxarea);
        } 
        System.out.println("my maxarea is =" + maxarea);
    }
    public static void main(String args[]){
    //     Stack<Integer> s = new Stack<>();
    //     int arr[] = {6,8,0,1,3};
    //     int nextgreater[] = new int[arr.length];

    //     for(int i=arr.length-1; i>=0; i--){
    //         //while loop
    //         while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
    //             s.pop();
    //         }
    //         //if condition
    //         if(s.isEmpty()){
    //             nextgreater[i] = -1;
    //         }
    //         else{
    //             nextgreater[i] = arr[s.peek()];
    //         }
    //         // 3 push in s
    //         s.push(i);
    //     }
    //     for(int  i = 0; i< nextgreater.length; i++){
    //         System.out.print(nextgreater[i] + "");
    //     }
    //     System.out.println();
            
    // String str = "({})[]";
    // String str = "((a+b))";
    // String str2 = "(a+b)";
    // System.out.println(isDublicate(str2));

    int height[] = {2,1,5,6,2,3};
    MaxArea(height);
    }

}
