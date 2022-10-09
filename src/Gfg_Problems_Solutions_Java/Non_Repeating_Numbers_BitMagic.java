package Gfg_Problems_Solutions_Java;

import java.util.TreeMap;

public class Non_Repeating_Numbers_BitMagic {
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int[] ans = new int[2];
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(tm.containsKey(nums[i])){
                tm.remove(nums[i]);
            }
            else{
                tm.put(nums[i],1);
            }
        }
        ans[0] = tm.firstKey();
        ans[1] = tm.lastKey();
        return ans;
    }
}
