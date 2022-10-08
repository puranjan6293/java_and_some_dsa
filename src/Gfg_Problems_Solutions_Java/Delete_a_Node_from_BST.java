package Gfg_Problems_Solutions_Java;

public class Delete_a_Node_from_BST {
    /*
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        // code here.
        if(root==null){
            return root;
        }
        //searching
        if(root.data>X){
            root.left = deleteNode(root.left, X);
        }
        else if(root.data<X){
            root.right = deleteNode(root.right, X);
        }
        else{
            //case1
            if(root.left==null && root.right==null){
                return null;
            }
            //case2
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            //inorder successor
            Node ins = inOrderSuccessor(root.right);
            root.data = ins.data;
            root.right = deleteNode(root.right, ins.data);
        }
        return root;
    }
    //inorder successor
    public static Node inOrderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }

     */
}
