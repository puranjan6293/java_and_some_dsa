package LeetCode_solution;

public class Container_With_Most_Water__Arrays {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max = Integer.MIN_VALUE;
        while(left<right){
            int lhight = height[left];
            int rhight = height[right];
            int minh = Math.min(lhight,rhight);
            max = Math.max(max, minh*(right-left));

            if(lhight<=rhight){
                left++;
            }
            else right--;
        }
        return max;
    }
}
