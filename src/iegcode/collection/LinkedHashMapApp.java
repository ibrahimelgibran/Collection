package iegcode.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>(); // HashMap = keysnya jadi tidak berurut
        map.put("first", "Ibrahim");
        map.put("last", "Gibran");
        map.put("middle", "El");

        Set<String> keys = map.keySet();
        for (var key : keys){
            System.out.println(key);
        }

    }
}
