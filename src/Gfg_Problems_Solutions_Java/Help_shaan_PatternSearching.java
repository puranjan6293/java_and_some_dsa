package Gfg_Problems_Solutions_Java;

public class Help_shaan_PatternSearching {
    public int NthTerm(int N)
    {
        // code here
        int Count=0,temp1=N,temp2=N;
        while(checkAfterNotPrime(temp1) && checkBeforeNotPrime(temp2)){
            Count++;
            temp1++;
            temp2--;
        }
        return Count;

    }
    boolean checkBeforeNotPrime(int X){
        int i=0;
        if(X <= 1){
            return true;
        }
        for(i=X/2;i>1;i--){
            if(X%i==0){
                return true;
            }
        }
        return false;
    }
    boolean checkAfterNotPrime(int X){
        int i=0;
        if(X <= 1){
            return true;
        }
        for(i=2;i<=X/2;i++){
            if(X%i==0){
                return true;
            }
        }
        return false;
    }
}
