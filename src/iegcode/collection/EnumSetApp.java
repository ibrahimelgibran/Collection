package iegcode.collection;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public static enum Gender{
        MALE, FEMALE, NOT_MONTION
    }
    public static void main(String[] args) {

        // Set<Gender> genders = EnumSet.allOf(Gender.class); // set seluruhnya dalam Gender
        Set<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE); // memasukan set persatu

        for (var gender : genders){
            System.out.println(gender);
        }
    }
}
