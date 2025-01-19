package org.cfp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class IteratorPractice {
    public void execute(){
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        System.out.println("Iterating over values using iterator: ");
        Iterator<Integer> valuesIterator = values.iterator();
        while (valuesIterator.hasNext()){
            int val = valuesIterator.next();
            System.out.println(val);
            if (val == 3){
                valuesIterator.remove();
            }
        }
        System.out.println("Iterating using for each loop: ");
        for(int val : values){
            System.out.println(val);
        }
        System.out.println("Iterating using for each method: ");
        values.forEach((Integer val) -> System.out.println(val));
        System.out.println("Using size() " + values.size());
        System.out.println("Using isEmpty() " + values.isEmpty());
//        remove using index
        values.remove(3);
//        remove using object, removes the first occurrence
        values.remove(Integer.valueOf(2));
        System.out.println("Using contains() " + values.contains(5));

        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);
        stackValues.add(9);
        values.addAll(stackValues);
        System.out.println("testing addAll() using containsAll() " + values.containsAll(stackValues));
        values.removeAll(stackValues);
        System.out.println("after removeAll() " + values.contains(8));
        values.clear();
        System.out.println("clear: " + values.isEmpty());
    }
}
