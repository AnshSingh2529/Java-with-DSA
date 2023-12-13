public class StackLL {
    public static class Node{
        int data; Node next;

         Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        static class Stacks{
            static Node head = null;

            //isEmpty
            public static boolean isEmpty(){
                return head == null;
            }

            //push
            public static void push(int data){
                Node newnode = new Node(data);

                if(isEmpty()){
                    head = newnode;
                    return;
                }

                newnode.next = head;
                head = newnode;
            }

            //pop
            public static int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }


             //peek
             public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
        }
    
    public static void main(String args[]){
            StackLL.Stacks.push(1);
            StackLL.Stacks.push(2);
            StackLL.Stacks.push(3);
            StackLL.Stacks.push(4);
            StackLL.Stacks.push(5);
        
        while(!StackLL.Stacks.isEmpty()){
            System.out.println(StackLL.Stacks.peek());
            StackLL.Stacks.pop();
        }

        


    }
}
