//Stack by java collections frameWorks
package Dsa.company;

import java.util.*;

public class Stack_By_JavaCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> sk = new Stack<>();
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
