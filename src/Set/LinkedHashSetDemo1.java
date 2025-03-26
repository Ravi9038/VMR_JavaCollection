package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {

        //Opproch botton to up based in default capacity
        //Printing the values based on Left -> right
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(64);
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(16);

        System.out.println(linkedHashSet);
    }
}
