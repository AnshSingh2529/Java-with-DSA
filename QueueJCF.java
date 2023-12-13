import java.util.*;  //it is used for all java Library to implement.
public class QueueJCF {
    public static void main(String args[]){

    //Queue is a Interface that is why we cannot make an object..to implement..so that we use 
    //two types of implementation named as : ArrayDequeue and LinkedList...

        Queue<Integer> q = new LinkedList<>();    
        // Queue<Integer> q  = new ArrayDeque<>();

    //.offer() : method used to add element.
        q.offer(1);
        q.offer(2);
        q.offer(3);
        // q.add(1);
        // q.add(2);
        // q.add(3);
    // .poll() : method is used to remove the element from the front and return the value of removed element    

        int element = q.poll();
        System.out.println("Dequeued : " + element);

        int frontel = q.peek();
        System.out.println("Frontelement : " + frontel);

         while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    } 
}
