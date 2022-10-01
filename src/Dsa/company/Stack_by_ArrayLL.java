package Dsa.company;

import java.util.ArrayList;

public class Stack_by_ArrayLL {
    static class NewStack {
        static ArrayList<Integer> list = new ArrayList();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //push
        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1); //last index value
        }
    }
    public static void main(String[] args) {
        NewStack sk = new NewStack();
        sk.push(1);
        sk.push(2);
        sk.push(3);
        sk.push(4);
        sk.push(5);

        while (!sk.isEmpty()) {
            System.out.println(sk.peek());
            sk.pop();
        }
    }
}
