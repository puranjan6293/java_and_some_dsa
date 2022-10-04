package DSA_Problems;

public class Tower_Of_Hanoi_Recursion {
    //Tower of Hanoi, Time complexity --> O(N^2)
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        //base case
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        //step1
        towerOfHanoi(n-1,src,dest,helper);
        //step2
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        //step3
        towerOfHanoi(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"S","H","D");
    }
}
