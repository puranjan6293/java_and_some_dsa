package DSA_Problems;
public class Check_If_a_Array_is_sorted_recursion {
    public static boolean isSorted(int[]arr,int idx){
        //base condition
        if(idx==arr.length-1){
            return true;
        }
        //approach
        if(arr[idx]<arr[idx+1]){
            //till now the array is sorted
            return isSorted(arr,idx+1);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        System.out.println(isSorted(arr,0));
    }
}
