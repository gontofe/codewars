package src.main.java.com.michaelrichardhall.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

//Double Char
//Given a string,you have to return a string in which each character(case-sensitive)is repeated once.
//
//        Examples(Input->Output):
//        *"String"->"SSttrriinngg"
//        *"Hello World"->"HHeelllloo  WWoorrlldd"
//        *"1234!_ "->"11223344!!__  "
//        Good Luck!

public class DoubleChar {
    public static String doubleChar(String s) {
        return Arrays.stream(s.split("")).map(str -> str.repeat(2)).collect(Collectors.joining(""));
    }
}
