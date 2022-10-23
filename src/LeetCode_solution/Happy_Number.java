package LeetCode_solution;

public class Happy_Number {
    public boolean isHappy(int n) {
        //using slow fast method
        int s = n;
        int f = n;

        do{
            s = compute(s); //slow compute one time
            f = compute((compute(f))); //first compute two times

            if(s==1) return true;
        }
        while(s!=f);
        return false;
    }
    //compute function for finding the sum
    public int compute(int n){
        int s = 0;
        while(n!=0){
            s += (n%10)*(n%10);
            n = n/10;
        }
        return s;
    }
}
