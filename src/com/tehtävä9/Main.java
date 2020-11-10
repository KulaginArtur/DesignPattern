package com.tehtävä9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        List list = new List();
        ArrayList list1 = new ArrayList();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        list1.add("six");
        list1.add("seven");
        list1.add("eight");
        list1.add("nine");
        list1.add("ten");
        System.out.println(list1);

        System.out.println("List: " + list.convert(list1));

        list.setConverter(new afterTwo());

        System.out.println("List: " + list.convert(list1));

        list.setConverter(new afterThree());

        System.out.println("List: " + list.convert(list1));
    }
}
