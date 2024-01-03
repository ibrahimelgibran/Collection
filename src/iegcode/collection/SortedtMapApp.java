package iegcode.collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedtMapApp {
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };


        System.out.println("=====================================");

        SortedMap<String,String> sortedMap = new TreeMap<>();

        sortedMap.put("Ibrahim", "ibrahim");
        sortedMap.put("El", "El");
        sortedMap.put("Gibran", "Gibran");

        for (var key : sortedMap.keySet()){
            System.out.println(key);
        }

        // versi sortedmap immutable
        SortedMap <String, String> emty = Collections.emptySortedMap();

        SortedMap <String, String> empty = Collections.emptySortedMap();
        SortedMap <String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);

        /// immutable.put("Berti", "Berti"); err

    }
}
