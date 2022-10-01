//Binary Trees Data Structure
package Dsa.company;

import java.util.*;

public class Trees_Data_Structure_DSA {
    static class Node{
        int data;
        Node left;
        Node right;
        //constructor
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if (nodes[index]==-1){
                return null;
            }
            //creating new node
            Node newNode = new Node(nodes[index]);
            //creating left subtree of newNode
            newNode.left = buildTree(nodes);
            //creating right subtree of newNode
            newNode.right = buildTree(nodes);

            return newNode;

        }
    }
    //preorder traversal
    public static void preorder(Node root){

        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    //inorder traversal
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //postorder traversal
    public static void postorder(Node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    //level order traversal (Important)
    public static void levelOrder(Node root){
        //base case
        if (root==null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if (currNode.left!=null){
                    q.add(currNode.left);
                }
                if (currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    //Question-1 Count of Nodes
    public static int countOfNodes(Node root){
        if (root==null){
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes+rightNodes+1;
    }

    //Question-2 Sum of nodes
    public static int sumOfNodes(Node root){
        if (root==null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum+rightSum+ root.data;
    }

    //Question-3 Height of the tree
    public static int height(Node root){
        if (root==null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int maxHeight = Math.max(leftHeight,rightHeight)+1;
        return maxHeight;
    }

    //Question-4- Diameter of a tree (approach 1) , time O(n^2)
    public static int diameterApproach1(Node root){
        if (root==null){
            return 0;
        }
        int diam1 = diameterApproach1(root.left);
        int diam2 = diameterApproach1(root.right);

        int diam3 = height(root.left)+height(root.right)+1; //from the height function
        return Math.max(diam3,Math.max(diam1,diam2));
    }

    //Question-4- Diameter of a tree (approach 2) , time O(n)
    static class approach2TreeInfo{
        int heit;
        int dia;
        //constructor
        approach2TreeInfo(int heit,int dia){
            this.heit = heit;
            this.dia = dia;
        }
    }
    public static approach2TreeInfo diameterApproach2(Node root){
        if (root==null){
            return new approach2TreeInfo(0,0);
        }

        approach2TreeInfo left = diameterApproach2(root.left);
        approach2TreeInfo right = diameterApproach2(root.right);

        int myHeight = Math.max(left.heit, right.heit)+1;
        int Dia1 = left.dia;
        int Dia2 = right.dia;
        int Dia3 = left.heit+ right.heit+1;

        int myDiameter = Math.max(Math.max(Dia1,Dia2),Dia3);

        approach2TreeInfo myInfo = new approach2TreeInfo(myHeight,myDiameter);

        return myInfo;
    }

    //Sum of leaf Nodes
    public static int sumOfLeafNodes(Node root){
        if (root == null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return root.data;
        }
        return sumOfLeafNodes(root.left)+sumOfLeafNodes(root.right);
    }

    //minimum depth of a tree
    public static int minimumDepth(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left==null){
            return minimumDepth(root.right)+1;
        }
        if(root.right==null){
            return minimumDepth(root.left)+1;
        }
        return Math.min(minimumDepth(root.left),minimumDepth(root.right))+1;
    }

    //count of leaf in a tree
    public static int countOfLeafs(Node root){
        if (root==null){
            return 0;
        }
        int leftLeafs = countOfLeafs(root.left);
        int rightLeafs = countOfLeafs(root.right);
        if (root.left==null && root.right==null){
            return 1;
        }
        return leftLeafs+rightLeafs;
    }




    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        /*
//        System.out.println(root.data); //for printing the root

        preorder(root); //for preorder, that is root-->left-->right

        System.out.println(); //using for new line

        inorder(root); //for in order, that is left-->root-->right

        System.out.println(); //using for new line

        postorder(root); //for post order, that is left-->right-->root

        System.out.println(); //using for new line

        System.out.println("levelOrder starts from here");

        levelOrder(root);

        System.out.println(countOfNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(height(root));
        System.out.println(diameterApproach1(root));
        System.out.println(diameterApproach2(root).dia);

         */
        System.out.println(sumOfLeafNodes(root));
        System.out.println(minimumDepth(root));
        System.out.println(countOfLeafs(root));



    }
}
