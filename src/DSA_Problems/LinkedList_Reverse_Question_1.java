//Reverse a linkedList
package DSA_Problems;
//LinkedList class
class RevLl{
    Node head;
    //Node class
    class Node{
        String data;
        Node next;

        //node constructor
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //addFirst
    public void addFirst(String data){
        //creating new node
        Node newNode = new Node(data);
        //checking if linked list is empty
        if (head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //addLast
    public void addLast(String data){
        //creating newNode
        Node newNode = new Node(data);
        //checking if LinkedList is empty
        if (head==null){
            head = newNode;
            return;
        }
        //Traverse through the LinkedList
        Node currNode = head;
        while (currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //printing the LinkedList
    public void printLinkedList(){
        Node currNode = head;
        while (currNode!=null){
            if (head==null){
                System.out.println("LinkedList is Empty..!");
                return;
            }
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

public void reverseIterate(){
        //if linkedList is empty or if LinkedList having only one element
        if (head==null || head.next==null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update--> currNode, prevNode, nextNode
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
}
public Node reverseRecursive(Node head){
    if (head==null || head.next==null){
        return head;
    }
       Node newHead = reverseRecursive(head.next);
       head.next.next = head;
       head.next = null;

       return newHead;
}

}
public class LinkedList_Reverse_Question_1 {
    public static void main(String[] args) {
        RevLl rLL = new RevLl();
        rLL.addFirst("How");
        rLL.addFirst("Hello");
        rLL.addLast("Are");
        rLL.addLast("you");

        rLL.printLinkedList();

//        rLL.reverseIterate();
        rLL.head = rLL.reverseRecursive(rLL.head);
        rLL.printLinkedList();

    }
}
