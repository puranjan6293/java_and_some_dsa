package Gfg_Problems_Solutions_Java;

public class Remove_duplicate_from_a_sorted_Array_Topointers {
    int remove_duplicate(int A[],int N){
        // code here
        int i=0;
        for(int j=1;j<N;j++){
            if(A[i]!=A[j]){
                i++;
                A[i] = A[j];
            }
        }
        return i+1;
    }
}
