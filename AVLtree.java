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

// Balance Factor.
    public static int balancefact(Node root){
        if(root == null){
            return 0;
        }
        return height(root.left) - height(root.Right);
    }

// Rotate Right
    public static Node rotateLeft(Node x){
        // Initialise x & y
        Node y = x.Right;
        Node T2 = y.left;
        
        // Perform Rotation
        y.left = x;
        x.Right = T2;

        // Update Height
        x.height = Math.max(height(x.left), height(x.Right)) + 1;
        y.height = Math.max(height(y.left), height(y.Right)) + 1;

        return y; // new root of balanced AVL now
    }

// Rotate Left
    public static Node rotateRight(Node y){
        Node x = y.left;
        Node T2 = x.Right;

        // Perform Rotation
         x.Right = y;
         y.left = T2;

        // Update Height
        y.height = Math.max(height(y.left), height(y.Right)) + 1;
        x.height = Math.max(height(x.left), height(x.Right)) + 1;

        return x; // new root of balanced AVL now
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

        // Left-Left Case
        if(BF > 1 && key < root.left.data){
            return rotateRight(root);
        }
        // Right-Right Case
        if(BF < -1 && key > root.Right.data){
            return rotateLeft(root);
        }
        // Left-Right Case
        if(BF > 1 && key > root.left.data){
            root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        // Right-Left Case
        if(BF < -1 && key < root.Right.data){
            root.Right = rotateRight(root.Right);
            return rotateLeft(root);
        }

        return root;
    }

    // PreOrder 

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.Right);
        

    }

    public static void main(String[] args) {
    root = insertkey(root, 10);
    root = insertkey(root, 20);
    root = insertkey(root, 30);
    root = insertkey(root, 40);
    root = insertkey(root, 50);
    root = insertkey(root, 25);

    preOrder(root);
}

    
}