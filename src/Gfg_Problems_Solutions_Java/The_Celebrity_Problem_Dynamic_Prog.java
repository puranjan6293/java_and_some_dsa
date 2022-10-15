package Gfg_Problems_Solutions_Java;
import java.util.*;
public class The_Celebrity_Problem_Dynamic_Prog {
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        // code here
        int ans = -1;

        for(int i=0; i<n; i++){
            String known = Arrays.toString(M[i]);
            if(!known.contains("1")){
                if(ans == -1){
                    ans = i;
                } else if(ans != -1){
                    return -1;
                }
            }
        }
        return ans;
    }
}
