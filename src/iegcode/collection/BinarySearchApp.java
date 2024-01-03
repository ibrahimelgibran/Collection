package iegcode.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {

        // mencari dari depan
        List<Integer> list = new ArrayList<>(50);
        for (int i = 1; i < 50 ; i++) {
            list.add(i);
        }

        int index = Collections.binarySearch(list, 33);
        System.out.println(index);

        // bisa menggunakan comparator sendiri mencari dari belakang lebih cepat
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        int index2 = Collections.binarySearch(list, 33);
        System.out.println(index2);
    }
}
