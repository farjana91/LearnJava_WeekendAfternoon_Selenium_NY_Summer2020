package datastructurealgorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    // Queue: FIFO order(First in first out)

    public static void main(String[] args) {

        Queue<String> foodMenu=new LinkedList<>();
        foodMenu.add("Pizza"); // Head
        foodMenu.add("Coffee");
        foodMenu.add("Steak");
        foodMenu.add("Biryani");
        foodMenu.add("Matcha Bubble Tea"); // Tail
        System.out.println(foodMenu.size());//5
        // retrieve value
        for (String fm:foodMenu) {
            System.out.println("Food Menu is "+fm);
        }

        System.out.println("************ After Remove **********");
        foodMenu.remove("Steak");
        for (String fm:foodMenu) {
            System.out.println("Food Menu is "+fm);
        }

        System.out.println("**** Methods used with Queue ****");
        System.out.println(foodMenu.element());
        System.out.println("************ Poll: Peek and remove **********");
        System.out.println(foodMenu.poll());
        System.out.println(foodMenu.element());
        System.out.println("************ Remove **********");
        System.out.println(foodMenu.remove());
        System.out.println(foodMenu.element());
        System.out.println(foodMenu.size());
        System.out.println("************ Peek **********");
        System.out.println(foodMenu.peek());

    }


}
