package Gfg_Problems_Solutions_Java;

public class Boundary_Traversal_of_a_Tree {
    /*
    //Answer
    //left
    void travLeft(Node node, ArrayList<Integer> ans){
        if(node==null || node.left==null && node.right==null) return;
        ans.add(node.data);
        if(node.left!=null) travLeft(node.left, ans);
        else travLeft(node.right, ans);
    }
    //leaf
    void travLeaf(Node node, ArrayList<Integer> ans){
        if(node==null) return;
        if(node.left==null && node.right==null){
            ans.add(node.data);
            return;
        }
        travLeaf(node.left, ans);
        travLeaf(node.right, ans);
    }
    //right
    void travRight(Node node, ArrayList<Integer> ans){
        if(node==null || node.left==null && node.right==null) return;

        if(node.right!=null) travRight(node.right, ans);
        else travRight(node.left, ans);

        //coming back
        ans.add(node.data);
    }
    ArrayList <Integer> boundary(Node node)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(node==null) return ans;

        ans.add(node.data);

        //left part
        travLeft(node.left, ans);

        //leaf part
        travLeaf(node.left, ans);
        travLeaf(node.right, ans);

        //right part inreverse
        travRight(node.right, ans);

        return ans;
    }

     */
}
