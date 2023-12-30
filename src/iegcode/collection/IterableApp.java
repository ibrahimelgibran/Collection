package iegcode.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        // Iterable = super interfacenya collection yang bukan MAP
        Iterable<String> names = List.of("Ibrahim", "El", "Gibran");
        for (var name : names){
            System.out.println(name);
        }

        // manualnya
        System.out.println("Iterator");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
