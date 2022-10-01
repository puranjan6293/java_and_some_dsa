package Dsa.company;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_data_Structure {
    public static void main(String[] args) {
        //creating
        HashSet<Integer> set = new HashSet<>();

        //insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //set contains only unique elements

        //size
        System.out.println("size of the set is--> "+set.size());

        //print all elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        //HasNext; Next
        while (it.hasNext()){
            System.out.print(it.next() +"-->");
        }
        System.out.println();


        //Search or contains
        if (set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set does not contains 6");
        }

        //delete
        set.remove(1);
        if (!set.contains(1)){
            System.out.println("Set does not contains 1 --- we deleted 1");
        }



    }
}
