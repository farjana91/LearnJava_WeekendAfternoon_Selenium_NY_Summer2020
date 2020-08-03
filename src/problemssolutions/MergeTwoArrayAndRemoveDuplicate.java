package problemssolutions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayAndRemoveDuplicate {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={1,3,4}
    // given  arrayB={4,5,6,7,8}
    // output {1,3,4,5,6,7,8}


    public static void main(String[] args) {

        int[] arrayA = {1, 3, 4};
        int[] arrayB = {4, 5, 6, 7, 8};
        // Merge Two Array
        int[] mergeArray = mergeArrayRemoveDuplicate(arrayA, arrayB);
        // To Print Array to String
        System.out.println("Array A :" + Arrays.toString(arrayA));
        System.out.println("Array B :" + Arrays.toString(arrayB));

        System.out.println("Sorted Merge Array with No Duplicate");
        System.out.println(Arrays.toString(mergeArray));

    }

    /**
     * This method merge Array and Remove Duplicate
     *
     * @param array1
     * @param array2
     * @return
     */
    public static int[] mergeArrayRemoveDuplicate(int[] array1, int[] array2) {
        return IntStream.concat(IntStream.of(array1), IntStream.of(array2)).distinct().sorted().toArray();
    }


}
