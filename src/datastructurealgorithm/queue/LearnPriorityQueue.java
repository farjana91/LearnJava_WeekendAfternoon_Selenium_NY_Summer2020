package datastructurealgorithm.queue;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    // top element from Priority Queue: peek method only peek value from Queue

    public static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(40);
        pq.add(50);
        pq.add(60);
        pq.add(70);
        pq.add(80);

        // Pool method peek and remove
        System.out.println(pq.peek());

        for (Integer in:pq) {
            System.out.println(in);
        }
        System.out.println("*****************");
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        System.out.println("*****************");
        for (Integer in:pq) {
            System.out.println(in);
        }




    }
}
