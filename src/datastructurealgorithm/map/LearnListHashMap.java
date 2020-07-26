package datastructurealgorithm.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {

    public static void main(String[] args) {

        List<String> stateOfUSA=new ArrayList<>();
        stateOfUSA.add("NY");
        stateOfUSA.add("NJ");
        stateOfUSA.add("FL");
        stateOfUSA.add("TX");
        stateOfUSA.add("CT");

        List<String> stateOfCanada=new ArrayList<>();
        stateOfCanada.add("ON");
        stateOfCanada.add("QC");
        stateOfCanada.add("BC");
        stateOfCanada.add("SK");
        stateOfCanada.add("MB");

        List<String> stateOfUK=new ArrayList<>();
        stateOfUK.add("LONDON");
        stateOfUK.add("SCOTLAND");
        stateOfUK.add("BRISTOL");
        stateOfUK.add("MEKELLE");
        stateOfUK.add("WALES");

        Map<String, List<String>> stMap=new HashMap<>();
        stMap.put("USA",stateOfUSA);
        stMap.put("CANADA",stateOfCanada);
        stMap.put("UK",stateOfUK);

        for (Map.Entry<String,List<String>> entry :stMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }


}
