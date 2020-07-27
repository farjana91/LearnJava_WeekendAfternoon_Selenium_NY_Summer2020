package datastructurealgorithm.stack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LearnStack {
    // Stack: LIFO Last in First out
    // Pushing element on top of the stack: push()
    // Popping element from the top of the stack: pop()

    public static void main(String[] args) {
        Stack<String> foodMenu = new Stack<>();
        foodMenu.push("Pizza"); // Head
        foodMenu.push("Coffee");
        foodMenu.push("Steak");
        foodMenu.push("Biryani");
        foodMenu.push("Matcha Bubble Tea"); // Tail

        System.out.println(foodMenu);
        System.out.println(foodMenu.pop());
        System.out.println(foodMenu);

        System.out.println("**************************");

        Stack<Integer> foodPrize = new Stack<>();
        foodPrize.push(20);
        foodPrize.push(30);
        foodPrize.push(40);
        foodPrize.push(50);
        stackSearch(foodPrize,45);

    }

    static void stackSearch(Stack<Integer> stack, int element) {
        Integer pos = stack.search(element);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }


    }

}
