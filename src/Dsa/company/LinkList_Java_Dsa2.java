package Dsa.company;

import java.util.*;

public class LinkList_Java_Dsa2 {
    public static void main(String[] args) {
        LinkedList<String> lis1 = new LinkedList<>();
        lis1.addFirst("are");
        lis1.addFirst("How");
        lis1.addFirst("Hello..");
        lis1.addLast("You");
        System.out.println(lis1);
        lis1.removeFirst();
        System.out.println(lis1);
        //printing elements of LinkedList by using foEach loop
//        for (String elements: lis1){
//            System.out.println(elements);
//        }
        //printing elements os linkedList
        for (int i = 0; i<lis1.size(); i++){
            System.out.print(lis1.get(i)+"-->");
        }
        System.out.println("NULL");

        lis1.remove(0);
        System.out.println(lis1);
    }
}
