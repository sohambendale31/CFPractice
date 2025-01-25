package org.cfp;

import java.util.ArrayDeque;

public class ArrayDequePractice {
    public void execute(){
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        arrayDequeAsQueue.addLast(11);
        arrayDequeAsQueue.addLast(8);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(4);

        int ele = arrayDequeAsQueue.removeFirst();
        System.out.println(ele);

        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(99);
        arrayDequeAsStack.addFirst(56);
        arrayDequeAsStack.addFirst(7);
        arrayDequeAsStack.addFirst(5);

        int elem = arrayDequeAsStack.removeFirst();
        System.out.println(elem);
    }
}
