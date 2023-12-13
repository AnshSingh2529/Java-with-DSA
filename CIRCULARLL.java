public class CIRCULARLL {
     static class Node{
        int data;
        Node next;   
        }

    static Node addtoempty(Node temp , int data){
        if( temp != null){
            return temp;
        }
        Node newnode = new Node();
        newnode.data = data;

        temp = newnode;
        newnode.next = temp;
        
        return temp;

        }
        static Node addFirst(Node temp , int data){
            if(temp == null){
                return addtoempty(temp,data);
            }
            Node newnode = new Node();
            newnode.data = data;
            newnode.next = temp.next;
            temp.next = newnode;
            
            return temp;
        }
        static Node addlast(Node temp , int data){
            if(temp == null){
                return addtoempty(temp,data);
            }
            Node newnode = new Node();
            newnode.data = data;
            newnode.next = temp.next;
            temp.next = newnode;
            temp = newnode;
            
            return temp;
        }

        static Node addafter(Node temp , int data , int item){
            if(temp == null){
                return temp;
            }
            Node newnode, p;
            p = temp.next;
            do {
                if(p.data == item){
                    newnode =new Node();
                    newnode.data = data;
                    newnode.next = p.next;
                    p.next = newnode;
                
                    if(p == temp)  
                        temp =newnode;
                        return temp;

                    
                     
                }
                p = p.next;

            }
                while(p != temp.next);
                System.out.print(item + " " + "the given Node is not present in the list");
                return temp;

            
        
    }
    static Node deleteNode(Node last , int key){
        if(last == null){
            return null;
        }
        if(last.data == key && last.next == last){
            last = null;
            return last;
        }

        Node temp = last , d = new Node();
        if(last.data == key){
            while(temp.next != last){
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp.next;
        }
        while(temp.next != last && temp.next.data != key){
            temp = temp.next;
        }
        if(temp.next.data == key){
            d = temp.next;
            temp.next = d.next;
        }
        return last;
}
    
    static void traverse(Node last) {
        Node p;
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        p = last.next;
        do {
            System.out.print(p.data + "->");
            p = p.next;
        }
        while (p != last.next);
    }

    

    public static void main(String args[]){
        Node temp = null;
        temp = addtoempty(temp , 4);
        temp = addFirst(temp , 3);
        temp = addFirst(temp , 2);
        temp = addFirst(temp , 1);
        temp = addlast(temp , 5);
        temp = addafter(temp,4,3);
        
         
        // traverse(temp);
        deleteNode(temp,4);
        traverse(temp);



    }
}