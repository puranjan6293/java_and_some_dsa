//ArrayList in Java, chapter 15

package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class ArrayList_chap15 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        //adding elements to the arraylist l1
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(4);
        l1.add(9);
        //adding elements in specific index
        l1.add(0,10);
        l1.add(0,20);
        l1.add(3,30);
        //adding element to the ArrayList l2
        l2.add(100);
        l2.add(200);
        l2.add(300);
        l2.add(400);

        //printing size or length of the ArrayList
        System.out.println("Length of the ArrayList is: "+l1.size());
        //printing elements of the arraylist
        /*
        //method-1
        for (int elements: l1){
            System.out.println(elements);
        }
         */

        //Adding all elements of Arraylist l2 in ArrayList l1
//        l1.addAll(l2);
        l1.addAll(0,l2); //we can ad in any index

//        l1.clear(); //for removing all elements from the Arraylist

        //Finding a specific element in a arrayList
//        System.out.println(l1.contains(1000));

        //finding specific index of a element
//        System.out.println(l1.indexOf(4)); //it will give the first element index of common elements
//        System.out.println(l1.lastIndexOf(4)); //give the last element index of common elements

        //for removing element in a specific index
//        l1.remove(0);

        //setting element in a specif index
//        l1.set(0,345);

        //isIterator
//        l1.iterator(); //Returns an iterator over the elements in this list in proper sequence

        //subList
//        l1.subList(1,3); //This will return the value in the range of 1st to 3rd element which is stored in the array list

        //removeIf
//        l1.removeIf(();//Removes all of the elements of this collection that satisfy the given predicate.

        //l1.equals(Object o) :- This Helps in Identifying whether two array lists have the same values in same order or not!
        //l1.toArray() :- This Helps in converting an Array list into an Array and also helps us in few situations!


        //method-2
        for (int i = 0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
