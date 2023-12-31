package iegcode.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {

        List<String> strings =  new ArrayList<>();
        // List<String> strings = new LinkedList<>();

        strings.add("Ibrahim");
        strings.add("El");

        strings.set(0, "Gibran");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var value : strings){
            System.out.println(value);
        }


    }
}
