package datastructurealgorithm.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifference {
    public static void main(String[] args) {
        int [] num1={1,4,6,8,7,6,9};
        int [] num2={2,3,5,8,5,10};

        Set<Integer>number1=new HashSet<Integer>();
        number1.addAll(Arrays.asList(new Integer[]{1,4,6,8,7,6,9}));

        Set<Integer>number2=new HashSet<Integer>();
        number2.addAll(Arrays.asList(new Integer[]{2,3,5,8,5,10}));

        // To do Union set
        Set<Integer> union=new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union Set"+union);
        // To do Intersection
        Set<Integer> intersection=new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("intersection Set"+intersection);
        // To find symmetric Difference
        Set<Integer> difference=new HashSet<>(number1);
        difference.removeAll(number2);
        //it is removing any duplicate value from num 1 and any value common in num 1 and num 2.
        System.out.println("difference of two Set"+difference);//[1, 4, 6, 7, 9] // [2, 3, 5, 10]


    }

}
