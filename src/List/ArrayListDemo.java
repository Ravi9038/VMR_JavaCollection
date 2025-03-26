package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<Integer>();

        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        System.out.println(arrList);

        //based on Index we can add element in array list
        arrList.add(1,56);
        System.out.println(arrList);

        // is element is present or not
        System.out.println(arrList.contains(10));

    }
}
