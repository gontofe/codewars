package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;
import java.util.Comparator;

//Shortest Word
//Simple, given a string of words, return the length of the shortest word(s).
//
//String will never be empty and you do not need to account for different data types.

public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .min(Comparator.comparing(String::length))
                .map(String::length)
                .orElse(0);
    }
}
