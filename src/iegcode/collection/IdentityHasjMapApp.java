package iegcode.collection;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class IdentityHasjMapApp {
    public static void main(String[] args) {

        String key1 = "name.first";

        Map<String, String> map = new IdentityHashMap<>();

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2 );

        map.put(key1, "Gibran1");
        map.put(key2, "Ibrahim");
        System.out.println(map.size());
    }
}
