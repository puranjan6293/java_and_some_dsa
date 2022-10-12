package Gfg_Problems_Solutions_Java;
import java.util.*;
public class Minimum_Swap_to_sort_HashMap_Array {
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        int ans =0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            if(map.get(x)!=i){
                ans++;
                int temp = nums[i];
                nums[i] = nums[map.get(x)];
                nums[map.get(x)]=temp;
                i--;
            }
        }
        return ans;
    }
}
