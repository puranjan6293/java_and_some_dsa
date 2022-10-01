package Dsa.company;

import java.util.ArrayList;

public class ArrayList_PracticeProb {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(2);
        l1.add(9);
        l1.add(4);
        l1.add(-5);
        l1.add(6);
        int sum = 0;
        for (int i = 0; i<l1.size(); i++){
            sum +=l1.get(i);
        }
        System.out.println(sum);
    }
}
