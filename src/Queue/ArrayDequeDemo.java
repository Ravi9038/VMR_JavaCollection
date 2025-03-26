package Queue;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements using different methods
        arrayDeque.add("First");        // Adds at the end
        arrayDeque.addLast("Last");     // Adds at the end
        arrayDeque.addFirst("Start");   // Adds at the beginning
        arrayDeque.offer("Offered");     // Adds at the end
        arrayDeque.offerFirst("First Offered"); // Adds at the beginning
        arrayDeque.offerLast("Last Offered");   // Adds at the end

        System.out.println("ArrayDeque after adding elements: " + arrayDeque);

        // Accessing elements
        System.out.println("First element: " + arrayDeque.getFirst());
        System.out.println("Last element: " + arrayDeque.getLast());
        System.out.println("Peek first: " + arrayDeque.peekFirst());
        System.out.println("Peek last: " + arrayDeque.peekLast());

        // Removing elements
        System.out.println("Removed first element: " + arrayDeque.removeFirst());
        System.out.println("Poll last element: " + arrayDeque.pollLast());

        System.out.println("ArrayDeque after removal: " + arrayDeque);

        // Check if element exists
        System.out.println("Contains 'First'?: " + arrayDeque.contains("First"));

        // Size of ArrayDeque
        System.out.println("Size of ArrayDeque: " + arrayDeque.size());

        // Clear the ArrayDeque
        arrayDeque.clear();
        System.out.println("After clearing ArrayDeque: " + arrayDeque);
    }
}