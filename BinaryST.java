import java.util.ArrayList;

public class BinaryST {
    static class Node{
        int data;
        Node left;
        Node right;

    Node(int data){
        this.data = data;
    }
    }
    // Function to insert the values in tree.

    public static Node insert(Node root , int val) {
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //  check left root 
            root.left = insert(root.left, val);
        } 
        else{
            // check right root
            root.right = insert(root.right,val);
        }
        
        return root;
    }

    // INORDER traversal 

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);    
        
    }
    //  SEARCH IN BINARY TREE

    public static Boolean Search (Node root , int key){   // time complexity if O(H).
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        if(root.data > key){
           return Search(root.left, key);
        }
        else{
           return Search(root.right, key);
        }
        
    }

//Delete a Node from a Binary search tree.

    public static Node Deletenode(Node root , int val){
        if(root.data < val){
            root.right = Deletenode(root.right,val);
        }
        else if(root.data > val){
            root.left = Deletenode(root.left , val);
        }

        else{
            // voila case 1 leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 single child
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null ){
                return root.left;
            }

            //case 3 two child

            Node IS = findinordersuccessor(root.right);
            root.data = IS.data;                // replace kr diya Root.data ko IS ke data se.
            root.right=Deletenode(root.right , IS.data);   //IS ke data ko dalete kr diya.
            
        }
        return root;
    }

    public static Node findinordersuccessor(Node root){
        while(root.left !=null){      // Inorder successor ko find kar rhe left side me jab tak koi node null se attach na ho.
            root=root.left;
        }
        return root;
    }

    // Print in range.
    public static void printinrange(Node root , int k1 , int k2){
        if(root == null){
            return;
        }

        if(root.data >=k1 && root.data <=k2){
            printinrange(root.left,k1,k2);
            System.out.print(root.data + " ");
            printinrange(root.right,k1,k2);
        }
        else if(root.data < k2){
            printinrange(root.left,k1,k2);
        }
        else{
            printinrange(root.right,k1,k2);
        }
    } 

    // Root to leaf

    public static void printpath(ArrayList<Integer>path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void roottoleaf(Node root , ArrayList<Integer>path){
        if(root == null){   //base case hamesha pahle likhen
            return;
        }
        path.add(root.data);
        if(root.right == null && root.left == null){
            printpath(path);
        }

        roottoleaf(root.left, path);
        roottoleaf(root.right, path);
        path.remove(path.size()-1);

    }

    public static boolean isValidbst(Node root , Node min,Node max){    //in starting the max and min's data is null.
    if(root == null){
        return true;
    }
    if(min != null && root.data <= min.data){
        return false;
    }
    else if(max != null && root.data >= max.data){
        return false;
    }
    return isValidbst(root.left, min, root) && isValidbst(root.right, root, max);

    }

// Main function
    public static void main(String args[]){
        int values[] = {3,5,6,8,10,11,12};

        Node root = null;
        for(int i=0; i<values.length; i++ ){
            root = insert(root , values[i]);
        }
        // inOrder(root);

        System.out.println();

    //    printinrange(root,5,12);
        
        // root = Deletenode(root,8);
        // System.out.println();
        // inOrder(root);

        // if(Search(root,1)){
        //     System.out.print("found key");
        // }
        // else{
        //     System.out.print("Key not found");
        // }

        // roottoleaf(root, new ArrayList<>());
        // if(isValidbst(root, null, null)){
        //     System.out.println("valid");
        // }
        // else{
        //     System.out.println("Not valid");
        // }
    }
}
