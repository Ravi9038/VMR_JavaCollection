package List;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // push() method - adds elements to the top of stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        
        System.out.println("Stack: " + stack);

        // pop() method - removes and returns the top element
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // peek() method - returns the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // empty() method - checks if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // search() method - returns position of element from top
        int position = stack.search("Java");
        System.out.println("Position of 'Java' from top: " + position);

        // size() method - returns the size of stack
        System.out.println("Stack size: " + stack.size());

        // contains() method - checks if element exists in stack
        System.out.println("Contains 'Python'? " + stack.contains("Python"));

        // clear() method - removes all elements
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}