                                // SINGLY LINKEDLIST....ONLY HAVE ([DATA / NEXT]) REFRENCE....

public class LinikedList {
    public static class Node{
        int data;
        Node next;
       public Node(int data){
        this.data = data;
        this.next = null;
       } 
    }
    public static Node head;
    public static Node tail;
    public static int size;



    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addmiddle(int idx , int data){
        if(idx == 0){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp= temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removefirst(){
        if(size == 0){
            System.out.println(" ll is empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size == 0){
            System.out.println(" ll is empty");
            return Integer.MAX_VALUE;
        }else if(size == 1){
            int val = tail.data;
            head = tail =  null;
            size = 0;
            return val;
        }
         Node prev = head;
        for(int i = 0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int Linearsearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head, key);
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deletenthfromend(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;
            return;
        }
        int i = 1;
        int itofind = sz-n;
        Node prev = head;
        while(i < itofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkpalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node mid = findmid(head);
         //2nd half reverse
        Node curr = mid;
        Node prev = null;         
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //check left == right

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // detecting a cycle

    public static boolean detectcycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true ;
            }
        }
        return false;
}
                // remove a cycle in LinkedList
    public static void removecycle(){
        Node slow = head;
        Node fast = head;

        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return ;
            }

        slow = head;   
        Node prev = null;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;  //last node == null
    }
    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node Mergesort(Node head){
        if( head == null || head.next == null){
            return head;
        }

        Node mid = getmid(head);
        Node righthead = mid.next;
        mid.next = null;

        Node newLeft = Mergesort(head);
        Node newRight = Mergesort(righthead);

        return merge(newLeft , newRight);
    }

    private Node merge(Node head1 , Node head2){
        Node mergell = new Node(-1);
        Node temp = mergell;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            
        }

        while(head1 != null){
            temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
        }
        return mergell.next;
    }
        //ZigZag LinkedList 

    public void zigzag(){
        // find mid 
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
        Node left = head;
        Node right = prev;
        Node nextL , nextR;
        // alt - merge
        while(left != null && right != null){
            nextL = left.next;
            left.next  = right;
            nextR = right.next;
            right.next = nextL;
            //Update
            right = nextR;
            left = nextL;

        }
    

    }

    public void Print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        LinikedList ll = new LinikedList();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.Print();
        // ll.head = ll.Mergesort(ll.head);
        // ll.Print();
        ll.zigzag();
        ll.Print();
        // head = new Node(1);
        // head.next = new Node(2);
        // head.next.next= new Node(3);
        // head.next.next.next =new Node(4);
        // head.next.next.next.next =new Node(5);
        // head.next.next.next.next = head.next;

        // System.out.println(detectcycle());
        // removecycle();
        // System.out.println(detectcycle());
        // LinikedList ll = new LinikedList();
        // ll.addfirst(2);
        // ll.addfirst(1);
        // ll.addlast(3);
        // ll.addlast(4);
        // ll.addlast(6);
        // ll.addlast(2);
        //ll.addmiddle(0, 0);
        
       // System.out.println("size of my LinkedList is = " + ll.size);
    //    ll.removefirst();
    //    ll.Print();

    //    ll.removelast();
    //    ll.Print();
    //    System.out.println(ll.size);
    //   System.out.println(ll.recsearch(3));
    //   System.out.println(ll.recsearch(10));
    // ll.reverse();
    // ll.Print();
    // ll.deletenthfromend(3);
    // ll.Print();
    // System.out.println(ll.checkpalindrome());
        
      
    }
}
