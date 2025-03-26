package Set;

import java.util.LinkedHashSet;

/**
 * This class demonstrates the usage of LinkedHashSet in Java
 * LinkedHashSet maintains insertion order and does not allow duplicate elements
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Creating a new LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to LinkedHashSet
        // The elements will be stored in the order they were inserted
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");

        // Trying to add duplicate element - it will not be added
        boolean isDuplicateAdded = linkedHashSet.add("Apple");
        System.out.println("Was duplicate element added? " + isDuplicateAdded);

        // Displaying elements - notice the order is maintained
        System.out.println("\nElements in LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // Checking if element exists
        boolean containsElement = linkedHashSet.contains("Banana");
        System.out.println("\nDoes set contain Banana? " + containsElement);

        // Removing an element
        boolean isRemoved = linkedHashSet.remove("Mango");
        System.out.println("Was Mango removed? " + isRemoved);

        // Getting size of LinkedHashSet
        System.out.println("\nSize of LinkedHashSet: " + linkedHashSet.size());

        // Checking if LinkedHashSet is empty
        System.out.println("Is LinkedHashSet empty? " + linkedHashSet.isEmpty());

        // Clearing all elements
        linkedHashSet.clear();
        System.out.println("\nAfter clearing:");
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());
        System.out.println("Is LinkedHashSet empty? " + linkedHashSet.isEmpty());

        // Adding different types of elements using generics
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(100); // Duplicate will not be added

        System.out.println("\nNumbers in LinkedHashSet:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
