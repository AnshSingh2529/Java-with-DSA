import java.util.*;


public class StackQueue {
   
        static class Stack{

            static Queue<Integer> q1 = new LinkedList<>();
            static Queue<Integer> q2 = new LinkedList<>();

            public boolean isEmpty(){
                return q1.isEmpty() && q2.isEmpty();
            }

            public void push(int data){
                if(!q1.isEmpty()){
                    q1.add(data);
                }
                else{
                    q2.add(data);
                }
            }

            public int pop(){
                if(isEmpty()){
                    System.out.println("empty stack");
                    return -1;
                }
                
                int top = -1;
                //case 1.
                if(!q1.isEmpty()){           // non emtpy Queue
                    while(!q1.isEmpty()){
                        top = q1.remove();
                        if(q1.isEmpty()){
                            break;
                        }
                        q2.add(top);
                    }
                }
                // case 2.
                    else{
                        while(!q2.isEmpty()){
                            top = q2.remove();
                            if(q2.isEmpty()){
                                break;
                            }
                            q1.add(top);
                        }

                    }
                    return top;
                }

                public int peek(){    //similar as pop() function only there is not break wala case.
                     if(isEmpty()){
                    System.out.println("empty stack");
                    return -1;
                }
                
                int top = -1;

                if(!q1.isEmpty()){           // non emtpy Queue
                    while(!q1.isEmpty()){
                        top = q1.remove();
                        q2.add(top);
                    }
                }
                    else{
                        while(!q2.isEmpty()){
                            top = q2.remove();
                            q1.add(top);
                        }

                    }
                    return top;
                }
            }

    public static void firstnonrep(String str){
        int freq[] = new int[26];   //'a'->'z';

        Queue<Character> q = new LinkedList<>();
//sare indexes pr run kr ke element ko save krna "ch" variable ke ander aur fir frequency calculate krke freq ko precees krte rhna.
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;          //calculate frequency
        

        while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
            q.remove();
        }

            if(q.isEmpty()){
                System.out.print(-1 + "");
            }
            else{
                System.out.print(q.peek());
            }
        }
            System.out.println();
    }

    public static void interleave(Queue<Integer> q){
        Queue<Integer> Firsthalf = new LinkedList<>();

        int size = q.size();

        for(int i = 0; i<size/2; i++){
            Firsthalf.add(q.remove());
        }

        while(!Firsthalf.isEmpty()){
            q.add(Firsthalf.remove());
            q.add(q.remove());
        }

    }
    public static void main(String args[]){
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }


        // String str = "aabbccxb";
        // firstnonrep(str);

        Queue<Integer> q = new LinkedList<>();
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         q.add(6);
         q.add(7);
         q.add(8);
         q.add(9);
         q.add(10);
         interleave(q);

         while(!q.isEmpty()){
            System.out.print("[" + q.remove() + "" + "]");
         }
         System.out.println();

    }
}


