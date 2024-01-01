package iegcode.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        // Set<String> names = new HashSet<>(); data tidak terurut, hashset digunakkan untuk unik tidak bisa douplicat
        Set<String> names = new LinkedHashSet<>(); // data terurut ,meskipun data double

        names.add("Ibrahim");
        names.add("El");
        names.add("Gibran");
        names.add("Ibrahim");
        names.add("El");
        names.add("Gibran");

        for (var name : names){
            System.out.println(name);
        }
    }
}
