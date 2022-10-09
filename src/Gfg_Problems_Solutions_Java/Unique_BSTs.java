package Gfg_Problems_Solutions_Java;

public class Unique_BSTs {
    /*
}
    //recursive way
    //Function to return the total number of possible unique BST.
    static int numTrees(int N)
    {
        // Your code goes here
        //method--1
        long lng = 1000000007;
        long[] arr = new long[N+1];

        arr[0] = 1;
        arr[1] = 1;

        for(int i=2;i<=N;i++){
            for(int left = 0;left<=i-1;left++){
                int right = i-left-1;
                long val = (arr[left]*arr[right])%lng;
                arr[i] = (arr[i]+val)%lng;
            }
        }
        return (int) arr[N];


        //method--2 part
        //step3
        // return numTree(1, N);
    }
//method--2
    /*
    //step1
    public static int numTree(int start, int end){
        if(start>=end){
            return 1;
        }
        //step2
        int countU =0;
        for(int i=start;i<=end;i++){
            countU+=numTree(start,i-1)*numTree(i+1,end);
        }
        return countU;
    }

     */
}
