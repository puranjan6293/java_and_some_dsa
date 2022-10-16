package LeetCode_solution;
import java.util.*;
public class Three_element_zero_Sum__Array {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        if(n==0) return new ArrayList<>(ans);
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;

            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }
                else if(sum>0) k--;
                else if(sum<0) j++;
            }
        }
        return new ArrayList<>(ans);
    }
}
