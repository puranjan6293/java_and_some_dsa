package Gfg_Problems_Solutions_Java;

public class Binary_Tree_to_BST {
    /*
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    static int i=0;
    Node binaryTreeToBST(Node root)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        Collections.sort(list);

        i = list.size()-1;
        makeBst(root, list);
        return root;
    }
    public static void inOrder(Node root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }
    public static void makeBst(Node root, ArrayList<Integer> list){
        if(root==null || i<0) return;

        makeBst(root.right, list);
        root.data = list.get(i);
        i--;
        makeBst(root.left, list);
    }

     */
}
