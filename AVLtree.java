public class AVLtree {
    static class Node {
        int data , height;
        Node left ,Right;

         Node (int data){
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

// For calculating HEIGHT.
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        return root.height;
    }

    public static Node insertkey(Node root, int key){
// Checked the condition of root to insert.
        if(root == null){
            return new Node(key);
        }
        if(key < root.data){
            root.left = insertkey(root.left, key);
        }
        else if(key > root.data){
            root.Right = insertkey(root.Right, key); 
        }
        else{
            return root;   //Duplicate keys not allowed.
        }

        // Update root height
        root.height = 1 + Math.max(height(root.left), height(root.Right));

        // balance factor 
        int BF = balancefact(root);



    }
public static void main(String[] args) {
    
}

    
}