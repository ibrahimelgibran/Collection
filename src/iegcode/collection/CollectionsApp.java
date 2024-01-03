package iegcode.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Ibrahim", "El", "Gibran", "Zaman", "Now"));

        System.out.println(list);

        Collections.reverse(list); // kebalikkan
        System.out.println(list);

        Collections.shuffle(list); // penepatan random
        System.out.println(list);
    }
}
