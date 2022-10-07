package Gfg_Problems_Solutions_Java;

public class Circular_tour_toPointer {
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
        // Your code here
        int st = 0;
        int ft = 0;
        int fs = 0;
        int n = petrol.length;

        for(int i=0;i<n;i++){
            ft+=petrol[i]-distance[i];

            if(ft<0){
                st=i+1;
                fs+=ft;
                ft=0;
            }
        }
        return (ft+fs)>=0 ? st :-1;

    }
}
