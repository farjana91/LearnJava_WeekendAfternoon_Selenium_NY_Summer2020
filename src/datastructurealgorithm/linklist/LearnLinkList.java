package datastructurealgorithm.linklist;

import java.util.LinkedList;
import java.util.List;

public class LearnLinkList {
    // Linklist vs ArrayList

    static List<String> pizzaDetails=new LinkedList<>();


    public static void main(String[] args) {
        List<String> mobileBrands=new LinkedList<>();
        mobileBrands.add("Apple");
        mobileBrands.add("Samsung");
        mobileBrands.add("LG");
        mobileBrands.add("Nokia");
        mobileBrands.add("Sony");
        mobileBrands.add("Google");

        System.out.println(mobileBrands.size());
        for (String mb: mobileBrands) {
            System.out.println("Mobile Brand : "+mb);
        }

        pizzaDetails.add("Name");
        pizzaDetails.add("type");
        pizzaDetails.add("topping");
        pizzaDetails.add("qty");
        pizzaDetails.add("price");
        System.out.println(pizzaDetails.get(3));

        for (String pd: pizzaDetails) {
            if (pd == "topping") {
                System.out.println("This is Topping");
            }
            //System.out.println("Pizza Details : "+pd);
            }

        }


    }



