package org.example.collections;

import java.util.*;
public class Demo {

    public static void main(String[] args) {

        //Set<String> set = new HashSet<>();
        Set<String> set = new TreeSet<>();

        set.add("Hello");
        set.add("Hola");
        set.add("olo");
        set.add("howdy");
        set.add("howdy");
        // dublicates removed because of sets

        //"Single character, s, variable names okay"
        for (String s : set) {
            System.out.println(s);
        }


        System.out.println();
        List<String> list = new ArrayList< >();

        list.add("Hello");
        list.add("Hola");
        list.add("olo");
        list.add("howdy");
        list.add("howdy");

        Object[] objectArray = list.toArray();

        list.forEach(s -> System.out.println(s));

        System.out.println();

        Queue<String> queue = new LinkedList<>();

        queue.add("Hello");
        queue.add("Hola");
        queue.add("olo");
        queue.add("howdy");
        queue.add("howdy");

        queue.remove();

        queue.forEach(System.out::println);

        System.out.println();

        Deque<String> deque = new LinkedList<>();

        deque.add("Hello");
        deque.add("Hola");
        deque.add("olo");
        deque.add("howdy");
        deque.add("howdy");

        deque.remove();

        deque.forEach(System.out::println);
    }
}

