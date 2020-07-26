package datastructurealgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    // Map: <Key,Value>
    // Map<String, String>
    // name is key
    // "James" is value

    String name="James";

    public static void main(String[] args) {

        Map<String, String> stateMap= new HashMap<>();
        stateMap.put("USA","DC");
        stateMap.put("CANADA","Ottawa");
        stateMap.put("Bangladesh","Dhaka");
        stateMap.put("Bangladesh1","Dhaka1");
        stateMap.put("Yemen","Sana");
        stateMap.put("NZ","Auckland");

        // Retrieve Value from Map
        for (Map.Entry<String,String>  entry :   stateMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println(stateMap.get("Yemen"));

        // Wrapper class: Integer which hold all type primitive data
        Map<String, Integer > pizzaTypeWithPrice= new HashMap<>();
        pizzaTypeWithPrice.put("Fat Pizza",50);
        pizzaTypeWithPrice.put("Cheese Pizza",40);
        pizzaTypeWithPrice.put("spicy Pizza",60);
        pizzaTypeWithPrice.put("Chicken Pizza",70);

        for (Map.Entry<String,Integer>  entry :   pizzaTypeWithPrice.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("********************");
        // Retrieve value

        for ( String st : pizzaTypeWithPrice.keySet() ) {
            System.out.println(st+" : "+pizzaTypeWithPrice.get(st));
        }


    }

}
