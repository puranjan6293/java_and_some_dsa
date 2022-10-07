package Gfg_Problems_Solutions_Java;

public class Pair_with_given_sum_in_a_sorted_array_twoPointers {
    int Countpair(int a[], int n, int sum)
    {
        // Complete the function
        int first = 0;
        int last = n-1;
        int count = 0;
        int k = 0;
        while(first<last){
            k = a[first]+a[last];
            if(k==sum){
                count++;
                first++;
                last--;
            }
            else if(k<sum){
                first++;
            }
            else{
                last--;
            }
        }
        if(count==0) return -1;
        else return count;
    }
}
