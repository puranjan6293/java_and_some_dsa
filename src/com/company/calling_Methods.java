package com.company;

import java.util.*;

public class calling_Methods {
    public static void ans(ArrayList<Integer> list){
        for (int elements : list){
            System.out.print(elements);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ans(list);
    }
}
