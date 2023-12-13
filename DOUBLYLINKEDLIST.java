                             //DOUBLY LINKEDLIST ..HAVE(DATA / NEXT (REF) / PREV (PREVIOUS RECORD))..
public class DOUBLYLINKEDLIST {
    public  class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        
    }

    public static Node head;
    public static Node tail;
    public static int size;

    
    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
        // newnode me head ka data assign krna

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    } 


    public void addlast(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }
       Node prev = head;
        tail.next = newnode;
        tail = newnode;
        prev = newnode;
    }

    
    public int removefirst(){
        if(size == 0){
            System.out.print("dll is empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    } 



    public int removelast(){
    if(size == 0){
            System.out.print("dll is empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;    
        }    
        Node prev = head;
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        tail = tail.next;
        prev.next = null;
        size--;
        return val;
    }


    public void reversedll(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }



    public static void Print(){
        Node temp = head;
        System.out.print("null" + "<<->>");
        while(temp != null){
            System.out.print(temp.data + "<<->>");
            temp = temp.next;
        }
        System.out.println("null");

    }
   

    public static void main(String args[]){
        DOUBLYLINKEDLIST dll = new DOUBLYLINKEDLIST();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.addlast(6);
        dll.addlast(7);
        dll.addlast(8);
        dll.addlast(9);

        dll.Print();

        System.out.println(dll.size);

        dll.reversedll();
        dll.Print();
        // dll.removefirst();
        // dll.removelast();
        
        

    }
}
