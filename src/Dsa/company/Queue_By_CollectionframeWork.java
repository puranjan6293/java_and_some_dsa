package Dsa.company;
import java.util.*;

public class Queue_By_CollectionframeWork {
    public static void main(String[] args) {
//        Queue<Integer> qu = new LinkedList<>(); //Queue is a interface but LinkedList is a Class
        Queue<Integer> qu = new ArrayDeque<>(); //Queue is a interface but ArrayDeque is a Class
        qu.add(1);
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);

        while(!qu.isEmpty()) {
            System.out.println(qu.peek());
            qu.remove();
        }

    }
}
