import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // 1. put() method - Adding elements
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        System.out.println("After put(): " + linkedHashMap);

        // 2. putIfAbsent() method
        linkedHashMap.putIfAbsent("Four", 4);
        System.out.println("After putIfAbsent(): " + linkedHashMap);

        // 3. get() method
        System.out.println("get('Two'): " + linkedHashMap.get("Two"));

        // 4. getOrDefault() method
        System.out.println("getOrDefault('Five', 5): " + linkedHashMap.getOrDefault("Five", 5));

        // 5. containsKey() method
        System.out.println("containsKey('Three'): " + linkedHashMap.containsKey("Three"));

        // 6. containsValue() method
        System.out.println("containsValue(2): " + linkedHashMap.containsValue(2));

        // 7. size() method
        System.out.println("Size: " + linkedHashMap.size());

        // 8. isEmpty() method
        System.out.println("isEmpty(): " + linkedHashMap.isEmpty());

        // 9. remove() method
        linkedHashMap.remove("Two");
        System.out.println("After remove('Two'): " + linkedHashMap);

        // 10. clear() method
        linkedHashMap.clear();
        System.out.println("After clear(): " + linkedHashMap);

        // 11. Creating LinkedHashMap with initial capacity and load factor
        LinkedHashMap<String, Integer> customMap = new LinkedHashMap<>(16, 0.75f);
        
        // 12. Creating LinkedHashMap with access order
        LinkedHashMap<String, Integer> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put("A", 1);
        accessOrderMap.put("B", 2);
        accessOrderMap.put("C", 3);
        System.out.println("Before access: " + accessOrderMap);
        accessOrderMap.get("A"); // accessing "A"
        System.out.println("After accessing 'A': " + accessOrderMap); // "A" moves to end

        // 13. keySet() method
        System.out.println("Keys: " + linkedHashMap.keySet());

        // 14. values() method
        System.out.println("Values: " + linkedHashMap.values());

        // 15. entrySet() method
        System.out.println("Entries: " + linkedHashMap.entrySet());

        // 16. forEach() method
        System.out.println("forEach demonstration:");
        linkedHashMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // 17. replace() method
        linkedHashMap.put("One", 1);
        linkedHashMap.replace("One", 100);
        System.out.println("After replace(): " + linkedHashMap);

        // 18. replaceAll() method
        linkedHashMap.replaceAll((key, value) -> value * 2);
        System.out.println("After replaceAll(): " + linkedHashMap);

        // 19. merge() method
        linkedHashMap.merge("One", 1, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("After merge(): " + linkedHashMap);

        // 20. compute() method
        linkedHashMap.compute("One", (key, value) -> (value == null) ? 1 : value * 3);
        System.out.println("After compute(): " + linkedHashMap);
    }
}