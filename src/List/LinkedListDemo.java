package List;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        System.out.println("1. Adding elements:");
        linkedList.add("First");               // add to end
        linkedList.addFirst("Start");          // add to beginning
        linkedList.addLast("Last");            // add to end
        linkedList.add(1, "Second");           // add at specific position
        System.out.println("After adding: " + linkedList);

        // 2. Accessing elements
        System.out.println("\n2. Accessing elements:");
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        System.out.println("Element at index 1: " + linkedList.get(1));

        // 3. Checking list information
        System.out.println("\n3. List information:");
        System.out.println("Size of list: " + linkedList.size());
        System.out.println("Is list empty? " + linkedList.isEmpty());
        System.out.println("Contains 'First'? " + linkedList.contains("First"));
        System.out.println("Index of 'Last': " + linkedList.indexOf("Last"));

        // 4. Removing elements
        System.out.println("\n4. Removing elements:");
        linkedList.removeFirst();              // remove first element
        System.out.println("After removeFirst: " + linkedList);
        linkedList.removeLast();               // remove last element
        System.out.println("After removeLast: " + linkedList);
        linkedList.remove("Second");           // remove specific element
        System.out.println("After remove('Second'): " + linkedList);

        // 5. Adding more elements for further demonstrations
        linkedList.add("Element1");
        linkedList.add("Element2");
        linkedList.add("Element3");
        System.out.println("\nAfter adding more elements: " + linkedList);

        // 6. Different ways of iterating
        System.out.println("\n6. Different ways of iterating:");
        
        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (String element : linkedList) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 7. Stack operations (LinkedList can be used as a Stack)
        System.out.println("\n7. Stack operations:");
        linkedList.push("Pushed Element");     // add at front
        System.out.println("After push: " + linkedList);
        System.out.println("Popped element: " + linkedList.pop());  // remove and return first element

        // 8. Queue operations (LinkedList can be used as a Queue)
        System.out.println("\n8. Queue operations:");
        linkedList.offer("Offered Element");   // add to end
        System.out.println("After offer: " + linkedList);
        System.out.println("Peek first element: " + linkedList.peek());  // view first element
        System.out.println("Poll first element: " + linkedList.poll());  // remove and return first element

        // 9. Other useful methods
        System.out.println("\n9. Other operations:");
        LinkedList<String> secondList = new LinkedList<>();
        secondList.add("New1");
        secondList.add("New2");
        
        linkedList.addAll(secondList);         // add all elements from another collection
        System.out.println("After addAll: " + linkedList);
        
        linkedList.clear();                    // remove all elements
        System.out.println("After clear: " + linkedList);
    }
}
