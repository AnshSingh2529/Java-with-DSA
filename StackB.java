import java.util.ArrayList;
public class StackB {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        //isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //Push
        public void Push(int data ){
            list.add(data);
        }

        //Pop
        public static int Pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //Peek
        public static int Peek(){
             if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.Push(1);
        s.Push(2);
        s.Push(3);
        s.Push(4);

        while(!StackB.Stack.isEmpty()){
            System.out.println(StackB.Stack.Peek() +" ");
            StackB.Stack.Pop();
        }
    }
}
