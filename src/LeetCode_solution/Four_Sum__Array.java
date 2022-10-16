package LeetCode_solution;
import java.util.*;
public class Four_Sum__Array {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        /*
        //Approach-1
        Set<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        if(n==0) return new ArrayList<>(ans);
        Arrays.sort(nums);

        for(int k=0;k<n-3;k++){
            for(int i=k+1;i<n-2;i++){
                int low = i+1;
                int high = n-1;
                while(low<high){
                    long sum = (long)(nums[k]+nums[i])+(long)(nums[low]+nums[high]);
                    if(sum==target){
                        ans.add(Arrays.asList(nums[k],nums[i],nums[low],nums[high]));
                    }
                    else if(sum<target) low++;
                    else high--;
                }
            }
        }
        return new ArrayList<>(ans);
        */
        //Approach-2, O(n^3)
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                long target2 = (long) target - (long) nums[i] - (long) nums[j];
                int lo = j + 1, hi = n - 1;

                while (lo < hi) {
                    int twoSum = nums[lo] + nums[hi];

                    if (twoSum < target2) lo++;
                    else if (twoSum > target2) hi--;
                    else {
                        List<Integer> quad = Arrays.asList(nums[i],nums[j],nums[lo],nums[hi]);
                        ans.add(quad);

                        while (lo < hi && nums[lo] == quad.get(2)) lo++;
                        while (lo < hi && nums[hi] == quad.get(3)) hi--;
                    }
                }

                while (j + 1 < n && nums[j] == nums[j + 1]) j++;
            }

            while (i + 1 < n && nums[i] == nums[i + 1]) i++;
        }

        return ans;
    }
}
