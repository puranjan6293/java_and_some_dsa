package Dsa.company;

import java.util.ArrayList;

public class Binary_Search_Tree_data_structure {
    static class Node{
        int data;
        Node left;
        Node right;

        //constructor
        Node(int data){
            this.data = data;
        }
    }
    //here we use Node instate of void because we use recursive technique
    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            //inserting in left subtree
            root.left = insert(root.left, val);
        }
        else {
            //inserting in right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    //Inorder traversal
    public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //Search key
    public static boolean search(Node root, int key){
        if(root==null){
            return false;
        }
        if (root.data > key){
            return search(root.left, key);
        } else if (root.data==key) {
            return true;

        } else {
            return search(root.right, key);
        }
    }

    //delete a node
    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left = delete(root.left, val);
        } else if (root.data<val) {
            root.right = delete(root.right, val);
        }
        else{ //root.data==val
            //case1
            if(root.left==null && root.right==null){
                return null;
            }
            //case2
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;
            }
            //case3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while (root.left!=null){
            root = root.left;
        }
        return root;
    }

    //Print in range
    public static void printInRange(Node root, int x, int y){
        if (root==null){
            return;
        }
        if(root.data>=x && root.data<=y){
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
        } else if (root.data>=y) {
            printInRange(root.left, x, y);
        }
        else {
            printInRange(root.right, x, y);
        }
    }

    //root to leaf path
    public static void printPath(ArrayList<Integer> path){
        for (int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println();
    }
    public static void root2leafPath(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);

        //leaf
        if (root.left==null && root.right == null){
            printPath(path);
        }
        else { //non leaf
            root2leafPath(root.left, path);
            root2leafPath(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values [] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;
        //
        for (int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        //inOrder traversal
        inOrder(root);
        System.out.println();

        //using Binary search function
        System.out.println(search(root, 11));

        //delete a node
        delete(root, 4);
        inOrder(root);
        System.out.println();

        //print in range x, y
        printInRange(root,4,8);

        //path to leaf
        root2leafPath(root, new ArrayList<>());
    }
}
