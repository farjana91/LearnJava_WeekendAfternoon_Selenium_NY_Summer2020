package datastructurealgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class HashmapTravers {
    //	Key Points
    //
    //	For operations like add, remove, containsKey, time complexity is O(log n where n is number of elements present in TreeMap.
    //	TreeMap always keeps the elements in a sorted(increasing) order, while the elements in a HashMap have no order.
    //	TreeMap also provides some cool methods for first, last, floor and ceiling of keys.
    //


    public static void main(String[] args) {
        int[] number = {40, 30, 56, 78, 23, 66,30, 99, 78};
        printFrequency(number);
    }

    static void printFrequency(int arr[]) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer c = numberMap.get(arr[i]);
            if (numberMap.get(arr[i]) == null) {
                numberMap.put(arr[i], 1);
            } else {
                numberMap.put(arr[i], ++c);
            }
        }
        for (Map.Entry mp : numberMap.entrySet()) {
            System.out.println("Frequency of " + mp.getKey() + " : " + mp.getValue());
            //System.out.println("Frequency of " + mp);
        }

    }


}
