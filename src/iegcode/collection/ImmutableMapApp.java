package iegcode.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> emty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Gibran");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Gibran");
        Map<String,String> immutable = Collections.unmodifiableMap(mutable);

        // Jika manual
        Map<String, String> map = Map.of(
                "first", "Ibrahim",
                "middle", "El",
                "lastfirst", "Gibran"
        );
        // map.put("a", "A") err
    }
}
