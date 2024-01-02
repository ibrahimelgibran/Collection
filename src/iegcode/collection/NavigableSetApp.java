package iegcode.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Ibrahim", "El", "Gibran", "Zaman", "Now"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> el = names.tailSet("Gibran", true);

        for (var name : el){
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
       // immutable.add("Ups"); err
    }
}
