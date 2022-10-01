//LinkedList, DSA class2

package Dsa.company;
class LL {
    Node head;

    private int size;
    //constructor of size
    LL(){
        this.size = 0;
    }
    class Node {
        String data;
        Node next;

        //constructor
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
//add first - function
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //add Last - function
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        //traverse or traveling in a LinkedList
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print
    public void printList(){
        Node currNode = head;
        while (currNode!=null){
            if (head==null){
                System.out.println("List is Empty...");
                return;
            }
            System.out.print(currNode.data+"-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    //Delete first function
    public void deleteFirst(){
        if (head==null){
            System.out.println("LinkedList is Empty..!");
            return;
        }
        size--;
        head = head.next;
    }
    //delete atlast
    public void deleteLast(){
        if (head==null){
            System.out.println("LinkedList is Empty..!");
            return;
        }
        size--;
        //if linkedList having only one Node--> head.next = null
        //head.next = null -->lastNode = null
        if (head.next==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //size function
    public int getSize(){
        return size;
    }

}
public class LinkedList_Dsa2 {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("List");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());


    }
}
