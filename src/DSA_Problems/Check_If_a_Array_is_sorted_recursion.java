package DSA_Problems;
public class Check_If_a_Array_is_sorted_recursion {
    //check if the array is sorted or not, Time complexity --> O(n)
    public static boolean isSorted(int[]arr,int idx){
        //base condition
        if(idx==arr.length-1){
            return true;
        }
        //approach
        if(arr[idx]>=arr[idx+1]){
            //the array is unsorted
            return false;
        }
        return isSorted(arr,idx+1);
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        System.out.println(isSorted(arr,0));
    }
}
