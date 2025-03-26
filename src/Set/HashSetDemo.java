package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        //Opproch botton to up based in default capacity
        //Printing the values based on Left -> right
        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(64);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(16);

        System.out.println(hashSet);
    }
}
