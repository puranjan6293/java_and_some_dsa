package Gfg_Problems_Solutions_Java;

public class Is_Binary_Tree_Heap_BST {
    /*
    boolean isHeap(Node tree) {
        // code here
        if(tree==null){
            return true;
        }
        boolean seen = false;
        // LinkedList<Node> q = new LinkedList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(tree);

        while(!q.isEmpty()){
            // Node temp = q.removeFirst();
            Node temp = q.poll();

            if(temp.left!=null){
                if(seen||temp.left.data>temp.data) return false;
                // q.addLast(temp.left);
                q.add(temp.left);
            }
            else seen = true;

            if(temp.right!=null){
                if(seen||temp.right.data>temp.data) return false;
                // q.addLast(temp.right);
                q.add(temp.right);
            }
            else seen = true;
        }
        return true;
    }

     */
}
