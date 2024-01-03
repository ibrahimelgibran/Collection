package iegcode.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        /* method di map
        keySet untuk mengambil semua yang ada key berupa set
        values untuk mengambil semua valuenya beruupa Collections
        mengambil dua-duanya bisa menggunakan entrySet
         */

        Map<String, String> map = new HashMap<>();

        map.put("First", "Ibrahim");
        map.put("Middle", "El");
        map.put("Last", "Gibran");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
