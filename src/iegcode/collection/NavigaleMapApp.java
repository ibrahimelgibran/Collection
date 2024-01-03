package iegcode.collection;

import java.util.*;

public class NavigaleMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Ibrahim", "Ibrahim");
        map.put("El", "El");
        map.put("Gibran", "Gibran");

        for (var key : map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Ibrahim")); // kurang dari
        System.out.println(map.higherKey("El")); // lebih dari
        System.out.println(map.floorKey("Ibrahim")); // lebih dari sama dengan
        System.out.println(map.ceilingKey("Ibrahim")); // kurang dari sama dengan

        // jika kebalikan
        System.out.println("====================");
        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()){
            System.out.println(key);
        }

        // immutable navigable map kosong
        NavigableMap<String, String> emty = Collections.emptyNavigableMap();
        // mengubah mutable navigable map ke immutable
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);
       // immutable.put("Gibran", "Gibran"); err
    }
}
