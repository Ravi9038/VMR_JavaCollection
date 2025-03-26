package List;
import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();
        
        // Adding elements using add() method
        vector.add("Java");
        vector.add("Python");
        vector.add("JavaScript");
        
        // Adding element at specific position
        vector.add(1, "C++");
        
        System.out.println("Vector elements: " + vector);
        
        // Using addElement() method (legacy method)
        vector.addElement("Ruby");
        
        System.out.println("After addElement(): " + vector);
        
        // Getting elements
        System.out.println("First element: " + vector.firstElement());
        System.out.println("Last element: " + vector.lastElement());
        System.out.println("Element at index 2: " + vector.elementAt(2));
        
        // Vector size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        
        // Removing elements
        vector.remove("Python");
        vector.removeElementAt(0);
        
        System.out.println("After removing elements: " + vector);
        
        // Check if element exists
        System.out.println("Contains 'Ruby'? " + vector.contains("Ruby"));
        
        // Get index of element
        System.out.println("Index of 'JavaScript': " + vector.indexOf("JavaScript"));
        
        // Convert Vector to Array
        String[] array = vector.toArray(new String[vector.size()]);
        System.out.println("Array elements: " + Arrays.toString(array));
        
        // Clear the vector
        vector.clear();
        System.out.println("After clearing: " + vector);
        
        // Check if vector is empty
        System.out.println("Is Vector empty? " + vector.isEmpty());
        
        // Creating a Vector with initial capacity
        Vector<Integer> numbers = new Vector<>(4);
        
        // Adding elements
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        
        // Using Enumeration to iterate (legacy way)
        System.out.println("\nUsing Enumeration:");
        Enumeration<Integer> en = numbers.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        
        // Using Iterator
        System.out.println("\n\nUsing Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        
        // Using enhanced for loop
        System.out.println("\n\nUsing enhanced for loop:");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        
        // Demonstrate thread safety
        System.out.println("\n\nDemonstrating thread safety:");
        Vector<Integer> threadSafeVector = new Vector<>();
        
        // Creating multiple threads to add elements
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                threadSafeVector.add(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        Thread t2 = new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                threadSafeVector.add(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final thread-safe vector: " + threadSafeVector);
    }
}