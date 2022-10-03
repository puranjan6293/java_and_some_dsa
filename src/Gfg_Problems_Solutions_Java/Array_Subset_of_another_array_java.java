package Gfg_Problems_Solutions_Java;

import java.util.HashMap;

public class Array_Subset_of_another_array_java {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long,Long> map= new HashMap<>();
        for( long data: a1) {
            long of= map.containsKey(data) ?map.get(data): 0;
            map.put(data, of+1);
        }
        for( long data:a2 ){
            if(!map.containsKey(data)) return "No";
            map.put(data, map.get(data)-1);
            if(map.get(data)==0) map.remove(data);
        }
        return "Yes";


    }
}
