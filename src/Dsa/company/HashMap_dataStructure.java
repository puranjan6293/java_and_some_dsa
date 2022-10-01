package Dsa.company;
import java.util.*;

public class HashMap_dataStructure {
    public static void main(String[] args) {
        //creating
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("Us", 130);
        map.put("china", 100);

        //print
        System.out.println(map);

        //Search Key
        if (map.containsKey("china")){
            System.out.println("yes this key is present");
        }

        //search value -->case1
        System.out.println(map.get("Us"));

        //search value -->case2
        System.out.println(map.getOrDefault("Uss",100));

        //Iterate -->Type1
        for (Map.Entry<String, Integer> element : map.entrySet()){
//            System.out.println(element);
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }
        //Iterate -->Type2
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " "+ map.get(key));
        }

    }
}
