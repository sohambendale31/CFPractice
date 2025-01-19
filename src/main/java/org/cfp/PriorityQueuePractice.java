package org.cfp;

import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public void execute(){
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(9);
        minPQ.add(1);
        minPQ.add(7);
        minPQ.add(3);
        minPQ.forEach((Integer val) -> System.out.println(val));
        while (!minPQ.isEmpty()){
            int removedval = minPQ.poll();
            System.out.println("removed from top : " + removedval);
        }
    }
}
