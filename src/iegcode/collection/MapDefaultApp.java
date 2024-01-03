package iegcode.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Ibrahim", "Ibrahim");
        map.put("El", "El");
        map.put("Gibran", "Gibran");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + ":" + value);
            }
        });
    }
}
