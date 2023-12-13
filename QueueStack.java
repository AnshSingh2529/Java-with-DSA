import java.util.Stack;   // Stack library ko implement kiya.
public class QueueStack {
    static class Queue{

// making Stack using JAVA COLLECTION FRAMEWORK...        
        static Stack<Integer> s1 = new Stack<>();
         static Stack<Integer> s2 = new Stack<>();

         public  boolean isEmpty(){   // check if s1 is empty.
            return s1.isEmpty();
         }

         public void add(int data){
            //Step 1.  with time Complexity O(n)

            while(!s1.isEmpty()){       // Stack s1 -> Stack s2 me dala.
                s2.push(s1.pop());
            }
            //Step 2.

            s1.push(data);             // Stack s1 me data ko add kiya.
            //Step 3.  with time complexity O(n).

            while(!s2.isEmpty()){      // firse Stack s2 -> Stack s1 me dala.
                s1.push(s2.pop());
            }
         }

         public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

           return s1.pop();
         }

         public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

             return s1.peek();
         }
    }
    
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
