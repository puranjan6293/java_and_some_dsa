package Gfg_Problems_Solutions_Java;

public class pair_with_given_sum_is_a_sorted_array_toPointers {
    int Countpair(int a[], int n, int sum)
    {
        // Complete the function
        int left=0;
        int right=n-1;
        int count=0;
        while(left<right){
            if(a[left]+a[right]==sum){
                count++;
                left++;
                right--;
            }
            else if(a[left]+a[right]>sum){
                right--;
            }
            else{
                left++;
            }
        }
        if(count==0)
            return -1;
        else
            return count;

    }
}
