package datastructurealgorithm.linklist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList {
    public static void main(String[] args) {
        List<String> stateList=new LinkedList<>();
        stateList.add("NY");
        stateList.add("NJ");
        stateList.add("FL");
        stateList.add("CT");
        stateList.add("VA");
        stateList.add("WA");

        System.out.println("   before Remove ");
        // Alternative of for each
        Iterator it=stateList.iterator();
        while (it.hasNext() ){
            System.out.println(it.next());
        }

        System.out.println("   After Remove ");
        stateList.remove(2);
        Iterator it1=stateList.iterator();
        while (it1.hasNext() ){
            System.out.println(it1.next());
        }
        System.out.println(stateList.size());
        System.out.println(stateList.get(4));

    }



}
