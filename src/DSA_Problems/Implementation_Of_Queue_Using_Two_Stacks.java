package DSA_Problems;

import java.util.Stack;

public class Implementation_Of_Queue_Using_Two_Stacks {
    static class Queue{
       static Stack<Integer> s1 = new Stack<>();
       static Stack<Integer> s2 = new Stack<>();

       public static boolean isEmpty(){
           return s1.isEmpty();
       }
       //add method
       public static void add(int data){
           while (!s1.isEmpty()){
               s2.push(s1.pop());
           }
           s1.push(data);
           while (!s2.isEmpty()){
               s1.push(s2.pop());
           }
       }
       //remove method
        public static int remove(){
           if (isEmpty()){
               return  -1;
           }
           return s1.pop();
        }
        //peek method
        public static int peek(){
            if (isEmpty()){
                return  -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue qi = new Queue();
        qi.add(1);
        qi.add(2);
        qi.add(3);
        qi.add(4);

        while (!qi.isEmpty()){
            System.out.println(qi.peek());
            qi.remove();
        }
    }
}
