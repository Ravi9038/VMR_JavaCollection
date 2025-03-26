package Set;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Creating TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements using add() method
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");

        System.out.println("TreeSet: " + treeSet);

        // Demonstrate first() and last() methods
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Demonstrate headSet(), tailSet(), and subSet() methods
        System.out.println("Elements less than 'Cherry': " + treeSet.headSet("Cherry"));
        System.out.println("Elements greater than or equal to 'Cherry': " + treeSet.tailSet("Cherry"));
        System.out.println("Subset from 'Banana' to 'Date': " + treeSet.subSet("Banana", "Date"));

        // Demonstrate higher(), and lower() methods
        System.out.println("Higher than 'Cherry': " + treeSet.higher("Cherry"));
        System.out.println("Lower than 'Cherry': " + treeSet.lower("Cherry"));

        // Demonstrate pollFirst() and pollLast() methods
        System.out.println("Removed first element: " + treeSet.pollFirst());
        System.out.println("Removed last element: " + treeSet.pollLast());
        System.out.println("TreeSet after polling: " + treeSet);

        // Adding more elements to demonstrate additional methods
        treeSet.add("Elderberry");
        treeSet.add("Fig");
        treeSet.add("Grape");

        // Demonstrate size() and contains() methods
        System.out.println("Size of TreeSet: " + treeSet.size());
        System.out.println("Contains 'Fig'? " + treeSet.contains("Fig"));

        // Demonstrate clear() method
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
        
        // Demonstrate isEmpty() method
        System.out.println("Is TreeSet empty? " + treeSet.isEmpty());
    }
}