import java.util.ArrayList;
public class mergetwoBST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
            
        }
    }

public static void getInOrder(ArrayList<Integer> arr , Node root){
            if(root == null){
            return;
        }
        getInOrder(arr, root.left);
        arr.add(root.data);
        getInOrder(arr, root.right);
        }


public static Node createBST(ArrayList<Integer> arr, int st , int end){
        if(st > end){
        return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr.get(mid));

        root.left = createBST(arr, st, mid-1);
        root.right = createBST(arr, mid+1, end);
        return root;
        }


public static Node mergebst(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInOrder(arr1,root1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInOrder(arr2,root2 );

        int i=0 , j=0;
        ArrayList<Integer> finalarr = new ArrayList<>();

        while(i < arr1.size() && j < arr2.size() ) {
        if(arr1.get(i) <= arr2.get(j)){
        finalarr.add(arr1.get(i));
        i++;
        }else{
        finalarr.add(arr2.get(j));
        j++;
        }
        }

//After Comparision elements left are arranged..by this..

while(i < arr1.size()){
finalarr.add(arr1.get(i));
i++;
}
while(j < arr1.size()){
finalarr.add(arr2.get(j));
j++;
}

return createBST(finalarr, 0 , finalarr.size()-1);	
}

public static void preOrder(Node root){
if(root == null){
return;
}
System.out.print(root.data + " ");
preOrder(root.left);
preOrder(root.right);
}

public static void main(String args[]){
    Node root1 = new Node(2);
     root1.left = new Node(1);
     root1.right = new Node(4);


    Node root2 = new Node(9);
     root2.left = new Node(3);
     root2.right = new Node(12);
Node root = mergebst(root1 , root2);
preOrder(root);
}
}