package iegcode.collection;

import iegcode.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Gibran");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSomeThingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static  void doSomeThingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobby");
    }
}
