package Dsa.company;

public class Stack_By_LL {
    //making a node class
    static class Node {
        //initialising
        int data;
        Node next;

        //making constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        public static Node head;
        //if stack is empty
        public static boolean isEmpty(){
            return head==null;
        }
        //push method
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                head=newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //pop method
        public static int pop() {
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek method
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack sk = new Stack();
        sk.push(1);
        sk.push(2);
        sk.push(3);
        sk.push(4);
        sk.push(5);

        while (! sk.isEmpty()){
            System.out.println(sk.peek());
            sk.pop();
        }
    }
}
