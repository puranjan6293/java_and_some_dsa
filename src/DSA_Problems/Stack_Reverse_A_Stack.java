//Reversing a stack by using Recursion
package DSA_Problems;

import java.util.*;

public class Stack_Reverse_A_Stack {
    //push at bottom of a stack by recursion
    public static void pushAtBottom(int data, Stack<Integer> s){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }
    //for reversing the stack
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top,s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);


        //printing elements of stack
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
