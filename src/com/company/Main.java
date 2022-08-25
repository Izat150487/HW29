package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Integer массивден жуп сандарды терип алыныздар жана алардын квадраттарынын эн чонун табыныз.
        Random random = new Random();
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,50);
            System.out.println(array[i]);

        }
        Stream.of(array).filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);

    }
}