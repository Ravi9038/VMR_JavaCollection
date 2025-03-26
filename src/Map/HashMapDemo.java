package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 1. put() - Adding elements
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);
        System.out.println("After put(): " + map);

        // 2. get() - Retrieving elements
        System.out.println("Value for Apple: " + map.get("Apple"));
        System.out.println("Value for non-existent key: " + map.get("Grape"));

        // 3. containsKey() - Check if key exists
        System.out.println("Contains key 'Apple'? " + map.containsKey("Apple"));
        System.out.println("Contains key 'Grape'? " + map.containsKey("Grape"));

        // 4. containsValue() - Check if value exists
        System.out.println("Contains value 1? " + map.containsValue(1));
        System.out.println("Contains value 5? " + map.containsValue(5));

        // 5. size() - Get number of entries
        System.out.println("Size of map: " + map.size());

        // 6. isEmpty() - Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // 7. remove() - Remove an entry
        map.remove("Apple");
        System.out.println("After removing Apple: " + map);

        // 8. putAll() - Add all entries from another map
        HashMap<String, Integer> otherMap = new HashMap<>();
        otherMap.put("Grape", 4);
        otherMap.put("Mango", 5);
        map.putAll(otherMap);
        System.out.println("After putAll(): " + map);

        // 9. keySet() - Get all keys
        System.out.println("All keys: " + map.keySet());

        // 10. values() - Get all values
        System.out.println("All values: " + map.values());

        // 11. entrySet() - Get all entries
        System.out.println("All entries: " + map.entrySet());

        // 12. forEach() - Iterate through entries
        System.out.println("Iterating through entries:");
        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        // 13. clear() - Remove all entries
        map.clear();
        System.out.println("After clear(): " + map);
        System.out.println("Is map empty? " + map.isEmpty());

        // 14. getOrDefault() - Get value with default if key not found
        System.out.println("GetOrDefault for 'Apple': " + map.getOrDefault("Apple", 0));

        // 15. putIfAbsent() - Put only if key doesn't exist
        map.putIfAbsent("Apple", 1);
        System.out.println("After putIfAbsent(): " + map);
    }
}
