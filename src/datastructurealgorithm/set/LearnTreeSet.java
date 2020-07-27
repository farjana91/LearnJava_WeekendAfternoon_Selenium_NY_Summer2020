package datastructurealgorithm.set;

import java.util.TreeSet;

public class LearnTreeSet {
     // A set is a generic set of value with no duplicate elements.
    // A TreeSet is a set where the elements are sorted.
    // A HashSet is a set where elements are not sorted or ordered and Faster then TreeSet.


    public static void main(String[] args) {

        TreeSet<String> tr=new TreeSet<>();
        tr.add("Fat Pizza");
        tr.add("Coffee");
        tr.add("Burger");
        tr.add("Burger");
        tr.add("Steak");
        System.out.println(tr);
        System.out.println(tr.contains("Burger1"));
        System.out.println(tr.first());

        // Null point Exception
        // RuntimeException

    }
}
