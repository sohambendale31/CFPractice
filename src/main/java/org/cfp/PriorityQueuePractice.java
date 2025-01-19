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

        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        maxPQ.add(2);
        maxPQ.add(9);
        maxPQ.add(5);
        maxPQ.add(1);
        maxPQ.add(8);
        maxPQ.add(3);
        maxPQ.forEach((Integer val) -> System.out.println(val));
        while (!maxPQ.isEmpty()){
            int removedvalmax = maxPQ.poll();
            System.out.println("removed from top : " + removedvalmax);
        }
    }
}
