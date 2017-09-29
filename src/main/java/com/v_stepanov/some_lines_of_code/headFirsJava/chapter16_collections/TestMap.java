package com.v_stepanov.some_lines_of_code.headFirsJava.chapter16_collections;

import java.util.HashMap;

/**
 * Created by User on 28.09.2017.
 */
public class TestMap {

    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}
