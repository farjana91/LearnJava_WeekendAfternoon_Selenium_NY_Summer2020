package problemssolutions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {


    public static void main(String[] args) {

        //Object [] number={"b","b",1,2,4,5,7,7,"k","k",9,10,0,0,7,2,4};
        Object[] number = {2, 4, 5, 3, 2, 5, 8, 0, 1, 0, 3};
        removeDuplicate(number);

    }

    public static void removeDuplicate(Object[] number) {
        Set<Object> newList = new HashSet<>();
//TreeSet<String> newList=new TreeSet<>();
        for (Object element : number) {
            if (element instanceof String) {
                newList.add((String) element);
            } else if (element instanceof Integer) {
                newList.add((Integer) element);
            }
        }
        System.out.println(newList);
    }

}
