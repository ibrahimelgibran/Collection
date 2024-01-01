package iegcode.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Ibrahim");

        Set<String> mutable = new HashSet<>();
        mutable.add("Ibrahim");
        mutable.add("Gibran");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Ibrahim", "Gibran");


        // set.add("Ibrahim"); err
        // set.remove("Ibrahim"); err
    }
}
