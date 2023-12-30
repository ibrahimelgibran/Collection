package iegcode.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Ibrahim");
        collection.add("El");
        collection.add("Gibran");
        collection.addAll(List.of("Iegcode", "Zaman", "Now"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println("Remove");

        collection.remove("Ibrahim");
        collection.remove("Al"); // ga ada impacknya karna tidak ada kata yang sama
        collection.removeAll(List.of("Zaman", "Now"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Gibran")
        );

        System.out.println(
                collection.containsAll(List.of("Gibran", "Iegcode"))
        );
    }
}
