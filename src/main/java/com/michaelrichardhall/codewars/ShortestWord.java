package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;

//Shortest Word
//Simple, given a string of words, return the length of the shortest word(s).
//
//String will never be empty and you do not need to account for different data types.

public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
