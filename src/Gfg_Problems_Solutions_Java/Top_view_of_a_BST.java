package Gfg_Problems_Solutions_Java;

public class Top_view_of_a_BST {
    /*
    //step2
    class Pair{
        Node node;
        int hd;
        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    class Solution
    {
        //Function to return a list of nodes visible from the top view
        //from left to right in Binary Tree.
        static ArrayList<Integer> topView(Node root)
        {
            // add your code
            //step1
            ArrayList<Integer> ans = new ArrayList<>();
            TreeMap<Integer, Integer> map = new TreeMap<>();
            Queue<Pair> q = new LinkedList<>();

            //step3
            q.add(new Pair(root, 0));

            //step4
            while(!q.isEmpty()){
                Pair front = q.poll();

                if(!map.containsKey(front.hd)){
                    map.put(front.hd, front.node.data);
                }

                if(front.node.left!=null){
                    q.add(new Pair(front.node.left, front.hd-1));
                }
                if(front.node.right!=null){
                    q.add(new Pair(front.node.right, front.hd+1));
                }
            }
            //step5
            for(int e:map.keySet()){
                ans.add(map.get(e));
            }
            //step6
            return ans;
        }
    }

     */
}
