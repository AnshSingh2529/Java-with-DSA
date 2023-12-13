import java.util.*;


public class DequeA {
    static class Stack{                         //we can implement both Stack and Queue...
        Deque<Integer> d = new LinkedList<>();
//Stack Functions...

    public void push(int data){
         d.addLast(data);
    }

    public int pop(){
        return d.removeLast();
    }

    public int peek(){
        return d.getLast();
    }
}
    static class Queue{

        Deque<Integer> d = new LinkedList<>();

        //Queues Functions..

    public void add( int data){
        d.addLast(data);
    }

    public int remove(){
        return d.removeFirst();
    }

    public int peek(){
        return d.getFirst();
    }
}


 public static void main(String args[]){
    // Deque<Integer> dq = new LinkedList<>();
    
    // //AddFirst
    // dq.addFirst(4);
    // dq.addFirst(3);
    // dq.addFirst(2);
    // dq.addFirst(1);
    // System.out.print(dq + " ");

    // //AddLast
    // dq.addLast(5);
    // System.out.print(dq + " ");

    // //RemoveFirst
    // dq.removeFirst();
    // System.out.print(dq + " ");

    // //RemoveLast
    // dq.removeLast();
    // System.out.print(dq + " ");

    // //getFirst
    // System.out.print("First el = " + dq.getFirst());

    // //getLast
    // System.out.print( "Last el = " + dq.getLast());

//Stack using Deque

    // Stack s = new Stack();

    // s.push(1);
    // s.push(2);
    // s.push(3);
    // s.push(4);

    // System.out.println("Peek = " + s.peek());
    // System.out.println(s.pop());
    // System.out.println(s.pop());
    // System.out.println(s.pop());
    // System.out.println(s.pop());

//Queue using Deque.

    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);

    System.out.println("Peek = " + q.peek());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());
    System.out.println(q.remove());



        }
    }  

