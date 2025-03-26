package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethod {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("Initial ArrayList: " + fruits);

        // Adding element at specific position
        fruits.add(1, "Grape");
        System.out.println("After adding Grape at index 1: " + fruits);

        // Removing elements
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);
        fruits.remove(2);
        System.out.println("After removing element at index 2: " + fruits);

        // Checking if element exists
        System.out.println("Contains Apple? " + fruits.contains("Apple"));
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Getting element at index
        System.out.println("Element at index 1: " + fruits.get(1));

        // Setting element at index
        fruits.set(0, "Pineapple");
        System.out.println("After replacing first element: " + fruits);

        // Size of ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Iterating using for loop
        System.out.println("\nIterating using for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Iterating using enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Creating another ArrayList for more operations
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        // Sorting ArrayList
        Collections.sort(numbers);
        System.out.println("\nSorted numbers: " + numbers);

        // Finding min and max
        System.out.println("Minimum number: " + Collections.min(numbers));
        System.out.println("Maximum number: " + Collections.max(numbers));

        // Clearing ArrayList
        fruits.clear();
        System.out.println("\nAfter clearing fruits ArrayList: " + fruits);
        System.out.println("Is fruits ArrayList empty? " + fruits.isEmpty());
    }
}