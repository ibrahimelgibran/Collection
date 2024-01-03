package iegcode.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Ibrahim", "El", "Gibran", "Zaman", "Now"));

        Collections.sort(list);

        for (var value : list ){
            System.out.println(value);
        }

        System.out.println("============");

        // membuat comparator sendiri
        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        // perurutan descending
        Collections.sort(list, reverse);

        for (var value : list){
            System.out.println(value);
        }
    }
}
