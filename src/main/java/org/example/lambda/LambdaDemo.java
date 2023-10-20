package org.example.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaDemo {

    public static void main(String[] args) {

        // x -> x + 2


        // Same thing
        // public int addTwo(int x){
        //    return x + 2;
        //}

        // 4 classes
        // predicate - takes 1 value return a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - takes 1 value and returns 1 value
        Function<Integer, Integer> function = x -> x + 2;

        //Suppier - Takes nothing and returns 1 value
        Supplier<String> supplier = () -> "Hello, Lambda!";

        //Consumer - takes 1 and returns nothing   :: Lambda shorthand for System.out.println(x)
        Consumer<String> consumer = System.out::println;



    }
}
