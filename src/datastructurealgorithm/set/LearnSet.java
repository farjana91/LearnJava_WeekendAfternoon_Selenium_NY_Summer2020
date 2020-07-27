package datastructurealgorithm.set;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    // Set is an interface which extends collection. it is an unordered collection of objects in
    // which duplicate values can not be stored.

    // Set is implemented by HashSet, LinkedHashSet or UseTreeSet.


    public static void main(String[] args) {
        Set<String> foodName=new HashSet<>();
        foodName.add("Fat Pizza");
        foodName.add("Coffee");
        foodName.add("Burger");
        foodName.add("Burger");
        foodName.add("Steak");

        System.out.println(foodName);
        foodName.remove("Coffee");
        System.out.println(foodName);
        System.out.println(foodName.contains("Burger"));


    }


}
