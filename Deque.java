import java.util.*;

public class Deques {

    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();

        //Add
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        System.out.println(dq);

    }
}
