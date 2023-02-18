package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

//Two to One
//        Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
//
//        Examples:
//        a = "xyaabbbccccdefww"
//        b = "xxxxyyyyabklmopq"
//        longest(a, b) -> "abcdefklmopqwxy"
//
//        a = "abcdefghijklmnopqrstuvwxyz"
//        longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String[] array = (s1 + s2).split("");
        return Arrays.stream(array)
                .distinct()
                .sorted()
                .collect(Collectors.joining(""));
    }
}
