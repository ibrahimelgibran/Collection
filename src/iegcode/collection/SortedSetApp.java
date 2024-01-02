package iegcode.collection;

import iegcode.collection.data.Person;
import iegcode.collection.data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator()); // jika hasil kebalik tambahkan ".reversed()"
        people.add(new Person("Ibrahim"));
        people.add(new Person("El"));
        people.add(new Person("Gibran"));

        for (var person : people){
            System.out.println(person.getName());
        }
    }
}
