package Queue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // add() method
        System.out.println("\nAdding elements using add():");
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(15);
        priorityQueue.add(8);
        System.out.println("Priority Queue after adding elements: " + priorityQueue);

        // peek() method
        System.out.println("\nPeek (view head element without removing):");
        System.out.println("Head element: " + priorityQueue.peek());

        // poll() method
        System.out.println("\nPolling (removing and returning) elements:");
        System.out.println("Removed element: " + priorityQueue.poll());
        System.out.println("Priority Queue after polling: " + priorityQueue);

        // remove() method
        System.out.println("\nRemoving specific element:");
        priorityQueue.remove(12);
        System.out.println("Priority Queue after removing 12: " + priorityQueue);

        // size() method
        System.out.println("\nSize of Priority Queue: " + priorityQueue.size());

        // contains() method
        System.out.println("\nChecking if element exists:");
        System.out.println("Contains 8? " + priorityQueue.contains(8));
        System.out.println("Contains 20? " + priorityQueue.contains(20));

        // clear() method
        System.out.println("\nClearing the Priority Queue:");
        priorityQueue.clear();
        System.out.println("Is Priority Queue empty? " + priorityQueue.isEmpty());

        // Adding elements to demonstrate iteration
        priorityQueue.addAll(java.util.Arrays.asList(7, 4, 9, 2, 5));

        // Iterating through PriorityQueue
        System.out.println("\nIterating through Priority Queue:");
        Iterator<Integer> iterator = priorityQueue.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // toArray() method
        System.out.println("\nConverting to Array:");
        Object[] array = priorityQueue.toArray();
        System.out.println("Array: " + java.util.Arrays.toString(array));
    }
}