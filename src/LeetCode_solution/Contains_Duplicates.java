package LeetCode_solution;

import java.util.HashSet;

public class Contains_Duplicates {
    public boolean containsDuplicate(int[] nums) {
        /*
        //Approach1
        HashSet<Integer> s = new HashSet<>();
        for(Integer e:nums){
            s.add(e);
        }
        if(s.size()<nums.length) return true;
        else return false;
        */
        //Approach2
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])) return true; //if contains
            //if not contains then add in HashSet
            s.add(nums[i]);
        }
        return false;
    }
}
